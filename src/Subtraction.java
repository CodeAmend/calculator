import java.util.Stack;

/**
 * Created by codeamend on 10/9/15.
 */
public class Subtraction extends BinaryOperation {

    @Override
    double calculate(double op2, double op1) {
        return op1 - op2;
    }

}
