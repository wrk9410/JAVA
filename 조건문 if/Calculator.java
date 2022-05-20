// 정수 2개와 연산자(문자열)등을 입력받아 사칙연산을 수행하는 계산기 프로그램

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// String bb = in.nextLine();
		// System.out.print("계산할 식을 적으시오: ");
		// String a = in.nextInt();
		
		// System.out.print("원하는 연산자 선택(* / + -): ");
		// String b = in.nextLine();
		System.out.print("정수1: ");
		int a = in.nextInt();
		System.out.print("*, /, +, -: ");
		in.nextLine(); // 엔터값을 가져오는 것은 String 저장값
		String b = in.nextLine();
		System.out.print("정수2: ");
		int c = in.nextInt();
		
		if (b.equals("*")) {
			System.out.printf("%d * %d = %d",a,c,a*c);
		}
		else if (b.equals("/")) {
			System.out.printf("%d / %d = %d",a,c,a/c);
		}
		else if (b.equals("-")) {
			System.out.printf("%d * %d = %d",a,c,a-c);
		}
		else if (b.equals("+")) {
			System.out.printf("%d + %d = %d",a,c,a+c);
		}
		
	}
}