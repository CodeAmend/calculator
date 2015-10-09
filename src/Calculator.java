import java.util.Stack;

/**
 * Created by codeamend on 10/9/15.
 */
public class Calculator {

    Stack<Double> stack = new Stack<>();

    public double accumulator() {
        if(stack.size() > 0)
            return stack.peek();
        return 0;
    }

    public void input(double value) {
        stack.push(value);
    }

    public void add() {
        double op2 = stack.pop();
        double op1 = stack.pop();
        stack.push(op1 + op2);
    }

    public void subtract() {
        double op2 = stack.pop();
        double op1 = stack.pop();
        stack.push(op1 - op2);

    }

}
