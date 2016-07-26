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
        perform(new Number(value));
    }

    public void add() {
        perform(new Addition());
    }

    public void subtract() {
        perform(new Subtraction());

    }

    public void perform(Operation operation) {
        operation.applyTo(stack);
    }

}
