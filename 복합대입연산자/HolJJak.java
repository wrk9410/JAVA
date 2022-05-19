// 사용자가 입력한 정수가
// 짝수면 true
// 홀수면 false를 출력해보세요

import java.util.Scanner;

public class HolJJak{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = in.nextInt();
		
		boolean result = (num % 2) == 0; // boolean : 결과 값이 true, false로 나오는 것
		
		System.out.println(result);
	}
}