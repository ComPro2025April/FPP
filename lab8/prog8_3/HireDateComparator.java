package lab8.prog8_3;

import java.util.Comparator;
import java.util.Date;

public class HireDateComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        Date hireDate1 = e1.getHireDate(), hireDate2 = e2.getHireDate();
        int salary1 = e1.getSalary(), salary2 = e2.getSalary();
        String name1 = e1.getName(), name2 = e2.getName();

        if (hireDate1.compareTo(hireDate2) != 0) {
            return hireDate1.compareTo(hireDate2);
        }

        if (name1.compareTo(name2) != 0) {
            return name1.compareTo(name2);
        }

        return Integer.compare(salary1, salary2);
    }
}
