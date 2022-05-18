//73p 1번

import java.util.Scanner;

public class Mile {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("마일을 입력하시오: ");
		int mile = in.nextInt();
		double mile_in = mile * 1.609;
		
		System.out.println(mile+"마일은 "+mile_in+"킬로미터입니다.");
		
		
		
	}
}