//사용자에게 정수 하나를 입력받아서
// 입력 값 -2 ~ +2 범위의 정수를 출력해보세요
// 예) 7 -> 5 6 7 8 9

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = in.nextInt();
		
		num -= 2;
		System.out.printf("%d ",num);
		num += 1;
		System.out.printf("%d ",num);
		num += 1;
		System.out.printf("%d ",num);
		num += 1;
		System.out.printf("%d ",num);
		num += 1;
		System.out.printf("%d ",num);
		
		// System.out.printf("-2 ~ +2 숫자: %d %d %d %d %d",)
	}
}