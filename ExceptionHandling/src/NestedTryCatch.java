
public class NestedTryCatch {
	public static void main(String[] args) {
		f1();
	}
	
	static void f1() {
		int[] a = {11,12,13,14};
		try {
			System.out.println("1");
			try {
				// System.out.println(9/0);
				// System.out.println(a[10]);
				System.out.println(a[1]);
				System.out.println("3");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("4");
				System.out.println(8/0);
			}finally {
				System.out.println("finally1");
			}
			System.out.println("2");
		} catch(Exception e) {
			System.out.println("#####");
		}finally {
			System.out.println("finally2");
		}
		System.out.println("END");
	}
}
