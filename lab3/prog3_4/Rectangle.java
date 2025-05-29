package lab3.prog3_4;

public final class Rectangle {
    private final double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double computeArea() {
        return width * length;
    }
}
