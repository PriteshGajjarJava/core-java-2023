public class TypesOfFunctions {
 public static void main(String[] args) {
 	// static function call using class name
 	TypesOfFunctions.fun1(); 

 	// instance function call using an object
 	TypesOfFunctions obj = new TypesOfFunctions();
 	obj.fun2();
 }

 // static function
 static void fun1() {
 	System.out.println("static:fun1");
 }

 // instance function (non-stati)
 void fun2() {
 	System.out.println("instance:fun2");
 }
}







