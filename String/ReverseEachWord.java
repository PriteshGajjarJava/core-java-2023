// "one two three four five"
// "eno owt eerht ruof evif"

class ReverseEachWord {
	public static void main(String[] args) {
		String str = "one two three four five";
		String output = revEachWord(str);
		System.out.println(output);
	}

	static String revEachWord(String str) {
		String[] w = str.split(" "); // ["one", "two", "three", "four", "five"]

		for(int i=0; i < w.length; i++) {
			w[i] = reverse(w[i]);
		}
		// ["eno", "owt", "eerht", "ruof", "evif"]
		return String.join(" ", w);
	}

	// "one"
	static String reverse(String s) {
		char[] arr = s.toCharArray(); // ['o','n','e']
		for(int i=0, j=arr.length-1; i<j; i++,j--) {
			char t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
		}
		return new String(arr);
	}
}










