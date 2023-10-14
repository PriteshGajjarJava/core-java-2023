
public class StackOverflowErroDemo {
	public static void main(String[] args) {
		f1();
	}
	
	static void f1() {
		f1();
	}
}
