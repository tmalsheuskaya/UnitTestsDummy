import org.junit.*;

public class CalculatorJUnitTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(5, calculator.add(2, 3));
        Assert.assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(1, calculator.subtract(4, 3));
        Assert.assertEquals(-1, calculator.subtract(3, 4));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(12, calculator.multiply(3, 4));
        Assert.assertEquals(0, calculator.multiply(5, 0));

    }

    @Test
    public void testDivide() {
        Assert.assertEquals(2, calculator.divide(6, 3));
        Assert.assertEquals(-2, calculator.divide(-6, 3));
        Assert.assertEquals(2, calculator.divide(-6, -3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(5, 0);
    }

}
