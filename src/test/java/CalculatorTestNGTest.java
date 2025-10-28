import org.testng.annotations.*;
import static org.testng.Assert.*;

public class CalculatorTestNGTest {

    private Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(calculator.add(2, 8), 10);
        assertEquals(calculator.add(-2, -3), -5);
    }

    @Test
    public void testSubtract() {
        assertEquals(calculator.subtract(5, 4), 1);
        assertEquals(calculator.subtract(3, 5), -2);
    }

    @Test
    public void testMultiply() {
        assertEquals(calculator.multiply(5, 4), 20);
        assertEquals(calculator.multiply(6, 0), 0);
    }

    @Test
    public void testDivide() {
        assertEquals(calculator.divide(9, 3), 3);
        assertEquals(calculator.divide(-6, -3), 2);
        assertEquals(calculator.divide(-6, 3), -2);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(5, 0);
    }
}
