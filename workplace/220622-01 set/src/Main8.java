import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Book2 implements Comparable<Book2> {
	private String title;
	private int price;
	public Book2(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	@Override
	public int hashCode() { // set은 hash를 1차적으로 확인함
		return Objects.hash(title, price); // .hash(고유한 숫자값을 만들어 낼 필드명, ...) | (보류:.hash로 동일한 필드값의 hashcode를 확인)
	} // hashCode()가 있을 경우 인스턴스의 주소값이 동일해짐
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book2 other = (Book2) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Book2 o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
public class Main8 {

	public static void main(String[] args) {
		Book2 b1 = new Book2("책1", 5000);
		Book2 b2 = new Book2("책3", 4000);
		Book2 b3 = new Book2("책1", 5000);
		Book2 b4 = new Book2("책2", 7000);
		
		Set<Book2> tree = new TreeSet<>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		tree.add(b4);
		
		System.out.println(tree);
			
//		int hash1 = Objects.hash(5000, "책1"); // Objects.hash(원소값, 원소값, ...)원소값이 같을 경우 항상 동일한 숫자값이 만들어짐
//		int hash2 = Objects.hash(5000, "책1");
//		int hash3 = Objects.hash(5000, "책2");
//		int hash4 = Objects.hash(5001, "책1");
//		
//		System.out.println(hash1);
//		System.out.println(hash2);
//		System.out.println(hash3);
//		System.out.println(hash4);
		
//		
//		System.out.println(b1.equals(b2));
//		System.out.println(b1.equals(b3));
//		
//		Set<Book> set = new HashSet<>();
//		// 각 값이 가지고 있는 고유한 숫자값을 Hash라고함
//		// set은 hash를 먼저 살펴보고, hash가 다르면 다르다고 판별(1차 확인 hash, 2차 확인 equals)
//		// b1, b2는 다른 hash값을 가짐 > 동등한 객체끼리는 같은 hash를 가지고 있음
//		set.add(b1);
//		set.add(b2);
//		set.add(b3);
//		
//		System.out.println(set.size());
//		System.out.println(set);

	}

}
