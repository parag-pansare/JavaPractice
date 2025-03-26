package Collections;

import java.util.ArrayDeque;

public class arrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		
		ad.offer(4);
		ad.offer(10);
		System.out.println("Elements added wit Offer : "+ad);
		
		ad.offerFirst(111);
		System.out.println("Adding el at first : "+ad);
		
		ad.offerLast(222);
		System.out.println("Adding el at last : "+ad);
		System.out.println("-----------------------------------------");
		
		System.out.println("peek : "+ad.peek());
		System.out.println("peek first : "+ad.peekFirst());
		System.out.println("peek last : "+ad.peekLast());
		System.out.println("-----------------------------------------");
		
		
		System.out.println("poll : "+ad.poll());
		System.out.println("poll first : "+ad.pollFirst());
		System.out.println("poll last : "+ad.pollLast());;
		System.out.println("pop : "+ad.pop());
		
		
	}

}
