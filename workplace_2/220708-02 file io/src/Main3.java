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
			int length = (int) file.length(); // length�� long ������ ���������� �迭�� ����� ���� int�� �ٿ� ĳ����
			byte[] buf = new byte[length]; // ���� ũ��(byte)��ŭ �迭�� �����Ͽ� index���� �ܾ��� ����Ʈ ����

			fis = new FileInputStream(file);
			fis.read(buf); // read: 1byte�� �б�

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
