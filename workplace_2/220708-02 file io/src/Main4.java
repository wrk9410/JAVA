import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main4 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");

		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new FileWriter(file));

			pw.println("문자열 한 줄을 출력합니다."); // 파일 대상으로의 System.out.println();
			pw.println(10);
			pw.println(15.15);
			pw.flush(); // 추가했던 내용이 들어간 임시공간 내부 지우기

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}
