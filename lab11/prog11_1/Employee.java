package lab11.prog11_1;

import java.util.HashMap;
import java.util.Map;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap salaryRecord;
	
	public void addEntry(String date, double salary) {
		if(salaryRecord == null)
			salaryRecord = new HashMap();
		salaryRecord.put(date, salary);
	}

	public void printPaymentAmount(String date) {
		String format = "%s %s was paid %.1f on %s";
		String formatNot = "%s %s did not receive a paycheck on %s";

		if(salaryRecord.get(date) != null)
			System.out.println(String.format(format, getFirstName(), getLastName() , salaryRecord.get(date) ,date));
		else
			System.out.println(String.format(formatNot, getFirstName(), getLastName() , date ));
	}

	public void printAveragePaycheck() {
		//implement
		String format = "Average paycheck for %s %s was %.1f";
		double avg=0;
		int count=0;

		for(Object it : salaryRecord.entrySet()) {
			avg += (double)((Map.Entry)it).getValue();
			count++;
		}

		System.out.println(String.format(format, getFirstName(), getLastName() , avg/count ));
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 1; i <= 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
