import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.GapContent;

public class Booklist {
	final static int bookl = 5;
	private static Book[] book = new Book[bookl];
	
	public Booklist() {}
	
	public Booklist(Book.../*Book[]*/ book) {
		this.book = book;
	}

	public static void listGenre(String a) {
		System.out.printf("---%s 장르별---\n",a);
		for (int i = 0; i < book.length; i++) {
			if (book[i].getGenre().equals(a)) {
				System.out.println(book[i]);
			}
		}
	}
	
	public static Book books(Book[] a, Book b, int c) {
		a[c] = b;
		return book[c];
	}

	public Book getBook(int index) {
		return book[index];
	}
	
	public static void comparePrice(Book[] a) {
		//오름차순 출력
		int[] su = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if (a[i].getPrice() >= a[j].getPrice()) {
					su[i] += 1;
				}
			}
		}
		int num = a.length;
		
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length; i++) {
				if (su[i] == num) {
					System.out.println(a[i]);
				}
			}
			num--;
		}
	}
	
	/*--------------------------------------*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Book[] book = new Book[5];
		Book a = new Book("작별인사","김영하","복복서가","장편소설",12600);
		Book b = new Book("불편한 편의점","김호연","나무옆의자","장편소설",12600);
		Book c = new Book("지금 알고 있는 걸 그때도 알았더라면","류시화","열림원","시집",8100);
		Book d = new Book("코스모스","칼 세이건","사이언스북스","과학 공학",16650);
		Book e = new Book("여행의 이유","김영하","문학동네","에세이",12600);
		
		books(book,a,0);
		books(book,b,1);
		books(book,c,2);
		books(book,d,3);
		books(book,e,4);
		
		comparePrice(book);
		
		listGenre("에세이");
	}



	

}
