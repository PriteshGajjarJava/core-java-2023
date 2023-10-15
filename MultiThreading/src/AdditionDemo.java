class AdditionThread extends Thread {
	int start, end;
	int ans = 0;
	AdditionThread(int start, int end) {
		this.start = start; 
		this.end = end;
	}
	
	public void run() {
		for (int i=start; i<=end;i++) {
			this.ans += i;
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		System.out.println("Ans by thread: " + Thread.currentThread().getName() +":"+ans);
	}
}

public class AdditionDemo {
	public static void main(String[] args) {
		AdditionThread[] arr = new AdditionThread[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new AdditionThread(i*10 + 1, i*10 + 10);
			arr[i].start();
			try {
				arr[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// Collect the output
		int sum = 0;
		for(int i=0 ; i < 10; i++) {
			sum = sum + arr[i].ans;
		}
		System.out.println("Total addition is : " + sum);
	}
}








