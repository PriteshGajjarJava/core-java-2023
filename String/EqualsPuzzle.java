class EqualsPuzzle {
	public static void main(String[] args) {
		String s1 = "java"; // 5000x
		String s2 = new String("java");//8000x
		String s3 = "JAVA";// 9000x
		String s4 = s3.toLowerCase(); // "java" 2000x

		System.out.println(s1 == s2); // false
		System.out.println(s1 == s4); // false
	}
}