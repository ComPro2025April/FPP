package lab4.prog4_3;

class CheckingAccount extends Account{
    public CheckingAccount(Employee emp, double balance){
        super(emp, Account.CHECKING, balance);
    }

    public int getAcctType() {
        return Account.CHECKING;
    }
}
