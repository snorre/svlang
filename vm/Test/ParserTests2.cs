using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using SVLang.Parser.SubParsers;

namespace SVLang.Test
{
    [TestClass]
    public class ParserTests2
    {
        [TestMethod]
        public void Antlr4_Learn()
        {
            var code = "hello world";
            var sr = new StringReader(code);
            var lexer = new SVLangLexer(new AntlrInputStream(sr));
            var tokenStream = new CommonTokenStream(lexer);
            var parser = new SVLangParser(tokenStream);
            var tree = parser.r();
            Console.WriteLine(tree.ToStringTree(parser));
        }
    }
}
