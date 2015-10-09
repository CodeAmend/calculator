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

    public void input(double... value) {
        for(double num : value) {
            calc.input(num);
        }
    }

    @Test
    public void accumulator_default_value() {
        assertEquals(0.0, calc.accumulator(), TOLERANCE);
    }

    @Test
    public void input_one_number() {
        input(4.0);
        assertEquals(4.0, calc.accumulator(), TOLERANCE);
    }

    @Test
    public void add_numbers_at_top_of_stack() {
        input(8.0, 4.0);
        calc.add();
        assertEquals(12.0, calc.accumulator(), TOLERANCE);
    }

    @Test
    public void subtract_numbers_at_top_of_stack() {
        input(4.0, 8.0);
        calc.subtract();
        assertEquals(-4.0, calc.accumulator(), TOLERANCE);
    }

    // refactor of operations should be an object

    @Test
    public void operation_object_add_top_of_stack() {
        input(3.0, 6.0);
        //calc.perform(new Addition());
        //above method added to add()
        calc.add();
        assertEquals(9.0, calc.accumulator(), TOLERANCE);
    }




}
