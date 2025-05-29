package lab3.prog3_2.employeeinfo;

class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Enum acctType;
	private Employee employee;

	Account(Employee emp, Enum acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, Enum acctType) {
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
		return this.acctType.name();
	}

	public double getBalance(){
		return this.balance;
	}
}
