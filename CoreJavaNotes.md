		Core Java

- OOP language
- Latest version is v20
- Used for Desktop, mobile, web application development
- J2SE : Java2 Standard Editiono (Core Java)
- J2EE : Java2 Enterprised Edition (Advacned Java- JSP, Servlet, JDBC)
- J2EE populare frameworks (Hibernate, Spring)
- Java is server side programming language (Backend)

Every java file has an extension .java
Each java file MUST include one of these types.
	- class
	- interface
	- enum

Identifier: class name, variable names, method names are called as Identifiers.
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
C++								Java
We can write prog     			Writing class is mandatory
without class.

class declaration 				Not applicable
ends with semicolon(;)

return type for fucntion is		Return type is mandatory.
not mandatory	

C++ is  platfrom dependent.		Java is not platform dependent.

pointers are there				No pointers in java.

"delete" operator is used 		Garbage collection(GC) process takes care 
to delete an object				of cleaning an object.

namespace						package

friend functions				No friend function

multiple inheritance with 		Multiple inheritance is not allowed with classes,
class is allowed.				but it is allowed with interfaces

Scope resolution operator		No scope resolution operator. Every
exists.	
class Test {
	void fun();
}

Test::fun() {}

Arrow operator( -> )			No arrow operator. Object properties are accessed using (.)

Virtual function				No virtual keyword.

-----------------------------------------------------------------------
main() function in Java:
- It is entry point function
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










	
	
	
	
	
	
	
	
	
	
	
	
	