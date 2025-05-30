package lab4.prog4_2.closedcurve.good;

public class Rectangle extends ClosedCurve{
    private final double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double computeArea() {
        return width * length;
    }
}
