// java Puzzle1 5
// java Puzzle1 2 
// java Puzzle1 Two
// java Puzzle1 100
public class Puzzle1 {
	public static void main(String[] args) {
		int[] arr = {9,14,0,15,10,15,16,20};
		
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(100/arr[n]);
			System.out.println(arr[0]);
		}catch(NumberFormatException e1) {
			System.out.println("NFE");
		}catch(ArithmeticException e2) {
			System.out.println("AE");
		}catch(Exception e3) {
			System.out.println("Exception");
		}finally {
			System.out.println("finally");
		}
		System.out.println("END");
	}
}
