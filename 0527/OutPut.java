import java.util.Scanner;

public class OutPut {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//1.Book
		System.out.println("* Book *");
		Book s = new Book();
		System.out.print("책제목: ");
		s.title = in.nextLine();
		System.out.print("저자명: ");
		s.author = in.nextLine();
		
		s.printAll();
		
		//2.Weather
		System.out.println("\n======================================\n * Weather *");
		
		Weather w = new Weather();
		
		System.out.print("연도: ");
		
		w.year = in.nextInt();
		System.out.print("월: ");
		w.month = in.nextInt();
		System.out.print("일: ");
		w.day = in.nextInt();
		
		
		System.out.println("1.xxxx-xx-xx\n2.xx-xx-xx");
		int a = in.nextInt();
		
		w.printAll(a);
		
		//3.Movie
		System.out.println("\n======================================\n * Movie *");
		
		
		Movie m = new Movie();
		
		in.nextLine();
		m.title = in.nextLine();
		m.rating = in.nextInt();
		in.nextLine();
		m.director = in.nextLine();
		m.year = in.nextInt();
		
		m.printAll();
		
	}
}