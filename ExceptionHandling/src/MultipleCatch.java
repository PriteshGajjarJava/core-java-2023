
public class MultipleCatch {
	public static void main(String[] args) {
		try {
			
		}catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occurred");
		}
	}
}
