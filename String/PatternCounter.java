// we are learning java string programs. string programming is fun.
// "ing" -> 4
//ng j

// indexOf and substring 

class PatternCounter {
	public static void main(String[] args) {
		String s ="we are learning java string programs. string programming is fun.";
		String pattern = "ing";
		int cnt = countPattern(s,pattern);
		System.out.println("Count of pattern is: " + cnt);
	}

	static int countPattern(String str, String pattern) {
		int cnt = 0;
		while (str.indexOf(pattern) != -1) {
			cnt++;
			str = str.substring(str.indexOf(pattern) + pattern.length());
		}
		return cnt;
	}
}

