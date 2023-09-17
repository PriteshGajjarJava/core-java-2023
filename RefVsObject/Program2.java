class Program2 {
	public static void main(String[] args) {
		Number n1 = new Number(10,20);
		Number n2 = new Number(30,40);
		update(n1,n2);
		System.out.println(n1.x);
		System.out.println(n1.y);
		System.out.println(n2.x);
		System.out.println(n2.y);
	}

	static void update(Number n2, Number n1) {
		n1.x = n2.x + n2.y;
		n2.y = n1.x + n1.y;
	}
}


class Number {
	int x;
	int y;
	Number(int x, int y) {
		this.x = x;
		this.y = y;
	}
}