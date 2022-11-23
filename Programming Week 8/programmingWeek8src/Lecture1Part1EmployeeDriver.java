
public class Lecture1Part1EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UnitConverter con1 = new UnitConverter();
		System.out.println("1cm is "+con1.cmToInches(1)+" inches");
		
		UnitConverter con2 = new UnitConverter();
		double answer = con2.inchesToCms(20);
		System.out.println(answer);
		
	}

} 
