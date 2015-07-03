using System;
using System.IO;
using SVLang.Core;
using SVLang.Parser;

namespace SVLang.Runner
{
    public class FileRunner
    {
        private readonly FileInfo _file;

        public FileRunner(FileInfo file)
        {
            if (!file.Exists)
            {
                throw new FileNotFoundException("Cannot find file: " + file.FullName, file.FullName);
            }

            _file = file;
        }

        public object Run()
        {
            string code = File.ReadAllText(_file.FullName);
            code = "{" + Environment.NewLine + code + Environment.NewLine + "}";
            var ast = new StringParser(code).Run();
            var retVal = new Execution(ast).Run();
            return retVal;
        }
    }
}
