import java.util.Scanner;

public class Seven {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = in.nextInt();
		
		System.out.println((num % 7) == 0); // 0은 모든 정수의 배수
	}
}