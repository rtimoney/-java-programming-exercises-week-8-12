package polymorphpackage;

public class Person {
    private String fname;
    private String surname;
    private int age;
    
    /**
     * @param fname
     * @param surname
     * @param age
     */
    public Person(String fname, String surname, int age) {
        this.fname = fname;
        this.surname = surname;
        this.age = age;
    }
    
    
    
    @Override
    public String toString() {
        String output = surname + "," + fname;
        return output;
    }
    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }
    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
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
    
    
}