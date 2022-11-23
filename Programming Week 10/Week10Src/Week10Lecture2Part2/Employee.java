package Week10Lecture2Part2;

public class Employee implements Comparable<Employee>{
    
    private static int EMPLOYEE_TRACK = 0; //initial static ID 0, updated each time employee created
    
    private String name;
    private String surname;
    private int age;
    private int employeeID;
    
    /**
     * @param name
     * @param surname
     * @param age
     * @param employeeID
     */
    public Employee(String name, String surname, int age) {
        setName(name);
        setSurname(surname);
        setAge(age);
        
        EMPLOYEE_TRACK++;
        this.employeeID = EMPLOYEE_TRACK;//no setter provided, set at construction and cant be changed
    }
    
    
    @Override
    public String toString() {
        return String.format("Employee ID:%03d - %s,%s (%d)", employeeID,surname,name,age);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }
    
    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * @return the employeeID
     */
    public int getEmployeeID() {
        return employeeID;
    }


	@Override
	public int compareTo(Employee o) {
		// if my age is greater, we get positive return, equal then zero and less, negative
		return this.age - o.getAge();
	}
    
    
    
    
}