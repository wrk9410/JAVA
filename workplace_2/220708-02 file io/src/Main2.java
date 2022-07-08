import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		FileOutputStream fos = null; // ��ô� ����Ű�� ���� ���⿡ null�� �־�α�
		String line = "Hello";
		try {
			fos = new FileOutputStream(new File("d:\\filetest\\practice.txt")); // txt ���� ����

			fos.write(line.getBytes());
//			 ������ txt ���Ͽ� �ְ���� String�� byte ���� | write �Ķ���ʹ� ���ڿ��� �ƴ϶� byte ������ ���� �� �ֱ⿡ .getBytes() �߰�

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) { // �� ����Ʈ ���� ����
				try {
					fos.close(); // try ���� �ȿ� ������� ���� �����̱⿡ finally���� ���� �Ұ� | �ذ�: ���� try ������ ����
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
