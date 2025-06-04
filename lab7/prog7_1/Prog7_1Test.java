package lab7.prog7_1;

import org.junit.Test;

import static lab7.prog7_1.Prog7_1.power;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Prog7_1Test {
    @Test
    public void testCase1(){
        double a = power(0, 0);
        double expected = 0;
        assertEquals(expected, a, 0.0);
    }

    @Test
    public void testCase2(){
        double a = power(0, 10);
        double expected = 0;
        assertEquals(expected, a, 0.0);
    }

    @Test
    public void testCase3(){
        double a = power(2, 10);
        double expected = 1024;
        assertEquals(expected, a, 0.0);
    }

    @Test
    public void testCase4(){
        double a = power(2, 0);
        double expected = 1;
        assertEquals(expected, a, 0.0);
    }

    @Test
    public void testCase5(){
        double a = power(-2, 3);
        double expected = -8;
        assertEquals(expected, a, 0.0);
    }

    @Test
    public void testCase6(){
        double a = power(2, -3);
        double expected = 0;
        assertEquals(expected, a, 0.0);
    }
}
