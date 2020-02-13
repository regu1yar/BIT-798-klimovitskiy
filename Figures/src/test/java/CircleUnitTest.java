package test.java;

import main.java.figures.Figure;
import main.java.figures.Circle;
import org.junit.Assert;
import org.junit.Test;

public class CircleUnitTest extends Assert {
    private static final double DELTA = 1e-9;

    @Test(expected = IllegalArgumentException.class)
    public void testCreating() {
        Circle circle = new Circle(1);

        assertEquals(circle.getRadius(), 1, DELTA);

        Circle circleWrong = new Circle(0);
    }

    @Test
    public void testRadiusSetting() {
        Circle circle = new Circle(1);

        circle.setRadius(2);
        assertEquals(circle.getRadius(), 2, DELTA);

        circle.setRadius(3);
        assertEquals(circle.getRadius(), 3, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroRadius() {
        Circle circle = new Circle(1);
        circle.setRadius(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeRadius() {
        Circle circle = new Circle(1);
        circle.setRadius(-1);
    }

    @Test
    public void testAreaEvaluating() {
        double rDouble = 3.65;

        Figure circleDouble = new Circle(rDouble);
        assertEquals(circleDouble.area(), rDouble * rDouble * Math.PI, DELTA);
    }
}
