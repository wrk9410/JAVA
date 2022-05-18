//103p 6번

import java.util.Scanner;

public class PiggyBank {
	public static void main(String[] agrs) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int five_h = in.nextInt();
		System.out.print("100원 개수: ");
		int hundred = in.nextInt();
		System.out.print("50원 개수: ");
		int five_t = in.nextInt();
		System.out.print("10원 개수: ");
		int ten = in.nextInt();
		
		five_h = five_h * 500;
		hundred = hundred * 100;
		five_t = five_t * 50;
		ten = ten * 10;
		
		int total = five_h+hundred+five_t+ten;
		
		System.out.println("저금통 총 금액: "+total);
		
		
	}
}