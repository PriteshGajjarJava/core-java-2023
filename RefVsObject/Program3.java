class Program3 {
  public static void main(String[] args) {
  	int x = 2;
  	A obj1 = new A();
  	obj1.x = x;
  	change(obj1, x, obj1);
  	System.out.println(x);
  	System.out.println(obj1.x);
  }

  static void change(A xyz, int y, A pqr) {
  	y = xyz.x + pqr.x;
  	xyz.x = y * y;
  	pqr.x = xyz.x * pqr.x;
  }
}

class A {
 int x;
}