package lab4.prog4_4.closedcurve.good;

public class Rectangle extends ClosedCurve implements Polygon {
    private final double width, length;
    private static final int SIDES = 4;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double computeArea() {
        return width * length;
    }

    @Override
    public int getNumberOfSides() {
        return SIDES;
    }

    @Override
    public double computePerimeter() {
        return 2 * (width + length);
    }
}
