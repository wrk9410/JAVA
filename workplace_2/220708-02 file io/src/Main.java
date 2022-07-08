import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File diaryFile = new File("d:\\filetest\\diary.txt");
		System.out.println(diaryFile.exists()); // 정상적으로 건드릴 파일을 잡고 있는지 확인
		Scanner scanner = null;

		try {
			scanner = new Scanner(diaryFile, "UTF-8");
			// Scanner의 기본은 System.in이지만 File에서 확인을(빨대를 꽂기) 위해서는 해당 File 객체 참조변수 입력

			// scanner에 빨대 꽂은 파일 읽기
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException/* IOException 으로도 가능(덜 구체적) */ e) {
			System.out.println("파일을 찾지 못했습니다.");
		} finally { // 언제나 마지막은 닫힐 수 있게 finally 처리
			if (scanner != null) { // 비어있는지 먼저 확인 후
				scanner.close(); // 빨대 빼기
			}
		}
	}

}
