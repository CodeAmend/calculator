import java.util.Stack;

/**
 * Created by codeamend on 10/9/15.
 */
public class Addition implements Operation {

    @Override
    public void execute(Stack<Double> stack) {
        double n2 = stack.pop();
        double n1 = stack.pop();
        stack.push(n1 + n2);
    }
}
