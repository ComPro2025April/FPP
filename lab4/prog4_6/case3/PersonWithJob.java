package lab4.prog4_6.case3;

import java.util.GregorianCalendar;

public class PersonWithJob {
	private Person person;
	private double salary;
	private static final double EPSILON = 0.00001;

	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		this.person = new Person(name, dob);
		this.salary = salary;
	}

	public String getName() {
		return person.getName();
	}

	public GregorianCalendar getDateOfBirth() {
		return person.getDateOfBirth();
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) return false;
		PersonWithJob other = (PersonWithJob) obj;
		return person.equals(other.person) && Math.abs(this.salary - other.salary) < EPSILON;
	}

	@Override
	public int hashCode() {
		int result = person.hashCode();
		long bits = Double.doubleToLongBits(salary);
		result = 31 * result + (int)(bits ^ (bits >>> 32));
		return result;
	}
}
