package cn.itcast;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee empone = new Employee("jerry");
		Employee emptwo = new Employee("tom");
		empone.empAge(26);
		empone.empDesignation("����Ա");
		empone.empSalary(1000);
		empone.printEmployee();
		System.out.println("\n");
		emptwo.empAge(22);
		emptwo.empDesignation("����Ա");
		emptwo.empSalary(1000);
		emptwo.printEmployee();

	}

}
