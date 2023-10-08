abstract class Shape {
	abstract double area();
}

class Circle extends Shape {
	double radius;
	Circle(double radius) { this.radius = radius; }
	double area() {
		return Math.PI * radius * radius;
	}
}
class Square extends Shape {
	double size;
	Square(double size) { this.size = size; }
	double area() { return this.size * this.size; }
}

class Polymorphism {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		System.out.println(calculateArea(c));

		Square s = new Square(4);
		System.out.println(calculateArea(s));

	}

	static double calculateArea(Shape s) {
		return s.area();
	}
}















