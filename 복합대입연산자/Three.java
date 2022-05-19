// 사용자 3대 측정
// 벤치, 스쿼트, 데드
// 합이 500이상이면 true
// 아니면 false

import java.util.Scanner;

public class Three {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("3대 측정중... ");
		
		System.out.print("벤치 - ");
		int bnch = in.nextInt();
		System.out.print("스쿼트 - ");
		int sqt = in.nextInt();
		System.out.print("데드 - ");
		int dead = in.nextInt();
		
		boolean result = (bnch + sqt + dead) >= 500;
		
		System.out.println(result);
		
	}
}