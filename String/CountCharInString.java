//str= This is first java string program.
// ch = 'i' = 4
import java.util.*;
class CountCharInString {
 public static void main(String[] args) {
 	Scanner sc = new Scanner(System.in);
 	System.out.println("Enter string: ");
 	String str = sc.nextLine();

 	System.out.println("Enter char to be counted: ");
 	String pattern = sc.next();
 	char ch = pattern.charAt(0);

 	int cnt = countCharFrequency(str, ch);
 	System.out.println("Count is: " + cnt);
 }

 // Counting frequency of character in given string
 static int countCharFrequency(String s, char ch) {
 	int cnt = 0;
 	for (int i=0; i < s.length(); i++) {
 		if (s.charAt(i) == ch) {
 			cnt++;
 		}
 	}
 	return cnt;
 }
}













