package lab4.prog4_3;

class SavingsAccount extends Account {
    public SavingsAccount(Employee emp, double balance){
        super(emp, Account.SAVING, balance);
    }

    public int getAcctType() {
        return Account.SAVING;
    }

    public double getBalance() {
        double baseBalance = super.getBalance();
        double interest = (0.25/100)*baseBalance;
        return baseBalance + interest;
    }
}
