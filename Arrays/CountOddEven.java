class CountOddEven {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int evenCount = countEven(arr);
		System.out.println("Even numbers: " + evenCount);
		System.out.println("Odd numbers: " + (arr.length - evenCount));
	}

	static int countEven(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				cnt++;
			}
		}
		return cnt;
	}
}