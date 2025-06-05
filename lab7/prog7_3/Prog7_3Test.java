package lab7.prog7_3;

import org.junit.Test;

import static lab7.prog7_3.Prog7_3.merge;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;

public class Prog7_3Test {
    @Test
    public void testCase1(){
        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(2, 5, 8, 11));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(1, 3, 6));
        LinkedList<Integer> l3 = new LinkedList<>(Arrays.asList(1, 2, 3, 5, 6, 8, 11));
        assertEquals(l3,merge(l1,l2));
    }

    @Test
    public void testCase2(){
        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(0, 5, 8, 11));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(1, 3, 6));
        LinkedList<Integer> l3 = new LinkedList<>(Arrays.asList(0, 1, 3, 5, 6, 8, 11));
        assertEquals(l3,merge(l1,l2));
    }

    @Test
    public void testCase3(){
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(1, 3, 6));
        LinkedList<Integer> l3 = new LinkedList<>(Arrays.asList(1, 3, 6));
        assertEquals(l3,merge(l1,l2));
    }

    @Test
    public void testCase4(){
        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(0, 5, 8, 11));
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> l3 = new LinkedList<>(Arrays.asList(0, 5, 8, 11));
        assertEquals(l3,merge(l1,l2));
    }

    @Test
    public void testCase5(){
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> l3 = new LinkedList<>();
        assertEquals(l3,merge(l1,l2));
    }
}
