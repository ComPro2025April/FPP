package lab4.prog4_4;

import lab4.prog4_4.good.Polygon;
import lab4.prog4_4.good.Rectangle;
import lab4.prog4_4.good.Square;
import lab4.prog4_4.good.Triangle;

public class Test2 {
    public static void main(String[] args) {

        Polygon[] objects = {
                new Square(3),
                new Triangle(4, 5, 6),
                new Rectangle(3, 4),
        };
        //compute areas
        for (Polygon pg : objects) {
            System.out.println("For this " + pg.getClass().getSimpleName());
            System.out.println("\tNumber of sides = " + pg.getNumberOfSides());
            System.out.println("\tPerimeter = " + pg.computePerimeter());
        }

    }
}
