class DynamicString {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Java Program");
		s1.append("****");
		s1.reverse();

		String s2 = new String("Java Program");
		s2.concat("****");
		System.out.println(s1);
		System.out.println(s2);

		String s3 = "Reverse Check";
		System.out.println(reverse(s3));

	}

	static String reverse(String str) {
		StringBuffer b = new StringBuffer(str); // From String to StringBuffer
		b.reverse();
		return b.toString(); // StringBuffer to String
	}
}