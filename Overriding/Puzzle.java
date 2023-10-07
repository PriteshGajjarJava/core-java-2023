class A {
	A() { System.out.println("1");}
	void f1() { System.out.println("4");}
	void f2() { System.out.println("7");}
}
class B extends A {
	B() { System.out.println("2");}
	void f2() { System.out.println("6");}

}
class C extends B {
	C() { System.out.println("3");}
	void f3() { System.out.println("5");}

}
class Puzzle {
	public static void main(String[] args) {
		B obj = new C();
		obj.f1();
		obj.f2();
		((C)obj).f3(); // Explicit downcasting
	}
}










