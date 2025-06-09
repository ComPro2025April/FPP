package lab8.prog8_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

    public static void main(String[] args) {
        new EmployeeSort();

    }

    public EmployeeSort() {
        Employee[] empArray =
                {new Employee("George", 40000, 1996, 11, 5),
                        new Employee("Dave", 50000, 2000, 1, 3),
                        new Employee("Richard", 45000, 2001, 2, 7)};

        List<Employee> empList = Arrays.asList(empArray);

        NameComparator nameComp =
                new NameComparator();
        SalaryComparator salaryComparator = new SalaryComparator();
        HireDateComparator hireDateComparator = new HireDateComparator();

        String[] result = {"Name", "Salary", "Hire Date"};

        for (String s : result) {
            Collections.sort(empList, s.equals("Name") ? nameComp : s.equals("Salary") ? salaryComparator : hireDateComparator);
            System.out.println("Sorting by " + s + ": ");
            System.out.println(empList);
            System.out.println();
        }
    }

}
