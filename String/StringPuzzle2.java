class StringPuzzle2 {
	public static void main(String[] args) {
		String s = "String is immutable. String is funny";

		String s1 = s.substring(s.lastIndexOf("String"));
		System.out.println(s1.split("is")[0].trim());

		String[] w = s.split(" ");
		String s2 = String.join("#", w);
		System.out.println(s2);
	}
}