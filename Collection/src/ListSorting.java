import java.util.*;

class SalaryCompartor implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.sal == e2.sal ? 0 : e1.sal > e2.sal ? -1 : 1;
	}
	
}
class IDCompartor implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.id == e2.id ? 0 : e1.id > e2.id ? 1 : -1;
	}
	
}
class NameCompartor implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
	
}

class Employee implements Comparable<Employee> {
	int id;
	String name;
	float sal;
	Employee(int id, String name, float sal) {
		this.id = id; this.name = name; this.sal = sal;
	}

	@Override
	public int compareTo(Employee e) {
		return this.id == e.id ? 0 : this.id > e.id ? +1 : -1 ;
	}
	
	public String toString() {
		return "{" + this.id + ", " + this.name + "," + this.sal + "}";
	}
 
}
public class ListSorting {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "Fred", 12000));
		list.add(new Employee(221, "James", 42000));
		list.add(new Employee(111, "John", 20000));
		list.add(new Employee(402, "Suresh", 7000));
		
		Collections.sort(list, new SalaryCompartor());
		System.out.println("Sort using Salary: ");
		System.out.println(list);
		Collections.sort(list, new IDCompartor());
		System.out.println("Sort using ID: ");

		System.out.println(list);
		Collections.sort(list, new NameCompartor());
		System.out.println("Sort using Name: ");

		System.out.println(list);

	}
}









