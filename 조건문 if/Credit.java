// 사용자의 학점
// 점수를 입력받아
// 90점 이상 A
// 80점 이상 90점 미만 B
// 70점 이상 80점 미만 C
// 60점 이상 70점 미만 D
// 60점 미만 F

import java.util.Scanner;

public class Credit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("학점: ");
		int score = in.nextInt();
		
		if (0 <= score && score <= 100) {
			if (90 <= score) {
				System.out.println("등급: A");
			}
			else if (80 <= score) {
				System.out.println("등급: B");
			}
			else if (70 <= score) {
				System.out.println("등급: C");
			}
			else if (60 <= score) {
				System.out.println("등급: D");
			}
			else {
				System.out.println("등급: F");
			}
		}
		else {
			System.out.println("0 ~ 100 사이의 숫자만 입력 가능");
		}
		
		/*쌤 코드
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80){
			grade = 'B';
		} else if (score >= 70){
			grade = 'C';
		} else if (score >= 60){
			grade = 'D';
		} else {
			grade = 'F';
		}
		*/
	}
}