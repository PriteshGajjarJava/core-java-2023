class A {
	void f1() {
		System.out.println("A:f1");
		f2();
	}
	void f2() {
		System.out.println("A:f2");
	}
}
class B extends A {
	public void f2() {
		System.out.println("B:f2");
	}
}

class RuntimePoly3 {
	public static void main(String[] args) {
		B obj = new B();
		obj.f1();
	}
}