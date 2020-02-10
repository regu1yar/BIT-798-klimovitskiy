package unitTests;

import figures.Figure;
import figures.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class RectangleUnitTest extends Assert {
    private static final double DELTA = 1e-15;

    @Test(expected = IllegalArgumentException.class)
    public void testCreating() {
        Rectangle rectangle = new Rectangle(1, 2);

        assertEquals(rectangle.getWidth(), 1, DELTA);
        assertEquals(rectangle.getHeight(), 2, DELTA);

        Rectangle rectangleWrong = new Rectangle(0, -1);
    }

    @Test
    public void testSidesSetting() {
        Rectangle rectangle = new Rectangle(1, 1);

        rectangle.setHeight(2);
        assertEquals(rectangle.getHeight(), 2, DELTA);

        rectangle.setHeight(3);
        assertEquals(rectangle.getHeight(), 3, DELTA);

        rectangle.setWidth(2);
        assertEquals(rectangle.getWidth(), 2, DELTA);

        rectangle.setWidth(3);
        assertEquals(rectangle.getWidth(), 3, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroHeight() {
        Rectangle rectangle = new Rectangle(1, 1);
        rectangle.setHeight(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeHeight() {
        Rectangle rectangle = new Rectangle(1, 1);
        rectangle.setHeight(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroWidth() {
        Rectangle rectangle = new Rectangle(1, 1);
        rectangle.setWidth(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeWidth() {
        Rectangle rectangle = new Rectangle(1, 1);
        rectangle.setWidth(-1);
    }

    @Test
    public void testAreaEvaluating() {
        int xInt = 2;
        int yInt = 4;

        Rectangle rectangleInt = new Rectangle(xInt, yInt);
        assertEquals(Double.valueOf(rectangleInt.area()).intValue(), xInt * yInt);

        double xDouble = 3.65;
        double yDouble = 2.1;

        Figure rectangleDouble = new Rectangle(xDouble, yDouble);
        assertEquals(rectangleDouble.area(), xDouble * yDouble, DELTA);
    }
}
