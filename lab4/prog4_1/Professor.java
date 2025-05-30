package lab4.prog4_1;

public class Professor extends DeptEmployee{
    int numberOfPublications;

    public  Professor(String name, double salary,int aYear, int aMonth, int aDay, int numberOfPublications){
        super(name, salary, aYear, aMonth, aDay);
        this.numberOfPublications = 10;
    }
}
