package Week10Lecture2Part2;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> myList = new ArrayList<Employee>();
		
		myList.add(new Employee("Matthew","Collins",35)); 
		myList.add(new Employee("Ronan","Timoney",27)); 
		myList.add(new Employee("Darren","Lynch",100)); 
		myList.add(new Employee("Megan","Edwards",25)); 
		
		System.out.println("Unsorted:");
		displayAll(myList);
		System.out.println();
		
		System.out.println("Sorted:");
		Collections.sort(myList);
		displayAll(myList);
		System.out.println();
		
		System.out.println("Sorting by first name");
		Collections.sort(myList, new CompareEmployeeByName());
		displayAll(myList);
	}

	private static void displayAll(ArrayList<Employee> myList) {
		for(Employee e:myList) {
			System.out.println(e.toString());
		}
		
	}

}
