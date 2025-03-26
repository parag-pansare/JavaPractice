package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> student = new ArrayList<String>();
		student.add("Parag");
		student.add("Aish");
		student.add("Shubham");
		student.add("Ashwini");
		System.out.println("1st list : "+student);
		
		student.add(2, "Nikita");
		System.out.println("Added new element : " + student);
		
		List<String> lst = new ArrayList<String>();
		lst.add("Snehal");
		lst.add("Sharad");
		System.out.println("Second list : " + lst);
		
		lst.set(0, "Mayank");
		System.out.println("Changing 0th element with set : " + lst);
		
		student.addAll(lst);
		System.out.println("2nd list added to 1st : "+student);
		
		System.out.println("Fetching element at index 4 : "+student.get(4));
		student.remove(3);
		System.out.println("Removing element at index 3 : "+student);
		
		student.remove(String.valueOf("Snehal"));
		System.out.println("Removing element Snehal by value : "+student);
		
		System.out.println(student.contains("Aish"));
		//lst.clear();
		System.out.println("------------------------------------------------------");
		
		for(String el : student) {
			System.out.println("Student name is : " + el);
		}
		
		System.out.println("------------------------------------------------------");
		Iterator<String> it = student.iterator();
		
		while(it.hasNext()) {
			System.out.println("Iterator: " + it.next());
		}
	}

}
