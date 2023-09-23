import java.util.Arrays;
class ReverseOriginalArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		reverse(arr);
		System.out.println("Reverse is: " + Arrays.toString(arr));
	}

	static void reverse(int[] a) {
		for (int i=0, j=a.length-1; i < j; i++, j--) {
			// swap logic
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
	}
}