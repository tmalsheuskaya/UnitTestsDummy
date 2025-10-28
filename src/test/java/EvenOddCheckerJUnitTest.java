import org.junit.*;

public class EvenOddCheckerJUnitTest {

    @Test
    public void  testEvenNumber() {
        Assert.assertTrue(EvenOddChecker.check(8));
    }

    @Test
    public void testOddNumber() {
        Assert.assertFalse(EvenOddChecker.check(7));
    }

    @Test
    public void testNegativeEvenNumber() {
        Assert.assertTrue(EvenOddChecker.check(-6));
    }

    @Test
    public void testNegativeOddNumber() {
        Assert.assertFalse(EvenOddChecker.check(-5));
    }

    @Test
    public void testZero() {
        Assert.assertTrue(EvenOddChecker.check(0));
    }
}
