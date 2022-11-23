package poly2;

public class Lecturer extends Employee {

	private String school;
	
	
	public Lecturer(String fname, String surname, int age, double salary, String school) {
		super(fname, surname, age, salary);
		this.school=school;
		
		
	}


	@Override
	public void printDetails() {
		System.out.println(this.getSurname()+" "+this.school);
		
	}



}
