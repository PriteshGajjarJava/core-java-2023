
public class MainThreadDemo {
	public static void main(String[] args) {
		f1();
	}
	
	static void f1() {
		Thread t = Thread.currentThread();
		System.out.println("This is executed by thread:" + t.getName());
	}
}
