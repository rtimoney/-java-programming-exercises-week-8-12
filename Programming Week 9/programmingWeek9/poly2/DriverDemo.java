package poly2;

public class DriverDemo {

	public static void main(String[] args) {


		
		Lecturer myLect = new Lecturer("Ran", "eesh", 20, 20, "QUB");
		System.out.println(myLect);
		System.out.println(myLect.getFname());
		myLect.printDetails();
	}

}
