package lab5.prog5_3;

import java.util.Arrays;

public class MainLambda {
    public static void main(String[] args) {
        String[] arr = {"elephant", "dog", "zebra", "cat", "hippo"};
        String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };

        StringSort sorter = new StringSort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        sorter.stringSort(arr);
        System.out.println(Arrays.asList(arr));
    }
}

