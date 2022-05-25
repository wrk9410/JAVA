// 주문번호를 입력하면
// 성별을 출력하는 프로그램
// 예) 주민번호 xxxxxx - 1xxxxxx

import java.util.*;

public class KoreanCode {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("주민번호 입력(띄어쓰기 시 오류): ");
		String id = in.nextLine();
		
		
		switch (id.charAt(7)) {
			case '1':
			case '3':
			System.out.println("남성");
			break;
			case '2':
			case '4':
			System.out.println("여성");
			break;
			default:
				System.out.println("존재할 수 없는 주민번호 입니다.");
		}
		
		/*쌤 코드
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호 ?");	
		String code = scan.nextLine();
		String result;
		
		if (code.length() == 14) {
			char c = code.charAt(7);
			switch (c) {
				case '1': case '3':
					System.out.println("남성");
					break;
				case '2': case '4':
					System.out.println("여성");
					break;
				default:
					result = "잘못 입력";
					break;
			}
		} else {
			result = "잘못 입력";
		} 
		System.out.println(result); */
		
		
	}
}