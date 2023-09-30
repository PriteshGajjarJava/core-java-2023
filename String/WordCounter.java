class WordCounter {
	public static void main(String[] args) {
		String s = "This is example of string program.";
		int cnt = countWords(s);
		System.out.println("Count is :" + cnt);
	}

	static int countWords(String str) {
		return str.split(" ").length;
	}
}