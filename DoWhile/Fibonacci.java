//Fibonacci
// 1 1 2 3 5 8 13 21 34
// 100 이하

public class Fibonacci {
	public static void main(String[] args) {
		
		int a = 1, b = 0;
		int c = 100; // 횟수
		
		do {
			b = a;
			a += b;
			System.out.println(a);
			c--;
		} while (c > 0);
	}
}