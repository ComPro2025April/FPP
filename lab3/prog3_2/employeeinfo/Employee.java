package lab3.prog3_2.employeeinfo;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

import lab3.prog3_1.AccountType;
import lab3.prog3_1.Util;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;

/* update, using LocalDate
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
*/
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = LocalDate.of(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE));
	}

	public void createNewChecking(double startAmount) {
		// implement
		this.checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		// implement
		this.savingsAcct = new Account(this, AccountType.SAVING, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		this.retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public String getFormattedAcctInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("ACCOUNT INFO FOR ").append(name).append(":\n\n");
		if(savingsAcct != null) {
			sb.append("Account type: ").append(savingsAcct.getAccountType()).append("\n");
			sb.append("Current bal:  ").append(savingsAcct.getBalance()).append("\n");
		}
		if(checkingAcct != null) {
			sb.append("Account type: ").append(checkingAcct.getAccountType()).append("\n");
			sb.append("Current bal:  ").append(checkingAcct.getBalance()).append("\n");
		}
		if(retirementAcct != null) {
			sb.append("Account type: ").append(retirementAcct.getAccountType()).append("\n");
			sb.append("Current bal:  ").append(retirementAcct.getBalance()).append("\n");
		}

		return sb.toString();
	}

	public void deposit(String acctType, double amt){
		if(Objects.equals(acctType, AccountType.SAVING.toString()))
			savingsAcct.makeDeposit(amt);
		if(Objects.equals(acctType, AccountType.CHECKING.toString()))
			checkingAcct.makeDeposit(amt);
		if(Objects.equals(acctType, AccountType.RETIREMENT.toString()))
			retirementAcct.makeDeposit(amt);
	}

	public boolean withdraw(String acctType, double amt){
		if(Objects.equals(acctType, AccountType.SAVING.toString()) && savingsAcct.getBalance() >= amt){
			savingsAcct.makeWithdrawal(amt);
			return true;
		}
		if(Objects.equals(acctType, AccountType.CHECKING.toString()) && checkingAcct.getBalance() >= amt){
			checkingAcct.makeWithdrawal(amt);
			return true;
		}
		if(Objects.equals(acctType, AccountType.RETIREMENT.toString()) && retirementAcct.getBalance() >= amt){
			retirementAcct.makeWithdrawal(amt);
			return true;
		}
		return false;
	}
}
