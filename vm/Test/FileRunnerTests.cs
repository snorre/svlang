using System.IO;
using System.Linq;
using System.Reflection;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using SVLang.Core.AST;
using SVLang.Runner;

namespace SVLang.Test
{
    [TestClass]
    public class FileRunnerTests : TestBase
    {
        [TestMethod]
        public void simple_file()
        {
            FilePrints(1, "return_1.svl");
        }

        [TestMethod]
        public void function_call()
        {
            FilePrints(123, "function_call.svl");
        }

        #region Helpers

        private void FilePrints(object expected, string fileName)
        {
            var file = PrepFile(fileName);
            var retVal = new FileRunner(file).Run();
            Assert.AreEqual(expected, retVal);
        }

        private FileInfo PrepFile(string fileName)
        {
            var fullName = Assembly.GetExecutingAssembly().GetManifestResourceNames().Single(res => res.EndsWith(fileName));

            // ReSharper disable PossibleNullReferenceException
            var folder = new FileInfo(Path.GetTempFileName()).Directory.FullName;
            // ReSharper restore PossibleNullReferenceException
            var newTempFile = folder + Path.DirectorySeparatorChar + fullName;

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
