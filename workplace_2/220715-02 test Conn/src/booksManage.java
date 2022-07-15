import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import kr.co.greenart.dbutil.DBUtil;

public class booksManage {

	public static void main(String[] args) {
		/*
		 * my_db.books
		 * 
		 * 도서관리 프로그램
		 * 기능 : 추가, 전체 목록, 아이디/제목/가격 등으로 검색 가능, 삭제, 수저
		 * 
		 * */
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
//		try {
//			conn = DBUtil.getConnection();
//			stmt = conn.createStatement();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
		
		
		System.out.println("*도서관리 프로그램*");
		Scanner sc = new Scanner(System.in);
		int a;
		do {
			System.out.println("0.종료   1.도서추가   2.전체도서목록   3.도서삭제   4.도서수정: ");
			a = sc.nextInt();
			sc.nextLine();
			String title;
			int price;
			
			switch (a) {
				case 1: {
					System.out.print("제목: ");
					title = sc.nextLine();
					System.out.print("가격: ");
					price = sc.nextInt();
					DBUtil.insertBook(title, price);
					break;
				}
				case 2: {
					DBUtil.selectAllBook();
					break;
				}
				
				
				
				default : System.out.println("프로그램이 종료 되었습니다.");
			}
			
			
		} while (a != 0 || a < 0);
		
		
		
	}

}
