package lab8.prog8_5;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MyTableTest {
    MyTable t;

    @Before
    public void initCase(){
        t = new MyTable();
        t.add('a', "Andrew");
        t.add('b',"Billy");
        t.add('c',"Charlie");
    }

    @Test
    public void testCase1(){
        String expected = """
                            a->Andrew
                            b->Billy
                            c->Charlie""";
        assertEquals(expected, t.toString().trim());
    }

    @Test
    public void testCase2(){
        String expected = "Charlie";
        assertEquals(expected, t.get('c'));
    }

    @Test
    public void testCase3(){
        String expected = null;
        assertEquals(expected, t.get('f'));
    }

    @Test
    public void testCase4(){
        String expected = null;
        assertEquals(expected, t.get(' '));
    }
}
