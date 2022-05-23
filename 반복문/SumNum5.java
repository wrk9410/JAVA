// 사용자가 입력한 5개의 정수의 합 구하기
import java.util.Scanner;

public class SumNum5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 입력
		System.out.println("5개의 정수 입력.");
		int sum = 0; // 총합을 저장하는 변수
		for (int i = 0; i < 5; i++) {
			int num = scan.nextInt(); // 지역변수
			// 연산
			sum += num;
		}
		
		// System.out.println(num); // num은 for문 안의 지역변수이기에 밖에서 사용불가
		
		// 출력
		System.out.println(sum);
	}
}