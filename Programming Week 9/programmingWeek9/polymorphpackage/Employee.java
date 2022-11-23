package polymorphpackage;

public class Employee extends Person {

	private double salary;
	
	public Employee(String fname, String surname, int age, double salary) {
		super(fname, surname, age);
		this.setSalary(salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Dr "+this.getSurname()+" costs us "+this.salary;
	}
	
	

}
