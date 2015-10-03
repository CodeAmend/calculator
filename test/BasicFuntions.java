import calculator.functions.basic.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by codeamend on 10/3/15.
 */
public class BasicFuntions {

    private final double TOLERANCE = 0.00001d;
    @Test
    public void simple_addition() {
        Calculator calc = new Calculator();
        calc.push(7.0);
        calc.push(3.0);
        calc.add();
        assertEquals(10.0, calc.result(), TOLERANCE);
    }
}
