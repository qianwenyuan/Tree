import com.sun.istack.internal.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Listener extends MiniJavaBaseListener {
    Map<String, Integer> vars = new HashMap<String, Integer>();

    Stack<Integer> stack = new Stack<Integer>();

    /*
    @Override
    public void enterProg(@NotNull MiniJavaParser.ProgContext ctx) {
        System.out.println(" ");
    }

    @Override
    public void exitProg(@NotNull MiniJavaParser.ProgContext ctx) {
        System.out.println("exitProg: ");
    }

    @Override
    public void exitExpr(@NotNull MiniJavaParser.ProgContext ctx) {
        System.out.println("exitExpr: ");
    }
    */
    @Override
    public void visitTerminal(TerminalNode node) {
        if (node.getText().equals("*")) {
            System.out.println(".." + node.getChild(1).getText());
        }

        System.out.println("Terminal: "+node.getText());
    }
}
