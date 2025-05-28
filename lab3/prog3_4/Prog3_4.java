package lab3.prog3_4;

public class Prog3_4 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 6.95);
        Rectangle rectangle = new Rectangle(9, 4);
        Circle circle = new Circle(4.3177);
        System.out.println("Area of Triangle is " + triangle.computeArea());
        System.out.println("Area of Rectangle is " + rectangle.computeArea());
        System.out.println("Area of Circle is " + String.format("%.2f", circle.computeArea()));
    }
}
