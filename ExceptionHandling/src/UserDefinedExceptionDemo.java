import java.util.Scanner;

// User Defined exception
class AgeInvalidException extends Exception {
	public String toString() {
		return "Age is Invalid. Range is 1-100";
	}
}

public class UserDefinedExceptionDemo {
	public static void main(String[] args) throws AgeInvalidException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		try {
			validateAge(age);
		}catch(AgeInvalidException e) {
			System.out.println("Invalid age:");
			e.printStackTrace();
		}
		System.out.println("Age is Valid");
	}
	
	static void validateAge(int age) throws AgeInvalidException {
		if (age < 0 || age > 100) {
			throw new AgeInvalidException();
		}
	}
}
















