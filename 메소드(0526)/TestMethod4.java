import java.util.*;

public class TestMethod4 {
	// 정수 하나를 전달받아 1 ~ 100 사이의 수이면 true를 반환하고, 그렇지 않으면 false를 반환하는 메소드 작성
	
	public static boolean between (int a) {
		if (0 < a && a <= 100) {
			return true;
		} else {
			System.out.println("잘못된 입력 입니다.");
			return false;
		}
	}
	
	/*public static int getSum(int a, int b, int c) {
		if (between(a) && between(b) && between(c)){
			return a+b+c;
		} else {
			System.out.println("잘못된 입력 입니다. 종료");
		}
	}*/

	public static void main(String[] args) {
		//쌤 코드
		Scanner scanner = new Scanner(System.in);
		
		int kor;
		int eng;
		int math;
		do {
			// 국어 점수 입력받기
			System.out.println("국어 점수?");
			kor = scanner.nextInt();
			// 국어 점수 확인하기
		} while (!(between(kor))); // 1. 범위가 맞으면 다음, 2. 틀리면 다시 입력
		
		do {
			System.out.println("영어 점수?");
			eng = scanner.nextInt();			
		} while ( !(between(kor)) );
		
		do {
			System.out.println("수학 점수?");
			math = scanner.nextInt();			
		} while ( !(between(kor)) );
		
		
		
		
		
		//getSum(kor,eng,math);
		int sum = kor + eng + math;
		
		System.out.println("국어점수: "+kor);
		System.out.println("영어점수: "+eng);
		System.out.println("수학점수: "+math);
		
		System.out.println("총합: "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner in = new Scanner(System.in);
		
		System.out.println("국어점수: ");
		int kor = in.nextInt();
		
		if () {
			
		}
		
		System.out.println("영어점수: ");
		int eng = in.nextInt();
		
		
		System.out.println("수학점수: ");
		int math = in.nextInt();
		// 쌤 코드
		
		// for (int i = 0; i < 3; i++){
			// System.out.printf("수 입력%d: ",i+1);
			// int a = in.nextInt();
			// if (i == 1) {
				// eng = a;
			// }
			// else if (i == 2) {
				// math = a;
			// }
			// else {
				// kor = a;
			// }
		// }
		
		// System.out.println("수 입력: ");
		// System.out.println(between(a));
		
		
		
		// 사용자가 점수 입력을 3번 하는데 (점수는 무조건 1 ~ 100 사이여야함.)
		//점수 합을 출력해보세요
		
		System.out.println(getSum(kor,eng,math));*/
		
	}
}