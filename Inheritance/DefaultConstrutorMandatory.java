class DefaultConstructoMandatory {
	public static void main(String[] args) {

	}
}

// Default constructor in parent class is missing. 
class A {
	int x;
	A(int x) {}
}

class B extends A {
}