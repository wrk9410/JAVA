// 사용자의 입력 n, m에 대해
// n^m(n의 m제곱)을 출력하기

import java.util.Scanner;

public class InputSquared {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("몇 의?: ");
		int n = in.nextInt();
		System.out.print("몇 제곱?: ");
		int m = in.nextInt();
		int j = n;
		
		for (int i = 1; i <= m; i++) {
			System.out.println(j);
			j = n * j;
			
		}
		
	}
}