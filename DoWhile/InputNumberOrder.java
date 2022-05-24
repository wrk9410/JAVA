// X의 배수를 순서대로 입력하세요

// 2 ~ 9까지의 무작위 수를 정하여
// 사용자가 해당하는 수의 배수를 순서대로 입력하게 하여
// 틀릴 경우 종료

// 예) 랜덤 수가 6일 경우

// 사용자 입력
// 6 O
// 12 O
// 18 O
// 21 X 종료

import java.util.*;

public class InputNumberOrder {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		java.util.Random ran = new java.util.Random(); // java.util.을 붙히면 메인클래스명과 같아도 사용가능
		
		int num;
		int x = ran.nextInt(8); 		// (5)일 경우 : 0 ~ 5 사이의 랜덤한 수를 입력
		x += 2; // 2 ~ 9 사이의 랜덤한 숫자
		int i = 0; // 정답 횟수
		
		System.out.println(x);
		
		do {
			System.out.print("X의 배수를 순서대로 입력하세요: ");
			num = in.nextInt();
			if ( num <= 1) {
				System.out.print("잘못된 입력");
				break;
			}
			if (num % x != 0) {
				System.out.printf("오답.\n총 정답횟수:%d\n프로그램 종료",i);
			}
			else {
				i++;
				System.out.println("정답\n총 정답횟수: "+i);
			}
		} while (num % x == 0);
		
		
		/*쌤 코드
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int number = random.nextInt(8) + 2;
		System.out.println(number + "배수를 순서대로 입력하세요.");
		
		while (true) {
			int userInput = scan.nextInt();
		}
		*/
	}
}