using System;
using System.Diagnostics;
using System.IO;
using SVLang.Basics.AST;
using SVLang.Core;
using SVLang.Parser;

namespace SVLang.Runner
{
    public class FileRunner
    {
        private readonly FileInfo _file;
        private string _timelog;

        public FileRunner(FileInfo file)
        {
            if (!file.Exists)
            {
                throw new FileNotFoundException("Cannot find file: " + file.FullName, file.FullName);
            }

            _file = file;
        }

        public Expr Run()
        {
            var sw = new Stopwatch();
            sw.Start();

            string code = File.ReadAllText(_file.FullName);
            code = "{" + Environment.NewLine + code + Environment.NewLine + "}";
            Log("Read svl code", sw);

            var ast = new StringParser(code).Run();
            Log("Parsed code", sw);

            var retVal = new Execution(ast).Run();
            Log("Executed code", sw);

            Console.WriteLine("Time usage: ");
            Console.WriteLine(_timelog);
            sw.Stop();
            return retVal;
        }

        private void Log(string section, Stopwatch runningStopwatch)
        {
            runningStopwatch.Stop();
            _timelog += section + ": " + runningStopwatch.ElapsedMilliseconds + "ms" + Environment.NewLine;
            runningStopwatch.Restart();
        }
    }
}
