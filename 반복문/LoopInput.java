// 0부터 1씩 증가하는 수를 출력하기.
// 사용자가 입력한 원하는 횟수만큼 출력

import java.util.Scanner;

public class LoopInput {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("원하는 횟수: ");
		int i = in.nextInt();
		int j = 0;
		
		while (j <= i) {
			System.out.println(j);
			j++;
		}
	}
}