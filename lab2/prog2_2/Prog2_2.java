package lab2.prog2_2;

import static lab2.prog2_2.RandomNumbers.*;

public class Prog2_2 {
    public static void main(String[] args){
        int x = getRandomInt(1,9);
        int y = getRandomInt(3,14);

        System.out.println("1. get a random number x in the range 1 .. 9 and compute πx : " + Math.pow(Math.PI,x));
        System.out.println("2. get a random number y in the range 3 .. 14 and compute yπ : " + Math.pow(y,Math.PI));
    }
}
