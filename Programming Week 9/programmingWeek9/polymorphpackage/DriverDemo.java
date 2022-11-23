package polymorphpackage;

public class DriverDemo {

	public static void main(String[] args) {


		Person p1 = new Person("ronan", "ronan", 27);
		System.out.println(p1);
		System.out.println(p1.getAge());
		
		Employee e1 = new Employee("RONAN", "TIMONEY", 27, 18500);
		System.out.println(e1);
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println("Payrise for RONAN");
		e1.setSalary(23000);
		System.out.println(e1.getSalary());
		
		System.out.println();
		// Person (the parent class) has its own toString method and we
		// can call this for Employee. but we can also override the toString method in the Employee 
		// class to make a more tailored method for the child class
		System.out.println(p1.toString()); 
		System.out.println(e1.toString());
	}

}
