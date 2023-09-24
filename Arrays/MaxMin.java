class MaxMin {
	public static void main(String[] args) {
		int[] a = {13, 5, 15, 1, 20, 18, 10};
		System.out.println("Max element is: " + findMax(a));
		System.out.println("Min element is: " + findMin(a));
	}
	static int findMax(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i=0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	static int findMin(int[] a) {
		int min = Integer.MAX_VALUE;
		for (int i=0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
}