// aBCdEfGH
// AbcDeFgh

class AlterCaseOfEachCharacter {
	public static void main(String[] args) {
		String s = "dISplAy"; // DisPLaY
		String output = changeCase(s);
		System.out.println(output);
	}

	static String changeCase(String str) {
		String output = "";
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				output += Character.toLowerCase(ch);
			} else {
				output += Character.toUpperCase(ch);
			}
		}
		return output;
	}
}