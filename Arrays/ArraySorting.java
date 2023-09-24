import java.util.Arrays;
class ArraySorting {
  public static void main(String[] args) {
  	int[] arr = {4, 10, 3, 7, 9, 1, 5};
  	// Arrays.sort(arr);
  	// System.out.println(Arrays.toString(arr));	

  	sort(arr);
  	System.out.println(Arrays.toString(arr));
  }

  // Bubble Sort
  static void sort(int[] arr) {
  	for (int i=0; i < arr.length; i++) {
  		for (int j=i+1; j < arr.length; j++) {
  			if (arr[j] < arr[i]) {
  				// swap
  				int t = arr[i];
  				arr[i] = arr[j];
  				arr[j] = t;
  			}
  		}
  	}
  }
}






















