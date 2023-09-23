class ArrayAddition {
 public static void main(String[] args) {
 	int[] arr = {14,52,31,14,50, 1, 5};
 	int sum = ArrayAddition.sumOfArrayElements(arr);
 	System.out.println("Addition is:" + sum);
 	System.out.println(ArrayAddition.sumOfArrayElements(new int[] {1,4,5,6,7}));
 }

 static int sumOfArrayElements(int[] a) {
 	int total = 0;

 	for (int i=0; i < a.length; i++) {
 		total = total + a[i];
 	}
 	return total;
 }
}
