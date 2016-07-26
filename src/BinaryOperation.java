import java.util.Stack;

/**
 * Created by codeamend on 10/9/15.
 */
abstract class BinaryOperation implements Operation {

    @Override
    public void applyTo(Stack<Double> stack) {
        if(stack.size() > 0) {
            stack.push(calculate(stack.pop(), stack.pop()));
        }
    }

    abstract double calculate(double op2, double op1);
}
