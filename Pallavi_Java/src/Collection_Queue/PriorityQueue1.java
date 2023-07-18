package Collection_Queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		
		PriorityQueue PQ= new PriorityQueue();
		PriorityQueue PQ1= new PriorityQueue();

		PQ.add('D');
		PQ.add('M');
		PQ.add('J');
		PQ.add('L');
		//System.out.println(PQ.offer());
		System.out.println(PQ);
		//PQ.offer("hh");  ClassCastException
		//PQ.offer(null);
		
		//offer method
		System.out.println(PQ.offer('k'));
        System.out.println(PQ);
        
        //Element method
       System.out.println(PQ.element());
       // System.out.println(PQ1.element()); NoSuchElementException
System.out.println("@@@@");
        //peek
        System.out.println(PQ.peek());
		
	}
}