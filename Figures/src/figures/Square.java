package figures;

public class Square implements Figure {
    private double side;

    public Square (double side) throws IllegalArgumentException {
        if (side <= 0) {
            throw new IllegalArgumentException("Side's length must be positive");
        }

        this.side = side;
    }

    public void setSide(double x) throws IllegalArgumentException {
        if (x <= 0) {
            throw new IllegalArgumentException("Side length must be positive");
        }

        side = x;
    }

    public double getSide() {
        return side;
    }

    public double area() {
        return side * side;
    }
}
