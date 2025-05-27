package lab2.prog2_8;

public class Prog2_8 {
    static int min(int[] arrayOfInts){
        int min = 0;

        if(arrayOfInts.length > 0) {
            min = arrayOfInts[0];
            for (int i = 1; i < arrayOfInts.length; i++)
                if (arrayOfInts[i] < min)
                    min = arrayOfInts[i];
        }

        return min;
    }
}
