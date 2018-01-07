/**
 * Created by frankqian on 2018/1/7.
 */

import com.sun.istack.internal.NotNull;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.io.File.*;
import java.util.*;

public class Tree {
    public static List<String> local_var= new ArrayList<String>();
    public static void main(String[] args) throws Exception{
        FileInputStream f = new FileInputStream("/Users/frankqian/Tree/src/test/factorial.java");

        MiniJavaLexer lexer = new MiniJavaLexer(
                                new ANTLRInputStream(f));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MiniJavaParser parser = new MiniJavaParser(tokens);
        ParseTree tree = parser.goal();


        ParseTreeWalker walker = new ParseTreeWalker();


        walker.walk(new Listener(), tree);
    }

}
