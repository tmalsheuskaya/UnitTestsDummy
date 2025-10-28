import org.testng.annotations.Test;
import org.testng.Assert;

public class RectangleTestNGTest {

    private static final double DELTA = 0.0001;

    @Test
    public void testConstructorSetLengthWidth() {
        Rectangle rectangle = new Rectangle(15.0, 9.0);
        Assert.assertEquals(rectangle.getLength(), 15.0, DELTA);
        Assert.assertEquals(rectangle.getWidth(), 9.0, DELTA);
    }

    @Test
    public void testSettersUpdatesValues() {
        Rectangle rectangle = new Rectangle(5.0, 7.0);
        rectangle.setLength(8.5);
        rectangle.setWidth(9.4);
        Assert.assertEquals(rectangle.getLength(), 8.5, DELTA);
        Assert.assertEquals(rectangle.getWidth(), 9.4, DELTA);
    }

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        Assert.assertEquals(rectangle.getArea(), 20.0, DELTA);
    }
}
