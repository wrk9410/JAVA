import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ObjectInputStream ois = null;
		List<User> list = new ArrayList<>();
		System.out.print("확인 요청 번호 입력 : ");
		int a = sc.nextInt();
		a -= 1;

		try {
			ois = new ObjectInputStream(new FileInputStream("d:\\filetest\\test0711-3"));

			User u;
			while (true) {
				list.add((User) ois.readObject());
			}

		} catch (EOFException e) {
			System.out.println(list.get(a).getPhone());
//			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

//		출력(새파일 만들기)

	}
}
