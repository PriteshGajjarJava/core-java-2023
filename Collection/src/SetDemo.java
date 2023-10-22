import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(14);
		set.add(90);
		set.add(11);
		set.add(50);
		
		for (Integer data : set) {
			System.out.println(data);
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Does set contain 10? " + set.contains(10));
		
		set.remove(14);
		System.out.println(set);
	}
}
