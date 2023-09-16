class ConstructorPuzzle3 {
	static { System.out.println("6");}
	{ System.out.println("7");}
	public static void main(String[] args) {
		new A(5);
	}
}

class A {
	{ System.out.println("3");}
	A(int a) {
		this();
		System.out.println("1");
	}
	A() {
		System.out.println("2");
		new B();
		System.out.println("8");
	}
}
class B {
	B() { System.out.println("4");}
	{
		System.out.println("5");
		new ConstructorPuzzle3();
	}
}