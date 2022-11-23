import java.util.ArrayList;

public class mergingArrayLists {

	public static void main(String[] args) {
		
		 ArrayList<String> listA = new ArrayList<String>();
	        listA.add("One");
	        listA.add("Two");
	        listA.add("Two");
	        listA.add("Three");
	        listA.add("Four");
	        
	        ArrayList<String> listB = new ArrayList<String>();
	        listB.add("Five");
	        listB.add("Two");
	        listB.add("Two");
	        listB.add("Three");
	        listB.add("Six");
	        
	        System.out.println("A before: "+listA);
	        System.out.println("B before: "+listB);
	        
//	        addToListNoDupes(listA, listB);
//	        System.out.println("A after: "+listA);
//	        System.out.println("B after: "+listB);
	        
	        // creating the actual new array list which is populated by our method 
	        ArrayList<String> output = mergeNoDupes(listA, listB);
	        
	        System.out.println("A after: "+listA);
	        System.out.println("B after: "+listB);
	        System.out.println("Combined after: "+output);
	    }
	    
	/**
	 * 
	 * @param target - array list that we are adding to
	 * @param source - array list we are taking from 
	 */
	    public static void addToListNoDupes(ArrayList<String> target, ArrayList<String> source) {
	       // for every String 'val' in the array list 'source' do...
	    	for(String val: source) {
	    		// if the value isn't already in the target list ....
	            if(!target.contains(val)) {
	            	// add the value to the target list 
	                target.add(val);
	            }
	        }
	    }
	    
	    public static   ArrayList<String> mergeNoDupes(ArrayList<String> list1, ArrayList<String> list2) {
	       
	    	// we are going to create a new array list with no duplicates, even from within each array
	    	
	    	// creating the form of the new array list 
	    	ArrayList<String> merged = new ArrayList<String>();
	       
	    	//add unique values from first list
	        for(String val: list1) {
	            if(!merged.contains(val)) {
	                merged.add(val);
	            }
	        }
	        //add unique values from second list
	        for(String val: list2) {
	            if(!merged.contains(val)) {
	                merged.add(val);
	            }
	        }
	        
	        return merged; //return final combined list
	    }
	}


