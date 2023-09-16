class ConstructorPuzzle1 {
	{ System.out.println("main class-instance");}
	static { System.out.println("main class-static");}
	ConstructorPuzzle1 () {
		System.out.println("main-class constructor");
	}
	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		B obj3 = new B();
	}
}
class A {
	static { System.out.println("A:static block");}
	{
		System.out.println("A:Instance block");
	}
	A() {
		System.out.println("A constructor");
	}
}
class B {
	static { System.out.println("B:static");}
	{ System.out.println("B:instance"); }
}