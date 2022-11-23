package week11package;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
	
	Queue<Double> queue=new PriorityQueue<Double>();
	
	queue.add(10.1);
	queue.add(650.22222222);
	queue.add(3.3);
	queue.add(3.3);
	queue.add(10.3);
	queue.add(100.1);
	queue.add(145600.1);
	queue.add(1993.0);
	queue.add(5.2);
	
		System.out.println("Queue : "+queue);
		
		int loop=1;
		while(loop<=queue.size()) {
			System.out.println(queue);
			System.out.println();
			System.out.println("break");
			System.out.println();
			System.out.println("Peek "+queue.peek());
			queue.remove();
			
		}
	
	
	}

}
