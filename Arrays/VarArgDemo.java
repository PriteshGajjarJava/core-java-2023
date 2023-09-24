class VarArgDemo {

	public static void main(String... args) {
		System.out.println(add(1,3));
		System.out.println(add(1,2,4,5));
		System.out.println(add());
	}
	
	// Variable argument list (var-arg)
	static int add(int ... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}