using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.IO;
using System.Linq;
using System.Reflection;
using Castle.Core.Internal;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Core
{
    public class Execution
    {
        private bool _isPrepared;
        private Dictionary<string, BuiltinBase> _builtins;
        private List<FileInfo> _dllsToReference; 


        public Execution Prepare()
        {
            LoadBuiltins();
            _isPrepared = true;
            return this;
        }

        public Expr Run(Expr code)
        {
            if (!_isPrepared)
            {
                throw Error.Panic("Execution not prepared, prepare before run.");
            }

            var csCode = GenerateCsCode(code);

            var csc = new CsCompiler();
            var t = csc.BuildType(_dllsToReference, csCode);

            var m = t.GetMethod(AstToCs.EntryMethodName);
            var ti = Activator.CreateInstance(t);

            object result = m.Invoke(ti, new object[0]);
            //object obj = t.GetMethod(AstToCs.EntryMethodName).Invoke(null, new string[] { null });

            if (result is List<dynamic>) // TODO Find uses of List<dynamic> and move to a constant
            {
                var list = (List<dynamic>)result;
                var values = list.ConvertAll(CreateValueSingleIfNeeded).ToArray();
                return new ValueList(values);
            }

            return CreateValueSingleIfNeeded(result);
        }

        private ValueSingle CreateValueSingleIfNeeded(object obj)
        {
            return
                obj is ValueSingle
                    ? (ValueSingle)obj
                    : new ValueSingle(obj);
        }

        public string GenerateCsCode(Expr code) // public because of debug in tests
        {
            var atc = new AstToCs(code, _builtins);
            var csCode = atc.GenerateCsCode();
            return csCode;
        }

        [SuppressMessage("ReSharper", "PossibleNullReferenceException")]
        private void LoadBuiltins()
        {
            _builtins = new Dictionary<string, BuiltinBase>();
            _dllsToReference = new List<FileInfo>();

            var baseType = typeof(BuiltinBase);
            var currentFolder = new FileInfo(Assembly.GetExecutingAssembly().Location).Directory;
            var allDlls = currentFolder.GetFiles("*.dll");

            foreach (var dll in allDlls)
            {
                var asm = LoadAssemblyFromFile(dll);
                if (asm == null)
                {
                    continue;
                }

                var builtinsFound =
                    asm
                        .GetTypes()
                        .FindAll(t => baseType.IsAssignableFrom(t) && t != baseType)
                        .ConvertAll(t => (BuiltinBase)Activator.CreateInstance(t));

                if (builtinsFound.Any())
                {
                    _dllsToReference.Add(dll);
                    builtinsFound.ForEach(b => _builtins.Add(b.Name, b));
                }
            }

            //var allBuiltins =
            //    currentFolder
            //        .GetFiles("*.dll")
            //        .Select(LoadAssemblyFromFile)
            //        .Where(a => a != null)
            //        .SelectMany(a => a.GetTypes())
            //        .Where(t => baseType.IsAssignableFrom(t) && t != baseType)
            //        .Select(t => (BuiltinBase)Activator.CreateInstance(t))
            //        .ToList();

            //allBuiltins.ForEach(b => b.SetExecutionEngine(this));

            //allBuiltins
            //    .ForEach(i => Memory.AddExpr(i.Name, i.ParameterNames, i));

            //_builtins = allBuiltins.ToDictionary(b => b.Name);

        }

        private Assembly LoadAssemblyFromFile(FileInfo file)
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