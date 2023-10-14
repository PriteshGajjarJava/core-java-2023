//java Puzzle2 Programming
//java Puzzle2 Hi
//java Puzzle2
public class Puzzle2 {
	public static void main(String[] args) {
		try {
			System.out.println(args[0].length());
			try {
				System.out.println(args[0].substring(4));
			}catch (Exception e) {
				System.out.println("####");
			}finally {
				System.out.println("finally 1");
			}
		} catch(ArithmeticException e1) {
			System.out.println("AE");
		}finally {
			System.out.println("finally 2");
			System.exit(0);
		}
		System.out.println("END");
	}
}
