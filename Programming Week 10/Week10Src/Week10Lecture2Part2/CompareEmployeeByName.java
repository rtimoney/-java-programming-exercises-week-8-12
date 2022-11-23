package Week10Lecture2Part2;

import java.util.Comparator;

public class CompareEmployeeByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// compare the employees based on name 
		return o1.getName().compareTo(o2.getName());
	}
	
	

	
}
