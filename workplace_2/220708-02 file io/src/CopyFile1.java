import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {

	public static void main(String[] args) {

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream(/* new File(input.txt) ���� */"input.txt");
			out = new FileOutputStream("output.txt");
			int c;

			while ((c = in.read()) != -1) { // �ϳ��� ����Ʈ ��Ʈ���� ������� ������ out�� ���� | ������ ���� ������ ��� -1�� ��ȯ
				out.write(c); // ������ ����Ʈ ��Ʈ���� ������� ������, ���� ���� �״�� out�� ����? �����ؿ´�?
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
