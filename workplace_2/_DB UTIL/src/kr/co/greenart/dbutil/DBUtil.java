package kr.co.greenart.dbutil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class DBUtil {
	private final static Properties properties = new Properties();
	
	static {
		// 파일을 읽기위해서는 fileInputStream이 필요 (fileInputStream(경로))
		InputStream inStream = null;
		
		try {
			inStream = DBUtil.class.getClassLoader()
					.getResourceAsStream("mysql.properties"); // 정보를 등록해둔 mysql.properties를 가져옴
			
			properties.load(inStream); // getResource'AsStream(인풋스트림을 가져옴)'
			
			String driverClass = properties.getProperty("JDBC_DRIVER_CLASS");
			
			// 드라이버 로드(적재)
			Class.forName(driverClass);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				inStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static Connection getConnection() throws SQLException {
		
		String url = properties.getProperty("JDBC_URL");
		String id = properties.getProperty("JDBC_USERNAME");
		String password = properties.getProperty("JDBC_PASSWORD");
		
		return DriverManager.getConnection(url, id, password);
	}
	
	
	public static void closeConn(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void closeStmt(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void closeRS(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static int insertBook(String title, int price) {
		// 문자열 결합을 통한 파라미터로 books Table에 책 한권 추가하기
		Connection conn = null;
		Statement stmt = null;
		int result = 0;

		try {
			conn = getConnection();
			stmt = conn.createStatement();

			result = stmt.executeUpdate(
					"INSERT INTO books (title, price) VALUES (" + "'" + title + "'" + ", " + price + ");");

			System.out.println("\""+title+"\" " + result + "권이 추가되었습니다.");

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
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM books");
			
			System.out.println("  *코드    |  *제목\t |  *가격\n=========================");
			while(rs.next()) {
				int id = rs.getInt("bookId");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				
				System.out.println(id + " | " + title + " | " + price);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
	
	
	
	
	
	
	
	
}
