**Core Java Notes**

- 	OOP language
- 	Latest version is v20
- 	Used for Desktop, mobile, web application development
- 	J2SE : Java2 Standard Editiono (Core Java)
- 	J2EE : Java2 Enterprised Edition (Advacned Java- JSP, Servlet, JDBC)
- 	J2EE populare frameworks (Hibernate, Spring)
- 	Java is server side programming language (Backend)

Every java file has an extension .java
Each java file MUST include one of these types.
	- class
	- interface
	- enum

**Identifier**: class name, variable names, method names are called as Identifiers.
It must not include any special symbols except _(underscore) and currency symbols(e.g. $)
Exmaple:
	class Employee { }
	int empSalary;
	getEmpSalary() {}
	
Compilation:
	javac <file-name>
	e.g. javac Hello.java
	
Run/Execute:
	java <class-name> 
	
--------------------------------
C++ v/s Java
-----------------------------------------------------------------------

| C++		      					| Java 								|
| ----------- 						| ----------- 						|
| We can write prog     			| Writing class is mandatory		|
| without class.      				|									|
|    								| 									|
| class declaration ends with (;)	| Not applicable					|
|									|									|
| return type not mandatory for		| Return type for function is		|
| function.							| mandatory.						|
|									|									|
| C++ is platfom depdenent			| Platform independent				|
|									|									|
| Pointers are allowed				| No pointers						|
|									|									|
| "delete" operator is there to     | No delete opertor					|
| delete an object.					|									|
|									|									|
| namespace							| package							|
|									|									|
| friend function 					| No friend function				|
|									|									|
| copy constructor			   		| No copy constructor				|
|									|									|
| multiple inheritance with calsses | multiple inheritance with interfaces|
|									|									|
| virtual functions					|All functions are virtual. 		|
|									|									|
| Scope	resolution operator(::)		| It doesn't exist 					|
|									|									|
| Destructor						| No destructor						|

-----------------------------------------------------------------------
**main() function in Java:
**- It is entry point function
- syntax:
	*public static void main(String[] args)*
- Who calls main() function? -> JVM
- main() function is public because external entity JVM invokes main() function.
- It is static because JVM can call main() without creating an object.
- void : main() does NOT return anything.
- String[] args: Command Line Arguments
- Is it mandatory to write main() in each and every class ? -> NO. It is required only in a class from where execution would start.
- In actual project if i have 100 classes, only 1 class would have main() function.
- Another syntax of main:
	public static void main(String ...args){} // main using var-arg
-----------------------------------------------------------------------

File-name and class name rule:

-----------------------------
File name MUST be same as class name ONLY when class is "public" class.

e.g.
A.java
class Hello {} // valid

A.java
public class Hello {} // error

In one file you can declare only one public class.

-------------------------------
JDK v/s JRE v/s JVM

----
	JDK	: Java Deveopment Kit
	JRE : Java Runtime Environment
	JVM : Java Virtual Machine
------------------------------------------------------------

Source code(.java) -> javac -> Byte Code (.class) -> JVM -> m/c code -> o/p


Byte code:
	- Java compiler generates byte code on executing javac command.
	- This code is platform/os independent.
	- Bytecode helps to make Java programming language as Platform/OS independent.

Cross compilation
WORA - Write Once Run anywhere 
Program gets compiled on one m/c(one time), but it can run on any machine.

Imp point about version:
Program compiled with version "x", will run without any problem on versoin "x" and above. But it will not run on x-1 versions.
e.g. Program compiled with java10 will work on java 10 and above, it will fail on java 9 or below versions.

JVM is platfrom dependent: Because it takes care of converting a generic byte code into m/c code.

Is Bytecode consist of m/c code? -> NO
	
	
// Write a program without writing anything inside main() function

	public class StaticBlock {
	static {
		System.out.println("My name is xyz");
	}

	public static void main(String[] args) {
	}
}

--------------------------------
Static block
-----------------------------------------------------------------------
- It is special block inside a class which is written using "static" keyword.
e.g.
		static {
			// code
		}
- It gets executed automatically when a class is loaded in memory by JVM.
- It gets excuted only once. Because if class is already loaded in memory, then JVM will not load again.
- It is used to perform some one time activity. (e.g. Opening DB connection)
- We can write multiple static blocks in a class. They will get executed in order in which they are defined.
- From static block we can invoke any static function of a class.

--------------------------------
Types of functions
-----------------------------------------------------------------------
1) static function
2) non-static or instance function

static function:
- We do NOT need object to call static functions. 
- We can call static function directly using class name.

instance function:
- We need an object to call instance function.

--------------------------------
"new" operator
-----------------------------------------------------------------------
Used to create object of a class.
e.g.

	Student s = new Studnet();
	Employee e = new Employee(11, "John");

--------------------------------
Encapsulation
-----------------------------------------------------------------------
- It is OOP feature.
- Encapsulation means keeping related things together.
- Class is an example of encapsulation.
e.g. In "Employee" class we will define properties of an employee and functions which are related to employee.

--------------------------------
What is class?
-----------------------------------------------------------------------
- class is a template 
- Any entity which is having properties(state) and functions (behaviours) can be written as a class.
- class is an example of encapsulation in which you keep related things(properties and functions) together.
- When we create an object of a class, that time class gets real meaning.

Example of a class

	class Person {
		// properties (state)
		String name;
		float height, weight;
		Date brithDate;
	
		// functions (behaviors)
		int getAge() {
			...
		}
	
		boolean isOverWeight() {
			...
		}
		void run() {}
		void talk() {}
		void learn() {}
	}

--------------------------------
What is an object?
-----------------------------------------------------------------------
- Object is an instance of a class.
- To create object of a class we use "new" operator.
e.g.
	Employee e = new Employee();
	Person p = new Person("James", 2001-9-8, 49); // name, birthDate, weight

-----------------------------------------------------------------------
Types of relationship?
-----------------------------------------------------------------------
a) IA-A relationship (Inheritance)
b) HAS-A relationsip (Association/Composition/Aggregation)
composition is stronger than Aggregation

Inheritance example: (______)
Employee IS-A Person
Student IS-A Person

Composition example: (--------)
Car HAS-A Engine - Composition (Strong relationship)
Person HAS-A Address (Aggregation)
College HAS-A Departments

--------------------------------
Constructor
-----------------------------------------------------------------------
- It is a special function whose name is exactly same as class name.
- Constructor does NOT have return type
- Constructor gets called automatically when we create object of a class.
- We can have multiple constructors in one class (method overloading is allowed for constructor)
- If we have more than one constrctors, only one constructor will be called based on how we create an object.
- In case we have multiple constructors, we can call one constructor from another constructor using
"this" keyword.
- We can invoke constructor of parent class using "super" keyword.
- Constructor is used to initlize an object with some data.
- There are 2 types of constructors:
	1) Default constructor - *without parmaeters*
	2) Parameterised constructor - *with parameters*
- In Java we do NOT have copy constructor.
- Writing constructor is optional, if we don't write constructor JVM provides default constructor in our class.(JVM would add default constructor ONLY when we don't have any constructor).
- Access specifier of a class should be given to a constructor.
e.g. If class is a public then constructor should be public. 

**Example of constructor:**

	public class Employee {
    	private int empId;
		private String name;
		private float salary;
	
		public Employee() {} // Default constructor
		public Employee(int empId, String name, float salary) { // Parametrised constructor
			this.empId = empId;
			this.name = name;
			this.salary = salary;
		}
	}

























	
	
	
	
	
	
	
	
	
	
	
	