import java.util.*;


public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(4);
		stack.push(1);
		stack.push(7);
		stack.push(6);
		stack.push(3);
		
		System.out.println(stack.pop());
		stack.push(19);
		System.out.println(stack.peek());
		System.out.println(stack);
	}
}
