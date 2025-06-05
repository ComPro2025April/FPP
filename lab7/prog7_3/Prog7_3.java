package lab7.prog7_3;

import java.util.Arrays;
import java.util.LinkedList;

public class Prog7_3 {

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(2, 5, 8, 11));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(1,3,6));

        System.out.println("List 1: "+l1);
        System.out.println("List 2: "+l2);

        LinkedList<Integer> list3 = merge(l1, l2);
        System.out.println("Merged List: " + list3);
    }


    public static LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2){
        if (list1.isEmpty()) return new LinkedList<>(list2);
        if (list2.isEmpty()) return new LinkedList<>(list1);

        int first1 = list1.getFirst();
        int first2 = list2.getFirst();

        LinkedList<Integer> list3 = new LinkedList<Integer>();

        if(first1 <= first2){
            list3.add(first1);
            list1.removeFirst();
            list3.addAll(1 ,merge(list1,list2));
        }
        if(first1 > first2){
            list3.add(first2);
            list2.removeFirst();
            list3.addAll(1 ,merge(list1,list2));
        }

        return list3;
    }
}
