// ae1ua9j4H5 = 1 + 9 + 4 + 5 = 19
class AddDigitInString {
	public static void main(String[] args) {
		String s = "ae1ua9j4H5";
		int ans = addDigits(s);
		System.out.println(ans);
	}

	static int addDigits(String str) {
		int result = 0;
		for (int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				result += Character.getNumericValue(ch); //'1'
			}
		}
		return result;
	}
}