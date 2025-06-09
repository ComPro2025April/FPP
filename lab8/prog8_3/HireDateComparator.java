package lab8.prog8_3;

import java.util.Comparator;
import java.util.Date;

public class HireDateComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        Date hireDate1 = o1.getHireDate(), hireDate2 = o2.getHireDate();

        if (hireDate1.compareTo(hireDate2) != 0) {
            return hireDate1.compareTo(hireDate2);
        }
        return 0;
    }
}
