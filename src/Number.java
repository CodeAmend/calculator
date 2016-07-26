import java.util.Stack;

/**
 * Created by codeamend on 10/9/15.
 */
public class Number implements Operation {

    private double number;

    Number(double number) {
        this.number = number;
    }

    @Override
    public void applyTo(Stack<Double> stack) {
        stack.push(number);
    }
}
