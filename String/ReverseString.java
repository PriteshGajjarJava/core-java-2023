class ReverseString {
	public static void main(String[] args) {
		String s = "program"; 
		String rev = reverse(s);
		System.out.println("Reverse is: " + rev);
		System.out.println(isPalindrome("nitin"));
	}

	static boolean isPalindrome(String input) {
		return reverse(input).equals(input);
	}

	static String reverse(String str) {
		// step1: convert str to ch[]
		char[] arr = str.toCharArray();

		// step2: Traver array and keep on swapping i and j (i=begin,j=end)
		for(int i=0, j=arr.length - 1; i < j; i++,j--) {
			// swap
			char t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
		}
		return new String(arr);
	}
}