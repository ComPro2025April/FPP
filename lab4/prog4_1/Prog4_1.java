package lab4.prog4_1;

import java.util.Scanner;

public class Prog4_1 {

    public static void main(String[] args){
        Professor p1 = new Professor("Thao", 120000,2018, 1, 1,25);
        Professor p2 = new Professor("Tina", 100000,2019, 12, 1,5);
        Professor p3 = new Professor("Ankhtuya", 130000,2021, 8, 1,15);
        Secretary s1 = new Secretary("Erica", 90000,2015, 3, 10,100);
        Secretary s2 = new Secretary("Myaram", 95000,2010, 5, 15,0);
        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = p1;
        department[1] = p2;
        department[2] = p3;
        department[3] = s1;
        department[4] = s2;

        Scanner sc = new Scanner(System.in);
        System.out.print("See a sum of all salaries in the department? (y/n) ");
        String answer = sc.next();
        if(answer.equals("y")){
            double sum = 0;
            for(DeptEmployee e : department)
                sum += e.computeSalary();

            System.out.println("Total : " + sum);
        }
    }
}
