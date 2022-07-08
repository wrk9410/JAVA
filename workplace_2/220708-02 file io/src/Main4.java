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

			pw.println("���ڿ� �� ���� ����մϴ�."); // ���� ��������� System.out.println();
			pw.println(10);
			pw.println(15.15);
			pw.flush(); // �߰��ߴ� ������ �� �ӽð��� ���� �����

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}
