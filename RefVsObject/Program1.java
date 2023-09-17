public class Program1 {
  public static void main(String[] args) {
  	A obj1 = new A(10);
  	int x = 20;
  	fun(x, obj1);
  	System.out.println(x);
  	System.out.println(x);
  }

  static void fun(int y, A obj2) {
  	y = y * 2;
  	obj2.x = y + obj2.x;
  }
}

class A {
 int x;
 A(int x) {
 	this.x = x;
 }
}