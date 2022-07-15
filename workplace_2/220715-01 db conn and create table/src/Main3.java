import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/my_db";
		String id = "root";
		String password = "root";

		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static int insertBook(String title, int price) {
		// 문자열 결합을 통한 파라미터로 books Table에 책 한권 추가하기
		Connection conn = null;
		Statement stmt = null;
		int result = 0;

		try {
			conn = makeConnection();
			stmt = conn.createStatement();

			result = stmt.executeUpdate(
					"INSERT INTO books (title, price) VALUES (" + "'" + title + "'" + ", " + price + ");");

			System.out.println(result + "행이 추가되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return result;

	}

	public static void selectAllBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = makeConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM books");
			// executeUpdate와 executeQuery는 SQL 명령어를 실행해주는 것이지만 따로 되어있는 이유
			
			/*- executeUpdate는 int로 반환되어 테이블 형식 출력이 되지 않기에, 
			테이블 형식으로 출력 시키기 위해 executeQuery가 따로 있음*/
			System.out.println("  *코드    |  *제목\t |  *가격\n=========================");
			while(rs.next()) { // 한 번 호출 시마다 한 줄 씩 확인, 다음값이 있다 없다를 boolean값으로 반환해줌
				int id = rs.getInt("bookId");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				
				System.out.println(id + " | " + title + " | " + price);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 선입후출로 close()
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
//		insertBook("새로운 책입니당", 13000);
//		insertBook("연습", 123456);
		selectAllBook();

	}
}
