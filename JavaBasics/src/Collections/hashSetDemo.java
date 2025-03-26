package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashSetDemo {

	public static void main(String[] args) {
		//Set<Integer> st = new HashSet<>();
		//Set<Integer> st = new LinkedHashSet<>();
		Set<Integer> st = new TreeSet<>();
		
		st.add(4);
		st.add(8);
		st.add(1);
		st.add(17);
		st.add(1);	
		System.out.println(st);

		st.remove(8);
		System.out.println("After removing 8 : "+st);
		
		System.out.println("Does set contain 4 : "+st.contains(4));
		System.out.println("Is set empty : "+st.isEmpty());
		System.out.println("Size of set is : "+st.size());
		st.clear();
		System.out.println("After clearing : "+st);
	}

}
