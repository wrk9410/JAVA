// 2. 전달받은 정수만큼 "안녕"이라는 문자열을 출력하는 메소드. (반환 없음)

import java.util.*;

public class IntHello {
	
	public static void helloRepeart(int a) {
		for (int i = 0; i < a; i++) {
			System.out.println("안녕");
		}
		//return;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			
		System.out.print("노출 원하는 횟수: ");
		int a = in.nextInt();
		
		helloRepeart(a);
	}
}