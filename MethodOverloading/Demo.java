class Demo {
	public static void main(String[] args) {
		main("abc");
		main(8);
		System.out.println(add(4,5));
		System.out.println(add(1,3,4));
		System.out.println(new Demo().add("Overloading", "Demo"));
		System.out.println(new Demo().add(4,1.5f));
	}

	public static void main(String s) {
		System.out.println("main:String");
	}
	public static void main(int a) {
		System.out.println("main:Int");
	}
	static int add(int a, int b) {return a+b;}
	static int add(int a, int b, int c) {return a+b+c;}
	 String add(String a, String b) {return a+b;}
	 float add(int a, float b) {return a+b;}
}