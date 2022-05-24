// 사용자에게 비밀번호를 물어보고 동일한 경우 통과
// 최대 3번의 기회를 줌

import java.util.*;

public class Password {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String pass = "password123";
		
		for (int i = 3; i > 0;) {
			i--;
			System.out.println("비밀번호를 입력해주세요.");
			String input = in.nextLine();
			if (pass.equals(input)) {
				System.out.println("비밀번호 인증 완료");
				break;
			} else {
				if (i > 0) {
					System.out.printf("비밀번호가 틀렸습니다!!!\n남은 횟수:%d\n",i);					
				} else {
					System.out.println("남은 횟수가 없어 프로그램이 종료됩니다.");
					break;
				}
			}
		}		
	}
}