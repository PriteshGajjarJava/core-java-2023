// can you change an entry point function? Yes
public class AnotherEntryPoint {
	static {
		System.out.println("static-start");
		myFun();
		System.out.println("static-end");
	}

	public static void main(String[] args) {
		System.out.println("main");
	}

	public static void myFun() {
		System.out.println("my function");
	}
}