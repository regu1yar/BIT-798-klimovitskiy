package main.java.figures;


public class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) throws IllegalArgumentException {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Sides length must be positive");
        }

        this.width = width;
        this.height = height;
    }

    public void setWidth(double x) throws IllegalArgumentException {
        if (x <= 0) {
            throw new IllegalArgumentException("Width must be positive");
        }

        width = x;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double y) throws IllegalArgumentException {
        if (y <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }

        height = y;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return width * height;
    }
}
