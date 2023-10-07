class RuntimePoly1 {
	public static void main(String[] args) {
		A obj1 = new A(); obj1.fun();
		B obj2 = new B(); obj2.fun();
		A obj3 = new B(); obj3.fun();
	}
}
class A {
	public void fun() {
		System.out.println("A:fun");
	}
}
class B extends A {
	public void fun() {
		System.out.println("B:fun");
	}
}