import java.util.*;


public class ListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(7);
		list.add(1);
		list.add(5);
		
		// Collections.sort(list);
		
		// Traverse
		for (Integer data : list) {
			System.out.println(data);
		}
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Search for 9: " + list.contains(9));
		
		// Get particular element by index
		System.out.println(list.get(1));
		
		
		// Remove
		list.remove(1);// 1 is index here
		
		System.out.println("Size of list is: " + list.size());
		System.out.println(list);
	}
}














