import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/world";
		// jdbc:mysql://, 프로토콜 | localhost:3306, 내 컴퓨터의 port | /(가져올 DB)
		String id = "root"; // 아이디 저장
		String password = "root"; // 비밀번호 저장

		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // com.mysql.cj.jdbc. : 패키지 | .Driver : 클래스(class)
			System.out.println("드라이버 적재 성공"); // 클래스 등록 성공?

			conn = DriverManager.getConnection(url, id, password); // 연결 후 다 쓰고 나면 닫아주어야 함
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결에 실패하였습니다.");
		} finally {
			if (conn != null) {
				try {
					conn.close();
					System.out.println("연결을 닫았습니다.");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
