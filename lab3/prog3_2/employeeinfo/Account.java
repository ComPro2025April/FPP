package lab3.prog3_2.employeeinfo;

import lab3.prog3_1.AccountType;

class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		this.balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if(this.balance >= amount){
			this.balance -= amount;
			return true;
		}
		return false;
	}

	public AccountType getAccountType(){
		return this.acctType;
	}

	public double getBalance(){
		return this.balance;
	}
}
