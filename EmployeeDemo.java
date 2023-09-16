public class EmployeeDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(11, "John", 12000);

		e1.setEmpId(5);
		e1.setName("Alex");
		e1.setSalary(15000);

		e1.printInfo();
		e2.printInfo();

		System.out.println(e1);
		System.out.println(e2);
	}
}

class Employee {
	private int empId;
	private String name;
	private float salary;

	Employee() { System.out.println("Default constructor");}
	Employee(int empId, String name, float salary) {
		System.out.println("parameterised constructor..");
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	// Getter method & Setter for empId
	int getEmpId() { return this.empId; }
	void setEmpId(int id) { this.empId = id; } 

	// Getter method & Setter method for name
	String getName() { return this.name; }
	void setName(String name) { this.name = name; } 

	// Getter method & setter method for salary
	float getSalary() { return this.salary; }
	void setSalary(float salary) { this.salary = salary; } 

	void printInfo() {
		System.out.println("ID=" + this.empId + ", Name=" + this.name + ", Salary=" + this.salary);
	}
 }







