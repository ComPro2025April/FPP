package Lab2.prog2_2;

public class Prog2_2 {
    public static void main(String[] args) {
//        if(age > 65) socialSecurityStatus = "eligible";
//        else socialSecurityStatus = "ineligible";
        int age = args.length > 0 ? Integer.parseInt(args[0]) : -1;
        String socialSecurityStatus = (age > 65) ? "eligible" : "ineligible";

        System.out.println(socialSecurityStatus);
    }
}
