public class Book {
	private String name;
	private int page;
	private String athor;
	
	public Book(String name, int page, String athor) {
		super();
		this.name = name;
		this.page = page;
		this.athor = athor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getAthor() {
		return athor;
	}

	public void setAthor(String athor) {
		this.athor = athor;
	}
	
	public String toString() {
		return "제목: "+name+", 페이지수: "+page+"p, 저자: ";
	}
	
}
