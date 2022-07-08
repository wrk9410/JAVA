import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {

	public static void main(String[] args) {

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream(/* new File(input.txt) 가능 */"input.txt");
			out = new FileOutputStream("output.txt");
			int c;

			while ((c = in.read()) != -1) { // 하나의 바이트 스트림을 순서대로 가져와 out에 저장 | 파일의 끝에 도달할 경우 -1을 반환
				out.write(c); // 기준의 바이트 스트림을 순서대로 가져와, 기준 순서 그대로 out에 쓴다? 복사해온다?
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
