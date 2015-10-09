import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by codeamend on 10/3/15.
 */
public class CalculatorTest {

    private final double TOLERANCE = 0.00001d;

    @Test
    public void accumulator_default_value() {
        Calculator calc = new Calculator();
        assertEquals(0.0, calc.accumulator(), TOLERANCE);
    }

    @Test
    public void input_one_number() {
        Calculator calc = new Calculator();
        calc.input(4.0);
        assertEquals(4.0, calc.accumulator(), TOLERANCE);
    }

}
