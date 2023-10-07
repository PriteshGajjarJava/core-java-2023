class A {
	static void f1() {
		System.out.println("A:f1");
	}
}
class B extends A {
	static void f1() {
		System.out.println("B:f1");
	}
}
class RuntimePolyStaticMethods {
	public static void main(String[] args) {
		A obj = new B();
		obj.f1(); // A : f1 
	}
}
