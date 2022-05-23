// 자판기 프로그램
// 돈 입력
// 반복하여 입력을 받아
// 1번 콜라 : 1500
// 2번 사이다 : 1300
// 3번 계산
//총 몇 개의 캔을 구입하고, 거스름돈은 얼마인지 출력하세요

import java.util.Scanner;

public class VMachine {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int coke = 1500;
		int sprite = 1300;
		int sum = 0;
		int can = 0;
		
		System.out.print("지폐투입기: ");
			int money = in.nextInt();
		
		for (int i = 0; i != 3; ) {
			System.out.print("1번 콜라, 2번 사이다, 3번 계산: ");
			int j = in.nextInt();
			if (j == 1) {
				sum += coke;
				can += 1;				
			} else if ( j == 2) {
				sum += sprite;
				can += 1;
			} /*else if ((money - sum) < 0){
				System.out.println("투입금액 부족!!");
				System.out.print("더 넣을 금액 : ");
			money = in.nextInt();
			} */
			 else {
				System.out.printf("구입 캔 수: %d\n 거스름돈: %d\n",can,money - sum);
				i += 3;
			}
		}
	}
}