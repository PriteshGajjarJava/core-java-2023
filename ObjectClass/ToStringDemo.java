class ToStringDemo {
	public static void main(String[] args) {
		Product p = new Product(11, "Pen", 50);
		System.out.println(p); // toString()
	}
}

class Product {
	int id;
	String name;
	float price;
	Product(int id, String name, float price) {
		this.id = id; this.name = name; this.price = price;
	}

	public String toString() {
		return this.id + "," + this.name +"," + this.price;
	}
}