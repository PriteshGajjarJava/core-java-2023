class SuperExample {
	public static void main(String[] args) {
		Mango m = new Mango("Summer", "Mango");
		m.display();
	}
}

class Fruit {
	String season;
	Fruit(String season) {
		System.out.println("1");
		this.season = season;
	}

	void display() {
		System.out.println(this.season);
	}
}

class Mango extends Fruit {
	String name;

	Mango(String season, String name) {
		super(season);
		System.out.println("2");
		this.name = name;
	}


	void display() {
		super.display();
		System.out.println(this.name);
	}
}







