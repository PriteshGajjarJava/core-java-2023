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
|C++								| Java |
|--|--|
|We can write program without class  | Class/interface/enum is mandatory  |
|Class ends with semicolon  		 |	Not applicable  |
|Return type is not mandatory in function  |	Return type is mandatory  |
|Platform Dependent  		 |	Platform independent  |
|pointers are allowed  		 |	pointers are not allowed  |
|delete operator for deletion  		 |	No delete operator. Garbage collection helps.  |
|destructor  		 |	No destructor  |
|namespace  		 |	package  |
|Multiple inheritance with classes  		 |	Multiple inheritance with interfaces  |
|Friend function  		 |	No Friend function  |
|Copy constructor  		 |	No copy constructor  |
|virtual functions allowed  		 |	no virtual functions  |
|scope resolution (::)  		 |	no scope resolution  |
|sizeof() operator allowed  		 |	no sizeof() operator  |
|Operator overloading is there  		 |	No operator overloading  |



-----------------------------------------------------------------------
**main() function in Java:**
- It is entry point function
- syntax:
		`public static void main(String[] args)`
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
`class Hello {} // valid`

A.java
`public class Hello {} // error`

In one file you can declare only one public class.

-------------------------------
JDK v/s JRE v/s JVM

----
	JDK	: Java Deveopment Kit
	JRE : Java Runtime Environment
	JVM : Java Virtual Machine
------------------------------------------------------------

Source code(.java) -> javac -> Byte Code (.class) -> JVM -> m/c code -> o/p

**Byte code:**
     - Java compiler generates byte code on executing javac command.
	- This code is platform/os independent.
	- Bytecode helps to make Java programming language as Platform/OS independent.

Cross compilation
WORA - Write Once Run anywhere 
Program gets compiled on one m/c(one time), but it can run on any machine.

***Imp point about version:***
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
e.g
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
	`Employee e = new Employee();`
	`Person p = new Person("James", 2001-9-8, 49); // name, birthDate, weight`

-----------------------------------------------------------------------
Types of relationship?
-----------------------------------------------------------------------
a) IS-A relationship (Inheritance)
b) HAS-A relationsip (Association/Composition/Aggregation)
composition is stronger than Aggregation

Inheritance example: (______)
- Employee IS-A Person
- Student IS-A Person

Composition example: (--------)
- Car HAS-A Engine - Composition (Strong relationship)
- Person HAS-A Address (Aggregation)
- College HAS-A Departments

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

--------------------------------
Stack v/s Heap Memory
-----------------------------------------------------------------------
- When we run any java program, JVM allocates both stack and heap memory for that java process.

**Stack**
	- All function calls are stored in Stack.
	- For each function call stack frame is created
	- Local variables of functions are stored in a stack.

**Heap memory:
**	- When we create object of a class using "new" operator, object gets created in Heap memory.
	- Objects created in heap memory are cleaned up by Garbage collection process. 

Example:

    class A {
    		public static void main(String[] args) {
    			int x = 10;
    			A obj = new A();
    			f1();
    		}
    		
    		static void f1() {
    			int y = 20;
    		}
    	}	
On stack: 
		| 		x=10			 				  	|
		|		obj = memory-address	|
	    |-------------------------------  |

--------------------------------
Pass by mechanism
-----------------------------------------------------------------------
Java uses "Pass By Value" mechanism for function parameters.

For primitive types it will be normal value, however for references value will be an address.


--------------------------------
reference v/s object
-----------------------------------------------------------------------
- Reference is a local variable which is stored in a stack.
- It acts a pointer
- Reference points to an object which is created in heap memory.
- Multiple references can points to single object.

**Reference count:**
- Reference count is a count of references pointing to an object.
- Every object has a reference count. 
- Garbage collection will delete an object from heap memory, only if reference count is 0.

`Student s1 = new Student();
Student s2 = new Student();
Student s3; // null``
 In above code, there are 3 references and 2 objects.

--------------------------------
Primitive types (in-built data typs)
-----------------------------------------------------------------------
There are total 8 primitive types in Java.

	|**Data Type**  |	** Size** |** Wrapper class** | Default value
	|byte			|	1 byte	  | Byte			  | 0
	|short			|	2 bytes	  | Short			  | 0	
	|int			|	4 bytes	  | Integer			  | 0
	|long			|	8 bytes	  | Long			  |	0
	|char			|	2 bytes	  | Character		  | '' 	
	|float			|	4 bytes	  | Float			  | 0.0
	|double			|	8 bytes	  | Double			  | 0.0
	|boolean		|	1 bit	  | Boolean			  | false	

There is no "unsigned" type in Java. As its there in C/C++ for storing address of variable(pointer).
Each data type in Java has corresponding wrapper class.

Boxing: Conversion from primitive data type to wrapper class is called as "Boxing".

Auto Boxing: Compiler does this conversion wherever required from primitive type to wrapper type.
e.g.

	List<Integer> list = new ArrayList<Integer>();
	list.add(3); // Here 3 gets converted into Integer object (Integer.valueOf(3))

String is not a data type, it is class from java.lang package.

**Typecasting: 
**
Mechanism of converting one data type into another type.

We can assign value of small data type to bigger data type.
e.g. 	we can assign int to long but not vice versa.

To assign bigger data type to smaller type we can use explicit Type-casting.

	class TypeCasting {
		public static void main(String[] args) {
			int x = 10;
			long l = x; // implicit
			System.out.println(l);

			long y = 40;
			int z = (int)y;// explicit type casting
		}
	}
**Why char in Java is of 2 bytes?**
As Java supports UTF-8/mulilangual characters, char size is 2 bytes.
In other languages characters are of ASCII format.


1 byte range: 
1 byte = 8 bits (n=8)

-2 ^ n-1  to +2^n-1 -1
-128 to 127

12 0000 1110

Decimal to Binary : Integer.toBinaryString(num)
Decimal to Octal  : Integer.toOctalString(num)
Decimal to Hex 	  : Integer.toHexString(num)

--------------------------------
Array
-----------------------------------------------------------------------

- Array is a data structure in which you can store multiple elements of same type.
- It is static type. Once you create an array you can not increase it's size or decrease it's size(size is fixed)
- It is index based data structure.
- Array elements are accessed using "index". (index always starts from 0)
- Array length can be calcuated using property "length". (e.g. arr.length)

How to create an array?

	int[] a = new int[5];
	String cities[] = new String[10];
	Student[] studentArr = new Student[100];
	int[] a = {11,12,13};
	String[] directions = {"North", "South", "East", "West"};
	
	System.out.println(cities.length); //10
	
	// Traversing using standard for loop
	int[] arr = {11,12,13,14,15};
	for (int i = 0; i < arr.length; i++) {
		Sop(arr[i]);
	}
	
	For-Each loop:
	for (int element : arr) {
		sop(element);
	}
	
	for (Student s : studentArr) {}
	
Array reference is stored in stack.
Actual array is stored in heap memory.

To print array data directly we can using following.
	
	java.util.Arrays.toString(arr);

Streams: 

- Supported from Java-8
- Any collection can be converted into Stream and then set of functions filter(), map(), reduce() can be applied.

To convert array into stream:
	`Arrays.stream(arr)`

Ex. of map( )	

    int[] arr = {1,2,3,4};
    int[] res = Arrays.stream(arr).map(e -> e * e).toArray( ); // [1, 4, 9, 16]
	
Ex. of filter( )	

    int[] arr = {1,2,3,4};
    int[] evenElements = Arrays.stream(arr).filter(e -> e%2 == 0).toArray( ); // [2,4]
Ex. of reduce( )	

    int[] arr = {1,2,3,4};
    int sum = Arrays.stream(arr).reduce(0, (a,b) -> a+b).toArray(); // 10
	
	
--------------------------------
Var-arg list
-----------------------------------------------------------------------
	
 - We can decalre var arg list parameters using ... (ellipse) operator
 - It is used when we have to accept same type of elements but number we don't know
 - In one function we can have only one var-arg parameter.
 - It has to be last parameter in the function declartion.
 - Internally it gets converted into an Array.
 
--------------------------------
Polymorphism
-----------------------------------------------------------------------

- It is OOP concept.
- One name many forms.
- There are two types of polymorphism in Java.
	a) Compile time polymorphism - Method Overloading
	b) Run-time polymorphism - Method Overriding

**Method Overloading**

- Same method name, change in parameters.
- Change in parameters can be one of the following.
	a) Count of parameters
	b) Types of parameters
	c) Sequence of parameters
- Using method overloading we can define multiple methods in one class with same name but changes in parameters.
- This is compile-time polymorphism, because which overloaded method to be called that decision is taken at compile time.
- Method overloading does NOT depends on return type.
- We can overload constructors, instance/static methods.

**Example:**
	
	class Demo {
		int add(int a, int b) { }
		int add(int a, int b, int c) { } // change in count compared to above one
		float add (int a, float b) {}
		float add (float a, int b) {} // change in sequence compared to above one
		String add (String a, String b) { } // change in type compared to 1st one
		
		double add(int a, int b) {} // ERROR- conflicting with 1st method. 
	}
	
	
	
	
--------------------------------
	String
-----------------------------------------------------------------------
		
	- Collection of chracters (Array of characters)
	- String is a class from java.lang package. (It's not a data type)
	- String objects are immutable.
	- Following are ways to create String using Java.

	String s1 = "Java";
	String s2 = new String("Java");
	
	
	- String created by assigning string literal directly (without new operator) goes in special area in Heap
	memory which is called as "String Literal Pool".
	- JVM always checks if string literal already exists, if yes then no new entry added in a pool.
	- Using String literal pool memory is saved (As we are not creating duplicate entries).
	
	String object is immutable:
	Any change performed on string value does NOT change original value, instead changes happen in new memory.
	This is called as immutability.
	
	All string functions which updates string value (e.g. toUpperCase()) returns new string.
	
	**String Functions:**
	
	- Case converstion : toUpperCase(), toLowerCase()
	- concat() : 
		String s1 ="abc";
		String s2 = "pqr";
		String s3 = s1 + s2;
		or
		String s3 = s1.concat(s2);
	- length()
		String s1 = "program";
		s1.length(); //7
	- charAt(index)
		String s1 = "I am java developer";
		s1.charAt(10);// 'd'
	- searching: 
		indexOf(char)
		indexOf(string)
		String s1 = "We are learning Java";
		s1.indexOf('n');//11
		s1.lastIndexOf('n');//13
		s1.indexOf("learn");// 7
		s1.indexOf('z'); // -1
		
		boolean startsWith(string)
		String s1  = "This is rainy season";
		s1.startsWith("This"); // true
		s1.endsWith("season");//true
		s1.startWith("We");// false

		boolean contains(string);
		String s1  = "This is rainy season";
		s1.contains("eas");// true
		
	- Trimming:
		String s1 = "    abc   ";
		s1.trim();//abc
		String s2 = "  abc        pqr   ";
		s2.trim();//abc        pqr
	- substring:
		String s1 = "I am java developer";
		s1.substring(5);//java developer
		s1.substring(5,9);//java
		
	- replace
		String s1 = "We are Java developer";
		s1.replace('a', '@');
		s1.replace("are", "will be")
		
	- Comparision
		== operator (Not preferred)
		equals() 
	
		String s1 = "Java";
		String s2 = new String("Java");
		String s3 = "Java";
		
		Sop(s1 == s2); // false
		Sop(s1 == s3); // true
		
		Sop(s1.equals(s2));// true
		Sop(s1.equals(s3));// true
	
		String s1 = "Java";
		String s2 = "JAVA";
		s1.equals(s2);// false
		s1.equalsIgnoreCase(s2); // true
		
	- String break and join
	
		String s = "This is a macbook";
		String[] words = s.split(" "); // ["This", "is", "a", "macbook"]
		
		String s = String.join(" ", words);// "This is a macbook"
	
	- Converting String into char array.
		toCharArray()
		
		String s1 = "Java";
		char[] arr = s1.toCharArray(); // ['J','a','v','a']
		
		Array to String:
		char[] arr = {'J','a','v','a'};
		String s = new String(arr);// Array to String -> "Java"
	
	- valueOf()
		int i = 10;
		String s = String.valueOf(i); "10"
		
		boolean b = true;
		String s = String.valueOf(b);//"true"

--------------------------------
StringBuffer and StringBuilder
-----------------------------------------------------------------------

- String objects are immutable, means we can not directly change original value.
- StringBuffer/StringBuilder both are mutable. Used where your string is getting modified frequently.
- Difference between StringBuffer and StringBuilder:
	- StringBuffer is "synchronized" (Thread safe)
	- StringBuilder is not synchronized (Not thread safe)
- StringBuffer has few functions which String class doesn't have.
	e.g. reverse(), delete(), insert()
- Convert String to StringBuffer
	StringBuffer b = new StringBuffer(String) // constructor
- Convert StringBuffer to String
	use toString() method

--------------------------------
Overriding equals() method of Object class
-----------------------------------------------------------------------

	class EqualsDemo {
		public static void main(String[] args) {
			Student s1 = new Student(11, "Pga");
			Student s2 = new Student(11, "Pga");

			System.out.println(s1 == s2);
			System.out.println(s1.equals(s2));
		}
	}

	class Student {
		int id;
		String name;
		Student(int id, String name) {
			this.id = id; this.name = name;
		}

		// Overriding equals() method of Object class
		public boolean equals(Object obj) {
			Student s1 = this;
			Student s2 = (Student)obj;
			return s1.id == s2.id && s1.name.equals(s2.name);
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
