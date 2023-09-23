
import java.util.Scanner;
class FrequencyCounter {
	public static void main(String[] args) {
		int[] arr = {1, 1, 2,4,4,1,1,2,5,7};

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();

		int result = countFrequency(arr, n);
		System.out.println("Output is : " + result);
	}

	static int countFrequency(int[] arr, int n) {
		int cnt = 0;
		for (int e : arr) {
			if (e == n) {
				cnt++;
			}
		}
		return cnt;
	}
}