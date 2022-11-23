package constructors;

public class Book {
	
	private String title;
	/**
	 * constructor with no params
	 */
	public Book(){
		System.out.println("creating new book");
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
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
	
	
	}


