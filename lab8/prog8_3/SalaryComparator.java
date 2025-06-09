package lab8.prog8_3;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int salary1 = o1.getSalary(), salary2 = o2.getSalary();
        return Integer.compare(salary1, salary2);
    }
}
