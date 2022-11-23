package constructors;

public class BookWithOParamsAndISBN {

	private static final int MAX_TITLE_LENGTH = 20;
	
	private String title;
	private int ISBN;
	/**
	 * constructor WITH PARAMETERS
	 */
	public BookWithOParamsAndISBN(String title){
		System.out.println("creating new book");
		// this.title = title;
		this.setTitle(title);
	}
	
	public BookWithOParamsAndISBN(int ISBN) {
		setISBN(ISBN);
	}
	
	public BookWithOParamsAndISBN(String title, int ISBN) {
		setTitle(title);
		setISBN(ISBN);
	}
	// because we have 3 options above, we can set a book up with 
	// just a name, just and isbn or both
	

	/**
	 * @return the iSBN
	 */
	public int getISBN() {
		return ISBN;
	}

	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		if(title.length()>MAX_TITLE_LENGTH) {
			System.out.println("Title too long!"+title);
			this.title="Invalid";
		} else {
		
		this.title = title;
		}
	}

	@Override
	public String toString() {
		return "BookWithOParamsAndISBN [title=" + title + ", ISBN=" + ISBN + "]";
	}

	
	
	
	}

