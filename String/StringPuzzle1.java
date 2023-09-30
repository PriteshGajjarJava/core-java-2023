class StringPuzzle1 {
	public static void main(String[] args) {
	 String s = "We want to be java developer";

	 String s1 = s.substring(14).replace("java", "JAVA");//JAVA developer
	 String s2 = s.split(" ")[4].replace('a','@'); // j@v@
	 System.out.println(s1);
	 System.out.println(s2);
	}
}