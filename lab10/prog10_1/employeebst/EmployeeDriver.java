package lab10.prog10_1.employeebst;


public class EmployeeDriver {

	public static void main(String[] args) {
		new EmployeeDriver();

	}
	public EmployeeDriver() {
		NameComparator nameComp = new NameComparator();
		EmployeeBST bst = new EmployeeBST(nameComp);
/*		bst.insert(new Employee("C", 40000, 1996,11,5));
		bst.insert(new Employee("E", 80000, 1986,3,23));
		bst.insert(new Employee("D", 50000, 2000, 1, 3));
		bst.insert(new Employee("A", 45000, 2001, 2, 7));
		bst.insert(new Employee("B", 80000, 1986,3,23));
		bst.insert(new Employee("F", 80000, 1986,3,23));*/


		bst.insert(new Employee("C", 40000, 1996,11,5));
		bst.insert(new Employee("E", 80000, 1986,3,23));
		bst.insert(new Employee("D", 50000, 2000, 1, 3));
		bst.insert(new Employee("A", 45000, 2001, 2, 7));
		bst.insert(new Employee("B", 80000, 1986,3,23));
		bst.insert(new Employee("F", 80000, 1986,3,23));

		bst.printTree();
	}
}
