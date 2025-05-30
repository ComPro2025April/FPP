package lab4.prog4_3;

import lab3.prog3_1.AccountType;

class Account {
	protected static final int CHECKING = 0;
	protected static final int SAVING = 1;
	protected static final int RETIREMENT = 2;
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private int acctType;
	private Employee employee;

	Account(Employee emp, int acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, int acctType) {
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

	public String getAccountType(){
		return (this.acctType == 0) ? "CHECKING" : (this.acctType == 1) ? "SAVING" : "RETIREMENT" ;
	}

	public double getBalance(){
		return this.balance;
	}
}
