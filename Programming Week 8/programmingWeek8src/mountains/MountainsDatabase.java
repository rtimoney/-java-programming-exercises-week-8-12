package mountains;

public class MountainsDatabase {

	public static void main(String[] args) {
		
         Mountain m1 = new Mountain();
		
		m1.setHeight(500);
	   m1.setName("Ronan");
		
		System.out.println(m1);
			
		
		Mountain[] mountainList = new Mountain[2];
		
		for(int i=0; i<mountainList.length; i++) {
			mountainList[i]= new Mountain();
		}

		mountainList[0].setName("Everest");
		mountainList[0].setHeight(9000);
		
		mountainList[1].setName("Slieve Donard");
		mountainList[1].setHeight(900);
		
		System.out.println(mountainList[1]);
		
		for(int i=0; i< mountainList.length; i++ ) {
			System.out.println(mountainList[i]);
			}
			
			
	}
}		
			
			
		
		
		
	


