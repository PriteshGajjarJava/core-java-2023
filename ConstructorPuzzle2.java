public class ConstructorPuzzle2 {
	public static void main(String[] args) {
		new A();
	}
}

class A {

	A() {
		System.out.println("1");
		new B();
		System.out.println("2");
	}
}
class B {
	static { System.out.println("3");}
	{ System.out.println("4");}
	
	B() {
		System.out.println("5");
	}

	{ System.out.println("6");}
}