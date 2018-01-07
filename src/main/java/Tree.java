/**
 * Created by frankqian on 2018/1/7.
 */

import com.sun.istack.internal.NotNull;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Parser;

import java.util.HashMap;
import java.util.Map;

public class Tree {

    public static void main(String[] args) throws Exception{

        String[] testStr={
                "2",
                "a+b+3",
                "(a-b)+3",
                "a+(b*3"
        };

        MinJavaLexer lexer = new MinJavaLexer(
                                new ANTLRInputStream(String.valueOf(testStr)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MinJavaParser parser = new MinJavaParser(tokens);
        ParseTree tree = parser.prog();


        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new MinJavaListener() {
            public void enterProg(MinJavaParser.ProgContext ctx) {

            }

            public void exitProg(MinJavaParser.ProgContext ctx) {

            }

            public void enterStat(MinJavaParser.StatContext ctx) {

            }

            public void exitStat(MinJavaParser.StatContext ctx) {

            }

            public void enterExpr(MinJavaParser.ExprContext ctx) {

            }

            public void exitExpr(MinJavaParser.ExprContext ctx) {

            }

            public void enterMultExpr(MinJavaParser.MultExprContext ctx) {

            }

            public void exitMultExpr(MinJavaParser.MultExprContext ctx) {

            }

            public void enterAtom(MinJavaParser.AtomContext ctx) {

            }

            public void exitAtom(MinJavaParser.AtomContext ctx) {

            }

            public void visitTerminal(TerminalNode terminalNode) {

            }

            public void visitErrorNode(ErrorNode errorNode) {

            }

            public void enterEveryRule(ParserRuleContext parserRuleContext) {

            }

            public void exitEveryRule(ParserRuleContext parserRuleContext) {

            }
        }, tree);
        System.out.println(loader.props);
    }

}
public class ShortToString extends MinJavaBaseListener {
    Map<String, Integer> vars = new HashMap<String, Integer>();
    @Override
    public void enterInit(@NotNull MinJavaParser.ProgContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void exitInit(@NotNull MinJavaParser.ProgContext ctx) {
        System.out.print(" ");
    }

    @Override
    public void enterValue(@NotNull MinJavaParser. ctx) {
        System.out.print(" ");
    }
}