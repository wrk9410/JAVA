// 3개의 정수를 입력받아
// 가장 큰 수를 출력하세요

import java.util.Scanner;

public class Three {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		/*
		System.out.println("3개의 정수를 입력하세요");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int max;
		if (a > b) {
			if (a > c) {
				max = a;
			}
			else {
				max = c;
			}
		}
		else {
			if (b > c){
				max = b;
			} 
			else {
				max = c;
			}
		}
		
		System.out.println("가장 큰 수는 : " + max);
		*/
		
		
		
		
		
		System.out.print("정수1: ");
		int x = in.nextInt();
		System.out.print("정수2: ");
		int y = in.nextInt();
		System.out.print("정수3: ");
		int z = in.nextInt();
		
		if (x > y && x > z){
			System.out.println(x);
		}
		else if (y > z){
			System.out.println(y);
		}
		else {
			System.out.println(z);
		}
	}
}