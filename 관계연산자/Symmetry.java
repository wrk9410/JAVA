import java.util.Scanner;

public class Symmetry {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num1 = in.nextInt();
		
		int num2 = num1 / 1000 % 10;
		int num3 = num1 / 100 % 10;
		int num4 = num1 / 10 % 10;
		int num5 = num1 % 10;
		
		System.out.println(num2 == num5 && num3 == num4);
		
		
	}
}