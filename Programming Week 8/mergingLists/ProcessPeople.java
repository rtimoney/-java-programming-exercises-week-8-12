
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProcessPeople {
    
    public static void main(String[] args) {
       
    	
    	ArrayList<Person> people = readPeopleFromFile("PeopleData.csv");
        
        for(Person p: people) {
            if(p.getAge()<60) {
                System.out.println(p.toString());
            System.out.println("\t Age: "+p.getAge());  // the \t is just a tab to indent the text 
            }
        }
        
        System.out.println();
        System.out.println();
        System.out.println(people.toString());
        
        
    }
    public static ArrayList<Person> readPeopleFromFile(String filename) {
        
        ArrayList<Person> list = new ArrayList<Person>();
        
        //do the file reading  &   put values in list
        
        try {
            File myFile = new File(filename);
            FileReader fr = new FileReader(myFile);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine(); //attempt to read first line (probably the header)
            line = br.readLine(); //read the actual first line as header not needed
            while(line != null) {
                
            	// divide the different components of each line using the commas as a divider
                String[] parts = line.split(",");
                
                String fname = parts[0];
                String surname = parts[1];
                // convert the age column from a String to an int
                int age = Integer.parseInt(parts[2]);
                
                //our person constructor expects two strings and an int so conversion above is essential
                Person p1 = new Person(fname, surname, age);
                list.add(p1);
                
                line = br.readLine(); //read next line (null if at end)
            }
            
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("File not found - did you mistype?");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("General IO Exception");
        } catch (Exception e) {
            System.out.println("Something bad happened");
            e.printStackTrace();
        }
        
        
        
        return list;
    }
    }