import java.util.Scanner;

public class InOrder {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수 입력1: ");
		int num1 = in.nextInt();
		
		System.out.print("정수 입력2: ");
		int num2 = in.nextInt();
		
		System.out.print("정수 입력3: ");
		int num3 = in.nextInt();
		
		
		
		System.out.println(num2 == ++num1 && num3 == ++num2);
		
		
	}
}