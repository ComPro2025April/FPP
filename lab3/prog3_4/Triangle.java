package lab3.prog3_4;

import java.util.concurrent.TransferQueue;

public final class Triangle {
    private final double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public double computeArea() {
        return (double) 1 / 2 * base * height;
    }
}
