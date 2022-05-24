import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		long fact = 1; // Factorial은 자칫하면 아주 커질 수 있어 long 자료형으로 설정
		int n;
		
		System.out.printf("정수를 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		
		System.out.printf("%d!은 %d입니다.\n", n, fact);
	}
}