class ImmutabilityDemo {
	public static void main(String[] args) {
		String s1 = "We are learning java";
		String s2 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);

		System.out.println("Program".length()); // 7
	}
}