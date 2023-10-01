class EqualsDemo {
	public static void main(String[] args) {
		Student s1 = new Student(11, "Pga");
		Student s2 = new Student(11, "Pga");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}

class Student {
	int id;
	String name;
	Student(int id, String name) {
		this.id = id; this.name = name;
	}

	// Overriding equals() method of Object class
	public boolean equals(Object obj) {
		Student s1 = this;
		Student s2 = (Student)obj;
		return s1.id == s2.id && s1.name.equals(s2.name);
	}

}




























