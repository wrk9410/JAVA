import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {

	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(file));

			String line;
			while ((line = br.readLine()) != null) { // 반환이 null일 경우 br의 끝까지 설정
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
