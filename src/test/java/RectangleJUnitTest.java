import org.testng.annotations.*;
import static org.junit.Assert.*;

public class RectangleJUnitTest {

    private static final double DELTA = 0.0001;

    @Test
    public void testConstructorSetLenghWidht() {
        Rectangle rectangle = new Rectangle(15.0, 9.0);
        assertEquals(15.0, rectangle.getLength(), DELTA);
        assertEquals(9.0, rectangle.getWidth(), DELTA);
    }

    @Test
    public void testSettersUpdatesValues() {
        Rectangle rectangle = new Rectangle(5, 7);
        rectangle.setLength(8.5);
        rectangle.setWidth(9.4);
        assertEquals(8.5, rectangle.getLength(), DELTA);
        assertEquals(9.4, rectangle.getWidth(), DELTA);
    }

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        assertEquals(20.0, rectangle.getArea(), DELTA);
    }
}
