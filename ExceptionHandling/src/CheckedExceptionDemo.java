import java.io.*;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name: ");
		try {
			String name = br.readLine();// compiler gives error if IOException is not handled
			System.out.println("Your name is: " + name);
		}catch(IOException e) {}
	}
}
