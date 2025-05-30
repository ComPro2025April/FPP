package lab4.prog4_6.case1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Person)) return false;
		Person p = (Person)ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}
	
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}

	public static void main(String[] args) {
		GregorianCalendar dob = new GregorianCalendar(1996, Calendar.AUGUST, 6);

		Person p1 = new Person("John Quincy Adams", dob);
		PersonWithJob p2 = new PersonWithJob("John Quincy Adams", dob, 100000);

		System.out.println("person1 equals person? " + p1.equals(p2));
		System.out.println("person2 equals person1? " + p2.equals(p1));
	}

}
