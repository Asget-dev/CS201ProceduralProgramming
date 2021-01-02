package arraysProject;

public class Book {// Data member
	private String title;
	private String author;
	private String ISBN;

	public Book(String t, String a, String i) {// Constractor
		title = t;
		author = a;
		ISBN = i;
	}

	public String title() {
		return title;
	}

	public String author() {
		return author;
	}

	public String ISBN() {
		return ISBN;
	}

	public void setTitle(String t) {
		title = t;
	}

	public void setAuthor(String a) {
		author = a;
	}

	public void setISBN(String i) {
		ISBN = i;
	}

}
