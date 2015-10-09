import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by codeamend on 10/3/15.
 */
public class CalculatorTest {

    private final double TOLERANCE = 0.00001d;
    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void accumulator_default_value() {
        assertEquals(0.0, calc.accumulator(), TOLERANCE);
    }

    @Test
    public void input_one_number() {
        calc.input(4.0);
        assertEquals(4.0, calc.accumulator(), TOLERANCE);
    }

    @Test
    public void add_numbers_at_top_of_stack() {
        calc.input(8.0);
        calc.input(4.0);
        calc.add();
        assertEquals(12.0, calc.accumulator(), TOLERANCE);
    }

    @Test
    public void subtract_numbers_at_top_of_stack() {
        calc.input(8.0);
        calc.input(4.0);
        calc.subtract();
        assertEquals(-4.0, calc.accumulator(), TOLERANCE);
    }



}
