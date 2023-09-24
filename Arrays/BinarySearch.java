class BinarySearch {
	public static void main(String[] args) {
		// Array has to be SORTED
		int[] arr = { 1, 4, 8, 19, 25, 29, 37, 44, 59, 68, 87, 90, 100};

		for (int i=1; i<=100; i++) {
			if(binarySearch(arr, i) == true) {
				System.out.println(i);
			}
		}
	}

	static boolean binarySearch(int [] arr, int n) {
		int start = 0;
		int end = arr.length - 1;

		int mid = (start + end) / 2;

		while (start <= end) {
			if (arr[mid] == n) {
				return true;
			}
			if (n < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}
		return false;
	}
}






