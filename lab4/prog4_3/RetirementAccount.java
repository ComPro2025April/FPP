package lab4.prog4_3;

import lab3.prog3_1.AccountType;

class RetirementAccount extends Account{
    public RetirementAccount(Employee emp, double balance){
        super(emp, Account.RETIREMENT, balance);
    }

    public int getAcctType() {
        return Account.RETIREMENT;
    }
}
