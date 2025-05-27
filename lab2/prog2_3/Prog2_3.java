package lab2.prog2_3;


public class Prog2_3 {
    public static void main(String[] args) {
        float a = 1.27f, b = 3.881f, c = 9.6f;

        System.out.println("the sum of the floats as an integer, obtained by casting the sum to type int : " + (int) (a + b + c));
        System.out.println("the sum of the floats as an integer, obtained by rounding the sum to the nearest " +
                "integer, using the Math.round function :" + Math.round(a + b + c));
    }
}
