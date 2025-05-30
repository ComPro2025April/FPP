package lab3.prog3_1;

public class Main {
    public static void main(String[] args){
        Employee employee = new Employee("Undrakh Orgil Odonkhuu","Orgil",360000,2010,8,1);
        Account checking = new Account(employee, AccountType.CHECKING,300);
        Account savings = new Account(employee, AccountType.SAVING,300);
        Account retirement = new Account(employee, AccountType.RETIREMENT,300);

        System.out.println(checking);
        System.out.println(savings);
        System.out.println(retirement);
    }
}
