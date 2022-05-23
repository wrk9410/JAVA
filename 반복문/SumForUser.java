import java.util.Scanner;

public class SumForUser {
	public static void main(String[] args) {
		// 사용자가 정수 범위를 지정. (시작-끝 입력받기)
		// 해당 범위의 합
		
		Scanner in = new Scanner(System.in);
		
		//시작과 끝 입력받기
		System.out.print("시작: ");
		int i = in.nextInt();
		System.out.print("끝: ");
		int j = in.nextInt();
		
		//시작과 끝의 모든 합 담아두기
		int sum = 0;
		
		// 시작 > 끝까지 반복
		for (;i <= j; i++) {
			sum += i;
		}
		
		//총합의 출력
		System.out.println(sum);
	}
}