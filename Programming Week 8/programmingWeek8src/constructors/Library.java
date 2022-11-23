package constructors;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Book b1 = new Book();
	 b1.setTitle("Catch 22");
	 
	 System.out.println(b1);
	 
	 
	 BookWithParameters b2 = new BookWithParameters("1982");
	 System.out.println(b2);

	 // can still override the parameter 
	 b2.setTitle("override");
	 System.out.println(b2);
	 
	 b2.setTitle("Much longer than the maximum limit that we have set, "
	 		+ "what will happen??");
	 System.out.println(b2);
	 
	 
	 
	 
	 BookWithOParamsAndISBN b3 = new BookWithOParamsAndISBN("Just the name");
	 System.out.println(b3);
	 BookWithOParamsAndISBN b4 = new BookWithOParamsAndISBN(1000020);
	 System.out.println(b4);
	 BookWithOParamsAndISBN b5 = new BookWithOParamsAndISBN("Name and ISBN",5151515);
	 System.out.println(b5);
	 
	 
	}

}
