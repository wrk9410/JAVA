import java.util.*;

public class Gcd { // 유클리드 호제법? 수학? 알고리즘. | 알고리즘을 너무 신경쓸 필요 없다
	public static void main(String[] args) {
		int x = 1, y = 2, r = 3; // 정수형 변수를 선언할 때 ,로 나누어 여러개의 선언이 가능
		System.out.print("두 개의 정수를 입력하시오(큰 수, 작은 수): " );
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		} // u가 0이 아니면 반복을 계속한다.
		System.out.printf("최대 공약수는 %d입니다.\n", x);
	}
}