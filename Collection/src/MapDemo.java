import java.util.*;
public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String>  map = new HashMap<Integer, String>();
		map.put(15, "fifteen@gmail.com");
		map.put(5, "xyz@gmail.com");
		map.put(25, "abc@gmail.com");
		map.put(10, "ten@gmail.com");
		
		System.out.println(map);
		map.get(25); // abc@gmail.com
		
		Set<Integer> keys  = map.keySet();
		for(Integer key : keys) {
			System.out.println(key + "=> " + map.get(key));
		}
		
		System.out.println("contains 10 as key=>" + map.containsKey(110));
		System.out.println("contains value abc@gmail.com" + map.containsValue("abc@gmail.com"));
		
		map.remove(10); // remove pair
		map.put(5, "FIVE@gmail.com");
		map.put(null, "abc");
		System.out.println(map);
	}
}
