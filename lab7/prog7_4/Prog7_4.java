package lab7.prog7_4;

import java.util.Arrays;

public class Prog7_4 {

    public static void reverseArray(int[] arr) {
        reverseArray(arr, 0, arr.length - 1);
    }

    private static void reverseArray(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseArray(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9, 13};
        System.out.println("Before Reverse: " + Arrays.toString(data));
        reverseArray(data);
        System.out.println("After Reverse: " + Arrays.toString(data));
    }
}
