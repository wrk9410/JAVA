import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Driver마다 다르기에 검색하여 입력하면 됨. 외울 필요 X
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", /* ID */"root", /* PASS */"root");

			// table A : 컬럼 B VARCHAR(10) PK
//			String query = "CREATE TABLE A (B VARCHAR(10) PRIMARY KEY);";
			String query = "Drop Table A";
			stmt = conn.createStatement();

			stmt.executeUpdate(query); // Update: 수정, 추가, 생성, 변경, 삭제 등에서 사용
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 연 순서의 역순으로 닫기
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
}
