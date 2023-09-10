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

		 
		















	
	
	
	
	
	
	
	
	
	
	
	
	