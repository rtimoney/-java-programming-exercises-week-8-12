package week11package;

import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListExercise1 {

	public static void main(String[] args) {
		// have to use the wrapper class Integer because these are objects, not primitives
		List<Integer> arrList = new ArrayList<Integer>();
		List<Integer> linkList = new LinkedList<Integer>();
		
		Random rand = new Random(); 
		
		for (int i=0; i<10; i++) {
			// natural limit of this method goes from 0-4 so we add one so we don't get 0s
		int randomNum = rand.nextInt(5)+1;	
		System.out.println(randomNum);	
			arrList.add(randomNum);
			randomNum = rand.nextInt(4)+1;	
			linkList.add(randomNum);
		}
		
		
		
		System.out.println("Array List =  "+ arrList.toString());
		System.out.println("Linked List = "+ linkList.toString());
		
		removeDuplicates(arrList, linkList);

		System.out.println("Array List =  "+ arrList.toString());
		System.out.println("Linked List = "+ linkList.toString());
		
		swap(linkList, 0, linkList.size()-1);
		System.out.println("Linked List   = "+ linkList.toString());
		System.out.println();
		Collections.shuffle(linkList);
		System.out.println("Shuffled List = "+ linkList.toString());
		
		Collections.reverse(linkList);
		System.out.println("Reversed List = "+ linkList.toString());
		
	
	}
	
	
	public static void swap(List<Integer> list, int position1, int position2) {
		Integer temp= list.get(position1);
		list.set(position1, list.get(position2));
		list.set(position2, temp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void removeDuplicates(Collection<Integer> originalList, Collection<Integer> listToRemove) {
		
		originalList.removeAll(listToRemove);
		
		// for each loop
		//for(Integer i: listToRemove) {
		//	originalList.remove(i);
		// }
	
		
		
	}
}
