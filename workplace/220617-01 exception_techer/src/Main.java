import java.util.InputMismatchException;
import java.util.Scanner;

// 정수 2개 입력받아서 나누기한 몫을 출력하는 프로그램
public class Main {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("왼쪽 수 입력?");
			int left = scan.nextInt();
			System.out.println("오른쪽 수 입력?");
			int right = scan.nextInt();
		
			if (right != 0) {
				System.out.println("나눈 몫: " + (left / right));
			} else {
				System.out.println("분모에 0을 입력할 수 없습니다");
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해야합니다.");
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
}
