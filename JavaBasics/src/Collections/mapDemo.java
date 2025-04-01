package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapDemo {

	public static void main(String[] args) {

		//Map<Integer, String> num = new HashMap<Integer, String>();
		Map<Integer, String> num = new TreeMap<Integer, String>();
		
		num.put(1, "One");
		num.put(2, "Two");
		num.put(4, "Four");
		num.put(3, "Three");
		
		num.putIfAbsent(4, "Six");
		System.out.println(num);
		System.out.println("HashMap contains Two? : "+num.containsValue("Two"));
		System.out.println("Is Map empty? "+num.isEmpty());
		
		//Iterate through map
		System.out.println("Iterating through map with Map.Entry and entrySet : ");
		for(Map.Entry<Integer, String> e : num.entrySet()) {
			System.out.println(e);						//Prints key-value pair
						
			System.out.println(e.getKey());				//prints only key
			System.out.println(e.getValue());			//prints only value	
		}
		System.out.println("Iterating through map with keySet : ");
		for(Integer key:num.keySet()) {
			System.out.println(key);
		}
		System.out.println("Iterating through map with values : ");
		for(String value:num.values()) {
			System.out.println(value);
		}
		
		System.out.println(num.containsValue("Two"));
		System.out.println(num.containsKey(1));
	}

}
