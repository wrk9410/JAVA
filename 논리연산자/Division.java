//101p 2번, 큰 수를 먼저 입력하겠습니다~~

import java.util.Scanner;

public class Division {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("큰 정수를 입력하겠습니다~~: ");
		int big = in.nextInt();
		System.out.print("작은 정수를 입력하겠습니다~~: ");
		int small = in.nextInt();
		
		int share = big / small;
		int remain = big % small;
		
		System.out.println(big+"을 "+small+"(으)로 나눈 몫은 "+share+"이고 나머지는 "+remain+"입니다.");
	}
}

