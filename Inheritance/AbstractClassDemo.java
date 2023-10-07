abstract class A {
	abstract void f1();
	void f2() {
		System.out.println("A:f2");
	}
	A() { System.out.println("A: constructor"); }
}

class B extends A {
	B() { System.out.println("B:constructor");}
	void f1() {
		System.out.println("B:f1");
	}

}

class AbstractClassDemo {
	public static void main(String[] args) {
		B obj = new B();
		obj.f1();
		obj.f2();
	}
}