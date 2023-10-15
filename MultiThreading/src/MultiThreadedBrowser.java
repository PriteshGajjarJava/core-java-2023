class DownloadThread extends Thread {
	public void run() {
		System.out.println("****Thread: " + Thread.currentThread().getName()+" started");

		for (int i = 1; i <= 100; i++) {
			System.out.println("Downloading : " + i + "%");
		}
	}
}

class PrintThread implements Runnable {
	public void run() {
		System.out.println("****Thread: " + Thread.currentThread().getName()+" started");
		for (int i = 1; i <= 100; i++) {
			System.out.println("Printing : " + i + "%");
		}
	}
}

public class MultiThreadedBrowser {
	public static void main(String[] args) {
		DownloadThread t1 = new DownloadThread();
		t1.setName("DOWNLOAD-thread");
		t1.start();
		
		PrintThread job = new PrintThread();
		Thread t2 = new Thread(job);
		t2.setName("Printing-thread");
		t2.start();
		
		// following code will be executed on "main" thread.
		for (int i = 1; i <= 100; i++) {
			System.out.println("Browsing : " + i + "%");
		}
	}
}





