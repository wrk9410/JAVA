//사용자의 점수(정수형)를 입력받아
// 60점 이상이면 "합격" 출력
// 60점 미만이면 "불합격" 문자열과 부족한 점수도 같이 출력

import java.util.Scanner;

public class Pass {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("내 점수는? ");
		int score = in.nextInt();
		
		if (0 > score || score > 100) {
			System.out.println("잘못된 입력입니다.");
		}
		else if (score >= 60) {
			System.out.println("합격");
		}
		else {
			System.out.printf("불합격\n부족한 점수: %d점",60 - score);
		}
	}
}