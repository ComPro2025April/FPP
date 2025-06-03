package lab5.prog5_3;

import java.util.Arrays;
import java.util.Comparator;

public class MainAnonymous {
    public static void main(String[] args) {
        String[] arr = {"elephant", "dog", "zebra", "cat", "hippo"};
        String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };

        StringSort sorter = new StringSort(new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        sorter.stringSort(testStrings);
        System.out.println(Arrays.asList(testStrings));
    }
}

