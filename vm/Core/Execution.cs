using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.IO;
using System.Linq;
using System.Reflection;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Core
{
    public class Execution
    {
        private bool _isPrepared;
        private Dictionary<string, IBuiltIn> _builtins; 


        public Execution Prepare()
        {
            _builtins = LoadBuiltins();
            _isPrepared = true;
            return this;
        }

        public Expr Run(Expr code)
        {
            if (!_isPrepared)
            {
                throw Error.Panic("Execution not prepared, prepare before run.");
            }

            var atc = new AstToCsDom(code, _builtins);
            var csDom = atc.BuildDom();

            var csc = new CsCompiler();
            var t = csc.BuildType(csDom);

            var m = t.GetMethod(AstToCsDom.EntryMethodName);
            var ti = Activator.CreateInstance(t);

            object result = m.Invoke(ti, new object[0]);
            //object result = t.GetMethod(AstToCsDom.EntryMethodName).Invoke(null, new string[] { null });

            return new ValueSingle(result);
        }

        [SuppressMessage("ReSharper", "PossibleNullReferenceException")]
        private Dictionary<string, IBuiltIn> LoadBuiltins()
        {
            var baseType = typeof(IBuiltIn);
            var currentFolder = new FileInfo(Assembly.GetExecutingAssembly().Location).Directory;
            var allBuiltins =
                currentFolder
                    .GetFiles("*.dll")
                    .Select(LoadFile)
                    .Where(a => a != null)
                    .SelectMany(a => a.GetTypes())
                    .Where(t => baseType.IsAssignableFrom(t) && t != baseType)
                    .Select(t => (IBuiltIn) Activator.CreateInstance(t))
                    .ToList();

            //allBuiltins.ForEach(b => b.SetExecutionEngine(this));

            //allBuiltins
            //    .ForEach(i => Memory.AddExpr(i.Name, i.ParameterNames, i));

            return allBuiltins.ToDictionary(b => b.Name);
        }

        private Assembly LoadFile(FileInfo file)
        {
            try
            {
                return Assembly.LoadFile(file.FullName);
            }
            catch (Exception)
            {
                return null;
            }
        }
    }
}