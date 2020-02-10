package figures;

public class Circle implements Figure {
    private double radius;

    public Circle(double r) throws IllegalArgumentException {
        if (r <= 0) {
            throw new IllegalArgumentException("Radius length must be positive");
        }

        radius = r;
    }

    public void setRadius(double r) throws IllegalArgumentException {
        if (r <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }

        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
