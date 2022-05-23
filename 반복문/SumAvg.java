// 사용자가 몇 개의 정수를 입력하지 먼저 정한 후.
// 정수를 입력하면
// 합과 평균을 구해서 출력하는 프로그램.

// 짝수의 합, 평균
// 홀수의 합, 평균

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("입력 원하는 횟수: ");
		int inNum = in.nextInt();
		/*int sum = 0;

		for (int i = inNum; i > 0; i--) {
			int num = in.nextInt();
			sum += num;
			// 위 2줄을 sum += scan.nextInt();로 축약 가능
		}

		System.out.printf("총합: %d\n평균: %d\n",sum,sum / inNum);*/
		
		int sumJ = 0;
		int sumH = 0;
		int j = 0;
		int h = 0;
		
		for (int i = inNum; i > 0; i--) {
			int num = in.nextInt();
			if (num % 2 == 0) {
				sumJ += num;
				j += 1;
			}else {
				sumH += num;
				h += 1;
			}
		}

		System.out.printf("짝수 총합: %d\n평균: %d\n",sumJ,sumJ / j);
		System.out.printf("홀수 총합: %d\n평균: %d\n",sumH,sumH / h);
		
		
		
	}
}