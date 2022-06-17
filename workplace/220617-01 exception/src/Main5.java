import java.util.Scanner;

public class Main5 {
	public static int divide(int left, int right) throws MyZeroDivideException/*throws (예외 처리를 던져줄 class)*/ {
		if (right == 0) {
			throw new MyZeroDivideException("나눌 수 없음");
		} else {
			return left / right;
		}
	}
	
	public static int myFunction() {
		// 미완성
		throw new UnsupportedOperationException
							("내일 만들게. 아직 덜만듬.");
	}
	
	public static void main(String[] args) {
		myFunction();
//		Scanner scan = new Scanner(System.in);
//		
//		scan.nextInt();
		
		
		
		
		
		
		
//		RuntimeException
		int result = divide(100, 50); 
		// try catch가 없을 때는 컴파일오류 | 단, throws 받은 class에서 RuntimeException을 할 경우 try catch 없어도 가능
//		try {
//			int result = divide(100, 50);
//		} catch (MyZeroDivideException e) {
//			System.out.println(e.getMessage());
//		}
	}
}
