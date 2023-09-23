
class Traverse {
 public static void main(String[] args) {
 	int[] arr = {11, 12, 13, 14, 15};

 	// basic for-loop
 	for (int i = 0; i < arr.length; i++) {
 		System.out.println(arr[i]);
 	}
 	System.out.println("Result using for-each loop");

 	for (int e : arr) {
 		System.out.println(e);
 	}

 	// Print in reverse order
 	System.out.println("Reverse order");

 	for (int i = arr.length - 1; i >= 0; i--) {
		System.out.println(arr[i]);
 	}

 	System.out.println(java.util.Arrays.toString(arr));

 }
}








