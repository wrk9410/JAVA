import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class RestaurantsDaoImpl implements RestaurantsDao { // 인터페이스의 구현 class는 끝에 Impl을 적음
	
	private Restaurants resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String phoneNumber = rs.getString("phoneNumber");
		String address = rs.getString("address");
		
		return new Restaurants(id, name, phoneNumber, address);
	}
	
	public int[] create(List<Restaurants> list) throws SQLException {
		String query = "INSERT INTO restaurants (name, phoneNumber, address) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
			for (Restaurants r : list) {
				pstmt.setString(1, r.getName());
				pstmt.setString(2, r.getphoneNumber());
				pstmt.setString(3, r.getAddress());
				pstmt.addBatch(); // addBatch(): 같은 작업을 한 번에 몰아서 하는 것
			}
			
			return pstmt.executeBatch();
			
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}
	
	
	@Override
	public int create(String name, String phoneNumber, String address) throws SQLException {
		String query = "INSERT INTO restaurants (name, phoneNumber, address) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query); // 그냥 stmt일 경우 악의적인 명령어로 입력했을 때 문장이 실행되어 공격받지만 pstmt를 사용 시 ``가 붙어져 문자열 처리가 되어 보안상에서 매우 유리
			pstmt.setString(1, name); // (몇 번째 물음표인지, 넣을값) | '' 자동 삽입
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);
			
			return pstmt.executeUpdate(); // 원래는 ()안에 query를 넣지만 이미 준비가 끝난 query문이 있기에 비워두면 됨
		} finally {
			DBUtil.closeStmt(pstmt); // stmt와 동일하게 사용이 끝난 후 닫아주어야 됨
			DBUtil.closeConn(conn);
		}
	}

	@Override
	public List<Restaurants> read() throws SQLException {
		String query = "SELECT * FROM restaurants";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Restaurants> list = new ArrayList<>();
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				list.add(resultMapping(rs));
			}
		} finally {
				DBUtil.closeRS(rs);
				DBUtil.closeStmt(pstmt);
				DBUtil.closeConn(conn);
			}
		return list;
	}

	@Override
	public Restaurants read(int id) throws SQLException {
		String query = "SELECT * FROM restaurants WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // 행을 확인 하는 것
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				return resultMapping(rs);
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		
		return null;
	}

	@Override
	public int update(int id, String name, String phoneNumber, String address) throws SQLException {
		String query = "UPDATE restaurants SET name = ?, phoneNumber = ?, address = ? WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);
			pstmt.setInt(4, id);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	@Override
	public int delete(int id) throws SQLException {
		String query = "DELETE FROM restaurants WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	

}
