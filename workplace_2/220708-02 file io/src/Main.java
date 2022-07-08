import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File diaryFile = new File("d:\\filetest\\diary.txt");
		System.out.println(diaryFile.exists()); // ���������� �ǵ帱 ������ ��� �ִ��� Ȯ��
		Scanner scanner = null;

		try {
			scanner = new Scanner(diaryFile, "UTF-8");
			// Scanner�� �⺻�� System.in������ File���� Ȯ����(���븦 �ȱ�) ���ؼ��� �ش� File ��ü �������� �Է�

			// scanner�� ���� ���� ���� �б�
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException/* IOException ���ε� ����(�� ��ü��) */ e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		} finally { // ������ �������� ���� �� �ְ� finally ó��
			if (scanner != null) { // ����ִ��� ���� Ȯ�� ��
				scanner.close(); // ���� ����
			}
		}
	}

}
