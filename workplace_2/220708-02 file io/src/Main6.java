import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main6 {
	public static void main(String[] args) {
		// 파일 생성 (직접 손으로)
		// persons.txt
		// 파일 정보를 한 줄씩 읽어서
		// 1. 콘솔 출력
		File file = new File("d:\\filetest\\persons.txt");

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(file));

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
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

		// 2. 사람 평균 나이 구해서 출력
	}
}
