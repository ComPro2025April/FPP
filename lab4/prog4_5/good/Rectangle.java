package lab4.prog4_5.good;


public class Rectangle implements Polygon {
    private final double width, length;
    private static final int SIDES = 4;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double[] getArrayOfSides() {
        return new double[0];
    }
}
