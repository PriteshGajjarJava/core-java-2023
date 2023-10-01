class ConstructorChaining {
	public static void main(String[] args) {
		B obj = new B();
	}
}

class A {
	A() {
		super();
		System.out.println("A: constructor");
	}
}
class B extends A {
	B() { 
		super();
		System.out.println("B: constructor");
	}

}
class C extends B {
	C() { 
		super();
		System.out.println("C: constructor");
	}
}