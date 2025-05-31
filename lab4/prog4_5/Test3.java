package lab4.prog4_5;

import lab4.prog4_5.good.Polygon;
import lab4.prog4_5.good.Rectangle;
import lab4.prog4_5.good.Square;
import lab4.prog4_5.good.Triangle;

public class Test3 {

    public static void main(String[] args) {
        Polygon[] objects = {
                new Square(3),
                new Triangle(4, 5, 6),
                new Rectangle(3, 4),
        };
        //compute areas
        for (Polygon pg : objects) {
            System.out.println("For this " + pg.getClass().getSimpleName());
            System.out.println("\tPerimeter = " + pg.computePerimeter());
        }
    }
}
