// How to write thread annonymously?
public class AnnonymousThreadDemo {
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			public void run() {
				for (int i=1;i<=100;i++) {
					System.out.println("Downloading: " + i + "%");
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				for (int i=1;i<=100;i++) {
					System.out.println("Printing" + i + "%");
				}
			}
		}).start();
	}
}
