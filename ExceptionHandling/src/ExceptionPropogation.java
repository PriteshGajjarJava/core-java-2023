
public class ExceptionPropogation {
	public static void main(String[] args) {
		System.out.println("main:start");
		f1();
		System.out.println("main:end");
	}
	
	static void f1() {
		System.out.println("f1:start");
		try {
			f2();
		}catch(ArithmeticException e1) {
			System.out.println("Exception occurred..");
		}
		System.out.println("f1:end");
	}
	
	static void f2() {
		System.out.println("f2:start");
		System.out.println(8/0);
		System.out.println("f2:end");
	}
}
