
public class Author extends Person {
	private String booklist;
	
	public Author(String name, int age, String bookList) {
		super(name, age);
		this.booklist = bookList;
	}

	public String getBookList() {
		return booklist;
	}
}
