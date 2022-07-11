import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {

		FileReader inputStream = null;
		List<Character> list = new ArrayList<>();

		try {
			inputStream = new FileReader("d:\\filetest\\test0711-2.txt");

			int c;
			while ((c = inputStream.read()) != -1) { // 반복 도중 읽는 것이 없을 경우 -1을 반환하여 조건 설정
				if (65 <= c && c < 68) {
					c += 55;
				} else if (68 <= c && c < 91) {
					c += 29;
				} else if (97 <= c && c < 120) {
					c -= 29;
				} else if (120 <= c && c < 123) {
					c -= 55;
				}
				list.add((char) c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

//		덮어쓰기
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new File("d:\\filetest\\test0711-2_1.txt"));

			for (int i = 0; i < list.size(); i++) {
				pw.print(list.get(i));
			}
			pw.flush(); // 버퍼 정리?
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}

	}
}
