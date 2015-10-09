import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by codeamend on 10/3/15.
 */
public class CalculatorTest {

    @Test
    public void accumulator_default_value() {
        Calculator calc = new Calculator();
        assertEquals(0.0, calc.accumulator());
    }

}
