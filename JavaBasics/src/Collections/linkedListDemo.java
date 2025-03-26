package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class linkedListDemo {

	public static void main(String[] args) {
		
		System.out.println("Linked list with Queue:" );
		Queue<Integer> q = new LinkedList<>();
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
			
		System.out.println("__________________________________________");
		
		System.out.println("Linked list with list :" );
		List<Integer> lst = new LinkedList<>();
		lst.add(9);
		lst.add(8);
		lst.add(7);
		lst.add(6);
		
		System.out.println(lst);
		System.out.println("removing el at index 2 : "+lst.remove(2));
		System.out.println(lst);
	}

}
