package lab2.prog2_8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Prog2_8Test {
    @Test
    public void testMin1() {
        int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int expected = -22;
        int result = Prog2_8.min(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testMin2() {
        int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -23};
        int expected = -23;
        int result = Prog2_8.min(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testMin3() {
        int[] arr = {2, -1, 0, 23};
        int expected = -1;
        int result = Prog2_8.min(arr);
        assertEquals(expected, result);
    }
}

