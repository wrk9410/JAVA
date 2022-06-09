
public class Book {

	private String name, author, prod, genre;
	private int price;
	
	public Book() {}
	
	public Book(String name, String author, String prod, String genre, int price) {
		super();
		this.name = name;
		this.author = author;
		this.prod = prod;
		this.genre = genre;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	
	public String getProd() {
		return prod;
	}
	public void setProd(String prod) {
		this.prod = prod;
	}

	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//배열에 잘 들어갔는지 확인하기 위한 메소드
	public String toString() { // 객체의 상태를 문자열로 반환하는 메소드
		// 파라미터를 받지않고, 문자열로 반환
		return "제목: "+name+" / 작가: " + author+" / 출판사: " + prod+" / 장르: " + genre+" / 가격: " + price+"원";
	}
	
}
