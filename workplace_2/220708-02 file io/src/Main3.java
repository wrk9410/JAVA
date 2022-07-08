import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Main3 {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {

			File file = new File("d:\\filetest\\practice.txt");
			int length = (int) file.length(); // length는 long 값으로 구해지지만 배열을 만들기 위해 int로 다운 캐스팅
			byte[] buf = new byte[length]; // 파일 크기(byte)만큼 배열을 생성하여 index별로 단어의 바이트 저장

			fis = new FileInputStream(file);
			fis.read(buf); // read: 1byte씩 읽기

			String result = new String(buf);

			System.out.println(result);
			System.out.println(Arrays.toString(buf));
			for(byte b : buf) {
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
