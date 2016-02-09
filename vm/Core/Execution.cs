using System;
using SVLang.Basics;
using SVLang.Basics.AST;

namespace SVLang.Core
{
    public class Execution
    {
        private bool _isPrepared;

        public Execution Prepare()
        {
            //LoadBuiltins();
            _isPrepared = true;
            return this;
        }

        public Expr Run(Expr code)
        {
            if (!_isPrepared)
            {
                throw Error.Panic("Execution not prepared, prepare before run.");
            }

            var atc = new AstToCsDom();
            var csDom = atc.BuildDom(code);

            var csc = new CsCompiler();
            var t = csc.BuildType(csDom);

            var m = t.GetMethod(AstToCsDom.EntryMethodName);
            var ti = Activator.CreateInstance(t);

            object result = m.Invoke(ti, new object[0]);
            //object result = t.GetMethod(AstToCsDom.EntryMethodName).Invoke(null, new string[] { null });

            return new ValueSingle(result);
        }

        //[SuppressMessage("ReSharper", "PossibleNullReferenceException")]
        //private void LoadBuiltins()
        //{
        //    var baseType = typeof(BuiltinFunction);
        //    var currentFolder = new FileInfo(Assembly.GetExecutingAssembly().Location).Directory;
        //    var allBuiltins =
        //        currentFolder
        //            .GetFiles("*.dll")
        //            .Select(LoadFile)
        //            .Where(a => a != null)
        //            .SelectMany(a => a.GetTypes())
        //            .Where(t => baseType.IsAssignableFrom(t) && t != baseType)
        //            .Select(t => (BuiltinFunction)Activator.CreateInstance(t))
        //            .ToList();

        //    allBuiltins.ForEach(b => b.SetExecutionEngine(this));

        //    allBuiltins
        //        .ForEach(i => Memory.AddExpr(i.Name, i.ParameterNames, i));
        //}

        //private Assembly LoadFile(FileInfo file)
        //{
        //    try
        //    {
        //        return Assembly.LoadFile(file.FullName);
        //    }
        //    catch (Exception)
        //    {
        //        return null;
        //    }
        //}
    }
}