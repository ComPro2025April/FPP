package lab4.prog4_5.good;


public final class Square implements Polygon {
    private final double side;
    private final static int SIDES = 4;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double[] getArrayOfSides() {
        return new double[]{side, side, side, side};
    }
}
