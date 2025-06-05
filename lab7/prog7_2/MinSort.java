package lab7.prog7_2;

public class MinSort {
    public String sort(String s) {
        if (s.isEmpty()) return null;
        char[] sArray = s.toCharArray();
        int len = sArray.length;

        for (int i = 0; i < len; i++) {
            int minIndex = minPos(i, len - 1, sArray);
            swap(i, minIndex, sArray);
        }

        return new String(sArray);
    }

    public void swap(int i, int j, char[] sArray) {
        char temp = sArray[i];
        sArray[i] = sArray[j];
        sArray[j] = temp;
    }

    public int minPos(int left, int right, char[] sArray) {
        int index = left;

        for (int i = left + 1; i <= right; i++) {
            if (sArray[i] < sArray[index]) {
                index = i;
            }
        }
        return index;
    }


}
