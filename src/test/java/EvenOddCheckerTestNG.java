import org.testng.Assert;
import org.testng.annotations.Test;

public class EvenOddCheckerTestNG {

    @Test
    public void testEvenNumber() {
        Assert.assertTrue(EvenOddChecker.check(2));
    }

    @Test
    public void testOddNumber() {
        Assert.assertFalse(EvenOddChecker.check(5));
    }

    @Test
    public void testNegativeEvenNumber() {
        Assert.assertTrue(EvenOddChecker.check(-4));
    }

    @Test
    public void testNegativeOddNumber() {
        Assert.assertFalse(EvenOddChecker.check(-9));
    }

    @Test
    public void testZero() {
        Assert.assertTrue(EvenOddChecker.check(0));
    }
}
