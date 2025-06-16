package lab7.prog7_2;

import java.util.Arrays;

public class MinSort {
//    this one works too
//    public String sort(String s) {
//        if (s == null || s.isEmpty()) return s;
//        char min = s.charAt(0);
//        int minPos = 0;
//        for (int i = 1; i < s.length(); i++) {
//            char tempChar = s.charAt(i);
//            if (tempChar < min) {
//                min = tempChar;
//                minPos = i;
//            }
//        }
//        String remaining = s.substring(0, minPos) + s.substring(minPos + 1);
//        return min + sort(remaining);
//    }

    public String sort(String s) {
        if (s == null || s.length() <= 1) return s;

        int minPos = findMinPos(s);

        // Swap character at index 0 with the minimum character
        char minChar = s.charAt(minPos);
        char firstChar = s.charAt(0);

        // Build new string with swapped characters
        String swapped = minChar + s.substring(1, minPos) + firstChar + s.substring(minPos + 1);

        // Separate first character (minChar) and remaining string
        String remaining = swapped.substring(1); // remove first character (minChar)

        // Recursive call on the remaining string
        return minChar + sort(remaining);
    }

    // Finds the position of the smallest character in the string
    private int findMinPos(String s) {
        char minChar = s.charAt(0);
        int minPos = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < minChar) {
                minChar = s.charAt(i);
                minPos = i;
            }
        }

        return minPos;
    }
}
