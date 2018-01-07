/**
 * Created by frankqian on 2018/1/7.
 */

import com.sun.istack.internal.NotNull;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Tree {

    public static void main(String[] args) throws Exception{

        String testStr= "a+b*3";

        MiniJavaLexer lexer = new MiniJavaLexer(
                                new ANTLRInputStream(String.valueOf(testStr)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MiniJavaParser parser = new MiniJavaParser(tokens);
        //ParseTree tree = parser.prog();


        ParseTreeWalker walker = new ParseTreeWalker();

        //walker.walk(new Listener(), tree);
    }

}
