package week11package;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {

	public static void main(String[] args) {
	int time = 10;
	
	Queue<Integer> queue=new LinkedList<Integer>();
	
	for(int i=time; i>=0; i--) {
		queue.add(i);
	}
		System.out.println("Queue : "+queue);
		
	while(!queue.isEmpty()) {
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.remove());// will remove null values
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	}

}
