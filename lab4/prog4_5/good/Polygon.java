package lab4.prog4_5.good;

public interface Polygon {
    //returns in an array all sides of the polygon
    //example: For a rectangle, return would be [width, width,
    // length, length]
    public double[] getArrayOfSides();

    //returns the sum of the values in arr
    static double sum(double[] arr) {
        double total = 0;
        for (double v : arr) {
            total += v;
        }
        return total;
    }

    //returns the perimeter of the polygon
    default double computePerimeter() {
        return sum(getArrayOfSides());
    }
}
