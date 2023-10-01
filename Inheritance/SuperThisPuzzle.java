class SuperThisPuzzle {
	public static void main(String[] args) {
		new A(5); System.out.println("**");
		new B();System.out.println("**");
		new B(1,3);System.out.println("**");
		new C();System.out.println("**");
		new C(1,3,6);
	}
}

class A {
	A() { System.out.println("1"); }
	A(int x) {
		this();
		System.out.println("2");
	}
}
class B extends A {
	B(int a, int b) {
		super(a);
		System.out.println("3");
	}
	B() {
		System.out.println("4");
	}
}
class C extends B {
	C() { System.out.println("5"); }
	C(int a, int b, int c) {
		super(a,b);
		System.out.println(c);
	}
}

