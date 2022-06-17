import java.util.InputMismatchException;
import java.util.Scanner;

// 정수 2개 입력받아서 나누기한 몫을 출력하는 프로그램
public class Main {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner scan = new Scanner(System.in);
		
		/*try { // 예외가 발생할 수 있을 경우 catch로 가서 정상적으로 처리가 됨
			// 프로그램 흐름 문장
		} catch () {
			// 예외를 처리하는 문장
		}*/
		
		try { // 실행문구 입력
			System.out.println("왼쪽 수 입력?");
			int left = scan.nextInt();
			System.out.println("오른쪽 수 입력?");
			int right = scan.nextInt();
		
			if (right != 0) {
				System.out.println("나눈 몫: " + (left / right));
			} else {
				System.out.println("분모에 0을 입력할 수 없습니다.");
			}
		} catch (InputMismatchException e) { // 예외적 상황 발생 시 실행
			System.out.println("숫자를 입력해야합니다.");
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}

}
