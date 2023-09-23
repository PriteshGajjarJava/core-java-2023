import java.util.*;
public class Test {
  public static void main(String[] args) {
	int[] arr = {1,2,3,4,5, 6, 7, 1,1};
	int sum = Arrays.stream(arr).sum();
	System.out.println(sum);

	int oddCount = Arrays.stream(arr).filter(e -> e%2 !=0).toArray().length;
	System.out.println("Odd count:" + oddCount);

	// Frequency count
	int n = 1;
	int cnt = Arrays.stream(arr).filter(e -> e == n).toArray().length;
	System.out.println("count of 1: " + cnt);
  }
}
