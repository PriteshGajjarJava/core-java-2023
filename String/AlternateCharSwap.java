// abcdefghij
// badcfehgji

//abcde
//badce

class AlternateCharSwap {
	public static void main(String[] args) {
		String s = "abcdefghij";
		String output = swapAlternateChar(s);
		System.out.println(output);
	}

	static String swapAlternateChar(String str) {
		char[] arr = str.toCharArray();
		for(int i=0, j=1 ; i < arr.length && j < arr.length; i+=2,j+=2) {
			char t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
		}
		return new String(arr);
	}
}
