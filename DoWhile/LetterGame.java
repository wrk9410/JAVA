// 반복을 이용한 게임 프로그램
import java.util.*;

public class LetterGame {
	public static void main(String[] args) {
		
		Random random = new Random(); // random한 난수를 생성하는 클래스
		int answer = random.nextInt(100); // 정답
		int guess;
		int tries = 0;
		Scanner scan = new Scanner(System.in);
		//반복 구조
		do {
			System.out.print("정답을 추측하여 보시오: ");
			guess = scan.nextInt();
			tries++;
			if (guess > answer) { // 사용자가 입력한 정수가 정답보다 높으면
				System.out.println("제시한 정수가 높습니다.");
			}
			if (guess < answer) { // 사용자가 입력한 정수가 정답보다 낮으면
				System.out.println("제시한 정수가 낮습니다.");
			}
		} while (guess != answer);
		System.out.printf("축하합니다. 시도 횟수=%d\n",tries);
	}
}