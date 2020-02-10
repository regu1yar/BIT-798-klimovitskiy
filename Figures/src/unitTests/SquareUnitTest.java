package unitTests;

import figures.Figure;
import figures.Square;
import org.junit.Assert;
import org.junit.Test;

public class SquareUnitTest extends Assert {
    private static final double DELTA = 1e-15;

    @Test(expected = IllegalArgumentException.class)
    public void testCreating() {
        Square square = new Square(1);

        assertEquals(square.getSide(), 1, DELTA);

        Square squareWrong = new Square(0);
    }

    @Test
    public void testSideSetting() {
        Square square = new Square(1);

        square.setSide(2);
        assertEquals(square.getSide(), 2, DELTA);

        square.setSide(3);
        assertEquals(square.getSide(), 3, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroSide() {
        Square square = new Square(1);
        square.setSide(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSide() {
        Square square = new Square(1);
        square.setSide(-1);
    }

    @Test
    public void testAreaEvaluating() {
        int xInt = 2;

        Square squareInt = new Square(xInt);
        assertEquals(Double.valueOf(squareInt.area()).intValue(), xInt * xInt);

        double xDouble = 3.65;

        Figure squareDouble = new Square(xDouble);
        assertEquals(squareDouble.area(), xDouble * xDouble, DELTA);
    }
}
