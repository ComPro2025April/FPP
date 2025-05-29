package lab3.prog3_4;

import lab2.prog2_8.Prog2_8;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Prog3_4Test {
    @Test
    public void testCase1() {
        Triangle triangle = new Triangle(10, 6.95);
        Rectangle rectangle = new Rectangle(9, 4);
        Circle circle = new Circle(4.3177);

        assertEquals(34.75, triangle.computeArea(), 0.0);
        assertEquals(36.0, rectangle.computeArea(), 0.0);
        assertEquals(58.567245628167164 , circle.computeArea(),1e-10);
    }
}
