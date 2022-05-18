/*사용자가 입력한 5자리의 정수를 역순으로 출력하는 프로그램
예) 12345 -> 54321*/

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 12345 -> 54321
		
		System.out.print("정수 입력: ");
		int su = in.nextInt();
		
		int reverse1 = (su / 10000);
		int reverse2 = (su / 1000 % 10);
		int reverse3 = (su / 100 % 10);
		int reverse4 = (su / 10 % 10);
		int reverse5 = (su / 1 % 10);
		
		System.out.print("정수를 역순 출력 시: "+reverse5+reverse4+reverse3+reverse2+reverse1);
	}
}