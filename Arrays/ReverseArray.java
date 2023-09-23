import java.util.Arrays;
class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};

		int[] rev = reverse(arr);// new array
		System.out.println("original: " + Arrays.toString(arr));
		System.out.println("reverse arr: " + Arrays.toString(rev));
	}

	static int[] reverse(int[] a) {
		int[] b = new int[a.length]; // blank
		for (int i=0, j=a.length-1; j>=0; i++,j--) {
			b[i] = a[j];
		}
		return b;
	}
}