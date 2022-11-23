package constructors;

public class BookWithParameters {
	
	
	private static final int MAX_TITLE_LENGTH = 20;
	
	private String title;
	/**
	 * constructor WITH PARAMETERS
	 */
	public BookWithParameters(String title){
		System.out.println("creating new book");
		// this.title = title;
		this.setTitle(title);
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
		return "Book [title=" + title + "]";
	}
	
	
	
	}

