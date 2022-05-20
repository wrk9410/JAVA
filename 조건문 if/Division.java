// 정수 2개를 입력받아서 큰 수에서 ~ 작은 수로 나눈 몫과 나머지를 출력
import java.util.Scanner;

public class Division {
	public static void main(String[] args){
		/* 
		1.정수 a, b 입력받기
		Scanner scan = new Scanner(System.in);
		int a = 
		2.a / b, a % b 계산하기
		3.b / a, b % a 계산하기
		4.결과 출력하기
		*/
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수1: ");
		int num1 = in.nextInt();
		
		System.out.print("정수2: ");
		int num2 = in.nextInt();
		
		if ( num2 > num1 ){
			System.out.printf("%d / %d의 몫은 %d\n나머지는 %d",num2,num1,num2 / num1,num2 % num1);
		}
		else {
			System.out.printf("%d / %d의 몫은 %d\n나머지는 %d",num1,num2,num1 / num2, num1 % num2);
		}
	}
}