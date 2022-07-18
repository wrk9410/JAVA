import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.co.greenart.dbutil.DBUtil;

public class TestConn {
	
	/*
	 * C(상호명, 전화번호, 주소) or C(음식점) : 행 개수
	 * R() : List<음식점>
	 * R(id) : 음식점
	 * U(id, 새 상호명, 새 전화번호, 새 주소) or U(음식점) : 행 개수
	 * D(id) : 행 개수
	 * -------------------------------------------------------------------------------------------------------
	 * 
	 * 여러 행의 음식점 추가
	 * */
	
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		System.out.println("실행 흐름 1");
		
		try {
			conn = DBUtil.getConnection();
			
			System.out.println("실행 흐름 2");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT 1");
			
			if (rs.next()) {
				int result = rs.getInt(1);
				System.out.println("확인 : " + result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		
	}
}


