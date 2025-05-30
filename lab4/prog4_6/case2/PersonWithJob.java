package lab4.prog4_6.case2;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	private double salary;

	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) return false;
		PersonWithJob other = (PersonWithJob) obj;
		return getName().equals(other.getName())
				&& getDateOfBirth().equals(other.getDateOfBirth())
				&& salary == other.salary;
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		long bits = Double.doubleToLongBits(salary);
		result = 31 * result + (int)(bits ^ (bits >>> 32));
		return result;
	}
}
