package arrayListsIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {


		String[] myArray = new String[5];
		System.out.println("Array length : "+myArray.length);
		myArray[0] =  "apple";
		
		
		ArrayList<String> myList = new  ArrayList<String>();
		System.out.println("Array List length : "+myList.size());
		myList.add("apple");
		myList.add("banana");
		myList.add("orange");
		System.out.println("Array List length : "+myList.size());
		System.out.println("Array List contents : "+myList);
		
		
		
		displayMyList(myList);
		System.out.println();
		displayMyListForEach(myList);
		
		System.out.println();
		myList.add(2,"pineapple");
		displayMyList(myList);
		
		
		
		boolean check = myList.contains("apple");
		System.out.println(check);
		
		System.out.println(myList.contains("berries"));
		
		// set overwrites the element at the particular index
		myList.set(2,"anann"); 
		displayMyList(myList);
		
		System.out.println();
		Collections.sort(myList);
		displayMyListForEach(myList);
		
		System.out.println();
		System.out.println("ADDING BEFORE REMOVING ");
		System.out.println();
		myList.add("apple");
		myList.add("apple");
		myList.add("apple");
		displayMyListForEach(myList);
		
		
		// removing values
		
		// removing the value at a particular index
		System.out.println();
		myList.remove(2);
		displayMyListForEach(myList);
		
		// removing the stated value - only removes one if there are multiple
		System.out.println();
		myList.remove("apple");
		displayMyListForEach(myList);
		
		System.out.println();
		while(myList.contains("apple")) {
			myList.remove("apple");
		}
		
//		System.out.println();
//		boolean check2 = false;
//		do {
//			check2 = myList.remove("apple");
//		}while(check2==true);
//		
		displayMyListForEach(myList);
		
		
		// searching - displays the last index where the object appears
		System.out.println("Where is anann? "+myList.indexOf("anann"));
		
		// -1 if not present
		System.out.println("Where is tree? "+myList.indexOf("tree"));
		
		
		// delete all of the elements:
		myList.clear();
		displayMyListForEach(myList);
	}
		
	

	public static void displayMyList(ArrayList<String> inputList) {
		for (int i=0; i<inputList.size(); i++) {
			String current = inputList.get(i);
			System.out.println(current);
		}}
		
	public static void displayMyListForEach(ArrayList<String> inputList) {	
		 for(String current1 : inputList) {
			 System.out.println("current value : "+current1);
		 }
	}

}
