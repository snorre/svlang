using System;
using System.IO;

namespace SVLang.Runner
{
    public class Program
    {
        public static void Main(string[] args)
        {
            new Program().Run(args);
        }

        private void Run(string[] args)
        {
            try
            {
                var file = InterpretArgs(args);
                var fr = new FileRunner(file);
                var retVal = fr.Run();
                Console.WriteLine(retVal);
            }
            catch (Exception e)
            {
                Console.WriteLine("Error occurred: " + e.Message);
                Console.WriteLine(e.StackTrace);
            }
        }

        private FileInfo InterpretArgs(string[] args)
        {
            return new FileInfo(args[0]);
        }
    }
}
