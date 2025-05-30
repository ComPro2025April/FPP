package lab4.prog4_4.closedcurve.good;

public final class Square extends ClosedCurve implements Polygon {
    private final double side;
    private final static int SIDES = 4;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double computeArea() {
        return side * side;
    }

    @Override
    public int getNumberOfSides() {
        return SIDES;
    }

    @Override
    public double computePerimeter() {
        return 4 * side;
    }
}
