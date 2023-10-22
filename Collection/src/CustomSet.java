import java.util.*;
class Emp {
	int empId;
	String name;
	
	Emp(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	public String toString() {
		return "{" + this.empId + ", " + this.name + "}";
	}
	
	public int hashCode() {
		// Hash function
		return this.empId * name.length();
	}
	
	public boolean equals(Object obj) {
		Emp e1 = this;
		Emp e2 = (Emp)obj;
		return e1.empId == e2.empId && e1.name.equals(e2.name);
	}
}

public class CustomSet {
	public static void main(String[] args) {
		Set<Emp> set = new HashSet<Emp>();
		Emp e1 = new Emp(11, "Fred"); // 11 * 4 = 44
		Emp e2 = new Emp(12, "Rob");  // 12 * 3 = 36
		Emp e3 = new Emp(11, "Fred"); // 11 * 4 = 44
		Emp e4 = new Emp(22, "Om"); // 22 * 2 = 44
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		System.out.println(set);
	}
}
