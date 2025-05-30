package lab4.prog4_1;

public class Secretary extends DeptEmployee{
    double overtimeHours;

    public Secretary(String name, double salary,int aYear, int aMonth, int aDay, double overtimeHours){
        super(name, salary, aYear, aMonth, aDay);
        this.overtimeHours = 200;
    }

    double computeSalary(){
        return this.salary + 12*overtimeHours;
    }
}
