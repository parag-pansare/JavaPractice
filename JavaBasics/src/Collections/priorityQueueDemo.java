package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		System.out.println("This is priority queue : ");
		pq.offer(12);
		pq.offer(49);
		pq.offer(29);
		pq.offer(8);
		
		System.out.println(pq);
		pq.poll();
		
		System.out.println(pq);
		System.out.println(pq.peek());
	}

}
