import java.util.Scanner;

// java Demo1 1
// java Demo1 7 
public class Demo1 {
	public static void main(String[] args) {
		int[] a = {11,12,13,14};
		Scanner sc = new Scanner(System.in);
		System.out.println("start..");
		System.out.println(a[3]);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		try {
			System.out.println(a[n]);// ArrayIndexOutOfBoundsExceptioin
			System.out.println(a[0]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You are trying to access an index which is invalid.");
		}finally {
			System.out.println("finally");
		}
		System.out.println(a[2]);
		System.out.println("End..");
	}
}
