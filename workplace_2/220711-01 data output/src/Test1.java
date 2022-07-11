import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("d:\\filetest\\test0711-1.txt"));

			String line;
			while ((line = br.readLine()) != null) { // 1.File의 끝까지 반복하겠다는 조건
				list.add(Integer.valueOf(line)); // 2.File에서 받아온 문자열 숫자를 int로 형변환하여 list에 삽입
			}
			Collections.sort(list); // 3.list 정렬
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 끝까지 다 읽음.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

//		오름차순 정렬 후 덮어쓰기
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new File("d:\\filetest\\test0711-1.txt"));

			for (int i = 0; i < list.size(); i++) {
				pw.println(list.get(i));
			}
			pw.flush(); // 버퍼 정리?
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}

	}
}
