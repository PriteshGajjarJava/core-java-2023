import java.util.Arrays;
class Emp {
 int id;
 String name;
 float salary;

 Emp() { }
 Emp(int id, String name, float salary) {
 	this.id = id; this.name = name; this.salary = salary;
 }
}

class EmployeeArray {
 public static void main(String[] args) {
 	Emp[] e = new Emp[5];
 	e[0] = new Emp(11, "John", 10000);
 	e[1] = new Emp(12, "Rob", 15000);
 	e[2] = new Emp(13, "Alex", 9000);
 	e[3] = new Emp(14, "Josh", 17000);
 	e[4] = new Emp(15, "Suresh", 12000);

 	Emp output = findHighestSalariedEmp(e);
 	System.out.println("Highest paid emp is : " + output.id + ", " +output.name +", " 
 		+ output.salary);
 }

 static Emp findHighestSalariedEmp(Emp[] e) {
 	float maxSalary = e[0].salary;
 	Emp highestSalariedEmp = e[0];

	for (int i=1; i < e.length; i++) {
		if (e[i].salary > maxSalary) {
			maxSalary = e[i].salary;
			highestSalariedEmp = e[i];
		}
	} 	
 	return highestSalariedEmp;
 }
}












