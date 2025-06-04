package lab7.prog7_1;

public class Prog7_1 {
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }

    public static double power(double x,int n){
        if(x == 0 || n < 0)
            return 0;
        if(n == 0)
            return 1;
        else{
            return x * power(x,n-1);
        }
    }
}
