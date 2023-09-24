import java.util.Arrays;
class UniversalArray {
	public static void main(String[] args) {
		Object[] arr = new Object[4];
		arr[0] = 1;
		arr[1] = "PGA";
		arr[2] = 4.12f;
		arr[3] = new Student();

		System.out.println(Arrays.toString(arr));
	}
}
class Student {}