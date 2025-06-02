package lab4.prog4_3;

import lab3.prog3_1.AccountType;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee {
	private AccountList accounts=new AccountList();;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;

		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = LocalDate.of(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE));
	}

	public void createNewChecking(double startAmount) {
		accounts.add(new CheckingAccount(this, startAmount));
	}

	public void createNewSavings(double startAmount) {
		accounts.add(new SavingsAccount(this, startAmount));
	}

	public void createNewRetirement(double startAmount) {
		accounts.add(new RetirementAccount(this, startAmount));
	}

	public String getName(){
		return name;
	}

	public Account getAccount(int pos){
		return accounts.get(pos);
	}

	public String getFormattedAcctInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("ACCOUNT INFO FOR ").append(name).append(":\n\n");

		for(Account a : accounts.getAll()){
			sb.append("Account type: ").append(a.getAccountTypeString()).append("\n");
			sb.append("Current bal:  ").append(a.getBalance()).append("\n");
		}
		return sb.toString();
	}

	public void deposit(int accountIndex, double amt){
		Account selected = accounts.get(accountIndex);
		selected.makeDeposit(amt);
	}

	public boolean withdraw(int accountIndex, double amt){
		Account selected = accounts.get(accountIndex);
		if(selected.getBalanceCheck() >= amt){
			selected.makeWithdrawal(amt);
			return true;
		}
		return false;
	}
}
