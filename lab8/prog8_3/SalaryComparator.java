package lab8.prog8_3;

import java.util.Comparator;
import java.util.Date;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int salary1 = e1.getSalary(), salary2 = e2.getSalary();
        String name1 = e1.getName(), name2 = e2.getName();
        Date hireDate1 = e1.getHireDate(), hireDate2 = e2.getHireDate();

        if (salary1 != salary2) {
            return Integer.compare(salary1, salary2);
        }

        if (name1.compareTo(name2) != 0) {
            return name1.compareTo(name2);
        }

        return hireDate1.compareTo(hireDate2);
    }
}
