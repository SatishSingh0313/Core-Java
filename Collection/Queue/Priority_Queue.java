package queue;

import java.util.PriorityQueue;

public class Priority_Queue {
	public static void main(String[] args) {
		
	PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
	
		pq.add(20);
		pq.add(30);
		pq.add(35);
		pq.add(50);
		pq.add(60);
		pq.add(10);
		
		System.out.println(pq); 
		System.out.println(pq.poll());
		System.out.println(pq.peek());
        System.out.println(pq.remove(60));
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.size());
	}	
}
