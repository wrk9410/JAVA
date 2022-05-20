import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		System.out.println("한 줄을 입력하세요.");
		scan.nextLine(); // enter 키가 남아있기에 없애주는 작업
		String line = scan.nextLine();
		
		System.out.println(line);
	}
}