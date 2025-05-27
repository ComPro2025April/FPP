package lab2.prog2_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog2_6 {
    public static String[] removeDups(String[] arr) {
        List<String> newList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!newList.contains(arr[i])) {
                newList.add(arr[i]);
            }
        }

        return newList.toArray(new String[0]);
    }
    public static void main(String[] args) {
        String[] uniqueWords = {"horse", "dog", "cat", "horse","dog"};
        System.out.println(Arrays.toString(removeDups(uniqueWords)));
    }
}
