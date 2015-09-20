using System.IO;
using System.Linq;
using System.Reflection;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using SVLang.Basics.AST;
using SVLang.Runner;

namespace SVLang.Test
{
    [TestClass]
    public class FileRunnerTests : TestBase
    {
        [TestMethod]
        public void Simple_file()
        {
            FilePrints(V(1), "return_1.svl");
        }

        [TestMethod]
        public void Function_call()
        {
            FilePrints(V(123), "function_call.svl");
        }

        [TestMethod]
        public void File_with_print()
        {
            FilePrints(V(123), "builtin_print.svl");
            OutputMustBe("hello world!");
        }

        [TestMethod]
        public void FizzBuzz()
        {
            FilePrints(Value.Void, "fizzbuzz.svl");
            OutputMustBe(
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"
            );
        }

        #region Helpers

        private void FilePrints(Expr expected, string fileName)
        {
            FileInfo file = null;
            try
            {
                file = PrepFile(fileName);
                var retVal = new FileRunner(file).Run();
                PrintSection("Execution result", retVal.ToString());
                Assert.AreEqual(expected, retVal);
            }
            finally
            {
                file?.Delete();
            }
        }

        private FileInfo PrepFile(string fileName)
        {
            var fullName = Assembly.GetExecutingAssembly().GetManifestResourceNames().Single(res => res.EndsWith(fileName));

            // ReSharper disable PossibleNullReferenceException
            var newTempFile = new FileInfo(Path.GetTempFileName()).FullName;
            // ReSharper restore PossibleNullReferenceException

            using (var input = Assembly.GetExecutingAssembly().GetManifestResourceStream(fullName))
            {
                using (var output = File.OpenWrite(newTempFile))
                {
                    var buffer = new byte[8 * 1024];
                    int len;
                    // ReSharper disable PossibleNullReferenceException
                    while ((len = input.Read(buffer, 0, buffer.Length)) > 0)
                    // ReSharper restore PossibleNullReferenceException
                    {
                        output.Write(buffer, 0, len);
                    }
                }
            }

            return new FileInfo(newTempFile);
        }

        #endregion
    }
}
