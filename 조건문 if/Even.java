// 사용자가 정수를 입력받아
// 짝수면 "짝수입니다". 출력하기
// 홀수면 "홀수입니다." 출력하기

import java.util.Scanner;

public class Even {
	public static void main(String[] args){
		/*
		if (조건식) {
			// 문장 1
			// 문장 2
		}
		else {
			// 문장 3
			// 문장 4
		}
		//문장 5
		*/
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int num = in.nextInt();
		
		int expres = num % 2;
		
		if (expres == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		System.out.println("\n프로그램 종료");
		
		
		
	}
}