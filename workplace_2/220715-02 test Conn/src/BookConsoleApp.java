import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class BookConsoleApp {
	private BooksRepository repo; // DAO 객체가 무조건 있어야하는 의존성이 생김

	public BookConsoleApp(BooksRepository repo) {
		this.repo = repo;
	}

	public void menu() {
		System.out.println("1. 추가, 2. 목록, 3. 삭제, 4. 수정, 5. 검색(제목)");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		switch (num) {
		case 1:
			add();
			break;
		case 2:
			list();
			break;
		case 3:
			delete();
			break;
		case 4:
			update();
			break;
		case 5:
			search();
			break;
		default:
			break;
		}
	}

	private void search() {
		System.out.println("검색할 책 제목을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String title = scan.nextLine();
		Book book;
		try {
			book = repo.selectByTitle(title);
			System.out.println(book);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void update() {
		list();
		System.out.println("수정할 번호, 새 제목, 새 가격 순입력");
		Scanner scan = new Scanner(System.in);
		
		int bookId = scan.nextInt();
		String title = scan.next();
		int price = scan.nextInt();
		
		try {
			int result = repo.update(new Book(bookId, title, price));
			System.out.println(result + "행 수정");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void add() {
		System.out.println("제목, 가격을 입력해주세요");
		Scanner scan = new Scanner(System.in);
		String title = null;
		boolean go;
		
		do {
			title = scan.nextLine();
			
			go = 40 < title.length(); // title 입력이 40자가 넘을 경우 go가 true로 바뀌어 반복진행
			if (go) {
				System.out.println("40자를 넘을 수 없습니다. 다시 입력해주세요.");
			}
		} while (go); // 40자 이하일 경우 false이기에 종료
		
		int price = scan.nextInt();

		try {
			int result = repo.add(new Book(title, price));

			System.out.println(result + "개의 책이 추가되었습니다.");
		} catch (SQLException e) {
			int code = e.getErrorCode();
			if (code == 1062) {
				System.out.println("중복된 제목. 제목을 다시 확인해주세요.");
			} else if (code == 1406) {
				System.out.println("길이가 너무 깁니다.");
			}
			System.out.println("데이터를 추가하는 과정이 실패했습니다. 다시 시도 해주세요.");
		}
	}

	private void delete() {
		list();
		System.out.println("삭제할 번호?");
		Scanner scan = new Scanner(System.in);
		int bookId = scan.nextInt();
		try {
			int result = repo.delete(bookId);
			if (result > 0) {
				System.out.println(result + "개의 책이 삭제되었습니다.");
			} else {
				System.out.println("없는 번호입니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이터를 삭제하는 과정이 실패했습니다. 다시 시도해주세요.");
		}

	}

	private void list() {
		try {
			List<Book> list = repo.list();

			if (list.size() > 0) {
				for (Book b : list) {
					System.out.println(b);
				}
			} else {
				System.out.println("책 데이터가 없습니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이터를 읽어오는 과정이 실패했습니다. 다시 시도해주세요.");
		}
	}

	public static void main(String[] args) {
		BookConsoleApp app = new BookConsoleApp(new BooksRepository());
		app.menu();

	}
}
