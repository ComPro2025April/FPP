package lab4.prog4_6.case2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar dob = new GregorianCalendar(1996, Calendar.AUGUST, 6);

        Person p = new Person("John Doe", dob);
        PersonWithJob pj1 = new PersonWithJob("John Doe", dob, 100000);
        PersonWithJob pj2 = new PersonWithJob("John Doe", dob, 100000);
        PersonWithJob pj3 = new PersonWithJob("John Doe", dob, 90000);

        System.out.println("p.equals(pj1)? " + p.equals(pj1));
        System.out.println("pj1.equals(p)? " + pj1.equals(p));
        System.out.println("pj1.equals(pj2)? " + pj1.equals(pj2));
        System.out.println("pj1.equals(pj3)? " + pj1.equals(pj3));
    }
}

