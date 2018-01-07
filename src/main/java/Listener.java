import com.sun.istack.internal.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Listener extends MiniJavaBaseListener {
    Map<String, Integer> vars = new HashMap<String, Integer>();

    Stack<Integer> stack = new Stack<Integer>();

    /*
    @Override
    public void enterProg(@NotNull MiniJavaParser.GoalContext ctx) {
        System.out.println(" ");
    }

    @Override
    public void exitProg(@NotNull MiniJavaParser.GoalContext ctx) {
        System.out.println("exitProg: ");
    }

    @Override
    public void exitExpr(@NotNull MiniJavaParser.GoalContext ctx) {
        System.out.println("exitExpr: ");
    }
    */

    @Override
    public void visitTerminal(TerminalNode node) {
        if (MiniJavaParser.VarDeclarationContext.class.isInstance(node.getText())||
                MiniJavaParser.FieldDeclarationContext.class.isInstance(node.getClass())) {
            Tree.local_var.add(node.getText());
        }
        Tree.local_var.add(node.getText());
        Check(node, Tree.local_var);
    }

    public void Check(TerminalNode node, List<String>vars) {
        List<String>mvars = vars;
        mvars.add("*");
        mvars.add("+");
        mvars.add("-");
        mvars.add("<");
        mvars.add("&&");
        mvars.add(";");
        mvars.add("=");

        if (!mvars.contains(node.getText())) {
            System.out.println("Error: "+node.getSymbol().getLine()+":"+node.getSymbol().getTokenIndex()+ "  "+node.getSymbol().getText()+" not defined.");
        }
    }
}
