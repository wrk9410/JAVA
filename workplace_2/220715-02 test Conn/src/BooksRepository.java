import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class BooksRepository { // DAO : Data Access Object = 로직없이 DB작업만 있는 것
	
	private Book ResultMapping(ResultSet rs) throws SQLException { // DB작업(booksRepository 클래스) 내에서만 사용하기 위해 private 설정
		int bookId = rs.getInt("bookId");
		String title = rs.getString("title");
		int price = rs.getInt("price");
		
		return new Book(bookId, title, price);
	}
	
	// 추가
	public int add(Book book) throws SQLException { 
		// int만 반환하기에 (MySQL의 Unique data 중복, 서버 안켜져있음) 등으로 안되는 모든 예외에 대한 번호를 만들기에는 번거롭고, 겹침으로 인한 에러가 발생할 수 있기에 throws 후 처리
		String query = "INSERT INTO books (title, price) VALUES('" + book.getTitle() + "', " + book.getPrice() + ")";
		System.out.println("추가: " + query);
		
		Connection conn = null;
		Statement stmt = null;
				
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally { // try-catch에서 catch가 없더라도 finally 설정 가능
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	// 목록 전체 
	public List<Book> list() throws SQLException {
		String query = "SELECT * FROM books";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Book> list = new ArrayList<>();
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				list.add(ResultMapping(rs));
			}
			return list; // 순서를 보면 return이 먼저 실행될 것 같지만, finally가 먼저 실행되어 try 내부이든, try 외부이든 상관없이 return 하면 됨
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	

	// 검색(제목) or 검색 (가격)
	public Book selectByTitle(String title) throws SQLException {
		// 문자열을 받기위해 문자열 파라미터 설정
		String query = "SELECT * FROM books WHERE title = '" + title + "'";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			if (rs.next()) {
				return ResultMapping(rs);
			} else {
				List<Book> emp = new ArrayList();
				return emp.get(0);
			}
			
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
//	public List<Book> selectByPrice(int pirce) {};
	
	// 삭제
	public int delete(int bookId) throws SQLException {
		String query = "DELETE FROM books WHERE bookId = " + bookId;
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	
	// 수정
	public int update(Book book) throws SQLException {
		String query = "UPDATE books SET title = '"+ book.getTitle()
		+ "', price = " + book.getPrice()
		+ " WHERE bookId = " + book.getBookId();
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}


}
