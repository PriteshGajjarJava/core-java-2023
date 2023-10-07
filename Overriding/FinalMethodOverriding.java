class A {
	final void f1() { System.out.println("A:f1");}
}
class B extends A {
	void f1() { System.out.println("B:f1");}
}
class FinalMethodOverriding {}