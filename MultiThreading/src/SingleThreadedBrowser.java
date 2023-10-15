
public class SingleThreadedBrowser {
	public static void main(String[] args) throws Exception {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Browsing : " + i + "%");
			Thread.sleep(100);
		}
		print();
		download();
	}
	
	static void print() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Printing : " + i + "%");
		}
	}
	static void download() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Downloading : " + i + "%");
		}
	}
}
