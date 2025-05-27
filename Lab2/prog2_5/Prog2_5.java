package Lab2.prog2_5;
import java.util.Scanner;

public class Prog2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Reversed string: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}
