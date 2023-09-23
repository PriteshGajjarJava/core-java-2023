import java.util.*;
class StreamFunctionsJava8 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};

		int total = Arrays.stream(arr).reduce(0, (a,b) -> a + b);
		System.out.println("Total: " + total);

		int sum = Arrays.stream(arr).sum();
		System.out.println("Addition of array elements is: " + sum);
		double avg = Arrays.stream(arr).average().orElse(0.0);

		System.out.println("Average of array elements is: " + avg);

		int evenCount = Arrays.stream(arr).filter(e -> e % 2 == 0).toArray().length;
		int oddCount = Arrays.stream(arr).filter(e -> e % 2 != 0).toArray().length;

		System.out.println("Even elements:" + evenCount);
		System.out.println("Odd elements:" + oddCount);

		int n = 1;
		int frequncyCount = Arrays.stream(arr).filter(e -> e == n).toArray().length;
		System.out.println("Frequncy of 1 is: " + frequncyCount);

		arr = Arrays.stream(arr).map(e -> e * e).toArray();
		System.out.println(Arrays.toString(arr));

		int[] oddElemPower = 
		Arrays.stream(arr).filter(e -> e%2 !=0).map(e -> e*e).toArray();
		System.out.println("Odd elements power: " + Arrays.toString(oddElemPower));
	}
}














