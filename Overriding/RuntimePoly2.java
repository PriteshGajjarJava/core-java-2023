class A {
	void f1() { System.out.println("A:f1");}
	void f2() { System.out.println("A:f2");}
}
class B extends A {
	void f1() { System.out.println("B:f1");}
}

class RuntimePoly2 {
	public static void main(String[] args) {
		A obj = new B();
		obj.f1(); // B:f1
		obj.f2(); // A:f2
	}
}