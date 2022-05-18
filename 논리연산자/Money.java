//73p 2번

import java.util.Scanner;

public class Money {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("받은 돈: ");
		int get_M = in.nextInt();
		// System.out.println("")
		System.out.print("상품의 총액: ");
		int buy = in.nextInt();
		
		double vat = buy * 0.1;
		int change = get_M - buy;
		
		System.out.println("부가세: "+vat);
		System.out.println("잔돈: "+change);
		
		
	}
}