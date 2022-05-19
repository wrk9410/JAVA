// 사용자가 입력한 두 정수의 합을 출력하고
// 합이 0이면 true를 출력하고
// 그렇지 않은 경우 false를 출력해보세요.

import java.util.Scanner;

public class ZeroToTrue {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수1: ");
		int x = in.nextInt();
		System.out.print("정수2: ");
		int y = in.nextInt();
		
		int sum = x + y;
		System.out.println("두 정수의 합: "+sum);
		
		boolean result = (sum == 0);
		System.out.print("두 수의 합이 0과 같나요? " + result);
		
		
		
		
		
		
	}
}