class ProductionThread extends Thread {
	Object obj;
	
	ProductionThread(Object obj) { this.obj = obj; }
	public void run() {
		for (int i=1; i<=10;i++) {
			System.out.println("Pen production for " + i + " started");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println("Pen " + i + " is ready");
			try {
				synchronized(obj) {
					obj.notify();
				}
			} catch (IllegalMonitorStateException e) {
			}
		}
	}
}

class ColoringThread extends Thread  {
	Object obj;
	
	ColoringThread(Object obj) { this.obj = obj; }

	public void run() {
		
		for (int i=1; i<=10; i++) {
			try {
				synchronized(obj) {
					obj.wait();
				}
			} catch (InterruptedException e) {
			}
			System.out.println("Pen color for " + i + " started");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println("Pen " + i + " is colored.");
			
		}
	}
}

public class WaitNotifyDemo {
	public static void main(String[] args) {
		Object obj = new Object();
		new ColoringThread(obj).start();
		new ProductionThread(obj).start();

	}
}









