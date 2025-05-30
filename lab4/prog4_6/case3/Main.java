package lab4.prog4_6.case3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar dob = new GregorianCalendar(1996, Calendar.AUGUST, 6);

        Person p = new Person("Jane Smith", dob);
        PersonWithJob pj1 = new PersonWithJob("Jane Smith", dob, 75000);
        PersonWithJob pj2 = new PersonWithJob("Jane Smith", dob, 75000);
        PersonWithJob pj3 = new PersonWithJob("Jane Smith", dob, 70000);

        System.out.println("p.equals(pj1)? " + p.equals(pj1));
        System.out.println("pj1.equals(p)? " + pj1.equals(p));
        System.out.println("pj1.equals(pj2)? " + pj1.equals(pj2));
        System.out.println("pj1.equals(pj3)? " + pj1.equals(pj3));
    }
}

