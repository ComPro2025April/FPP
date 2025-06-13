package lab11.prog11_2;

import java.util.HashMap;
import java.util.List;

public class Schur {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 3, 4, 5, 6, 7);
        int z = 7;

        System.out.println(checkForSum(list, z));
    }

    static boolean checkForSum(List<Integer> list, Integer z) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int remaining = z - list.get(i);
            if (map.containsKey(remaining)) {
                return true;
            }
            map.put(list.get(i), i);
        }
        return false;
    }
}
