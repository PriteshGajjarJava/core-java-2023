import java.util.*;
// {a+b+(b-c)+d}
// [{(a+b)-{a+d}}]
public class ExpressionEvaluation {
	public static void main(String[] args) {
		String exp = "{{}}()[()]";
		System.out.println(exp + " is valid? " + validateExp(exp));
	}
	
	static boolean validateExp(String exp) {
		Stack<Character> stack = new Stack<Character>(); 
		
		for (int i = 0 ; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			
			// Opening
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
			}
			if (ch == '}' || ch == ']' || ch == ')') {
				char top = stack.pop();
				switch (top) {
				case '{': if (ch != '}') return false; break;
				case '[': if (ch != ']') return false; break;
				case '(':  if (ch != ')') return false; break;
				}
			}
		}
		
		return stack.isEmpty();
	}
}










