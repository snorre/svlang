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
        private readonly Expr _code;
        private Dictionary<string, BuiltinBase> _builtins;
        private List<FileInfo> _dllsToReference;


        public Execution(Expr code)
        {
            _code = code;

            LoadBuiltins();
            SetFlagsOnAst(_code);
        }

        public Expr Run()
        {
            var csCode = GenerateCsCode();

            var csc = new CsCompiler();
            var t = csc.BuildType(_dllsToReference, csCode);

            var m = t.GetMethod(CsGenerator.EntryMethodName);
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

        private void SetFlagsOnAst(Expr parent)
        {
            var children = parent.GetChildExprs();
            for (int i = 0; i < children.Length; i++)
            {
                var child = children[i];

                child.IsInCodeblockAndIsNotLast = parent.IsCodeblock() && (i < children.Length - 1);

                SetFlagsOnAst(child);
            }
        }

        private ValueSingle CreateValueSingleIfNeeded(object obj)
        {
            return
                obj is ValueSingle
                    ? (ValueSingle)obj
                    : new ValueSingle(obj);
        }

        public string GenerateCsCode()
        {
            var atc = new CsGenerator(_code, _builtins);
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