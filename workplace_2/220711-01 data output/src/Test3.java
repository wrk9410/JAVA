import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class User implements Serializable {
	private int num;
	private String name, phone, email;

	public User(int num, String name, String phone, String email) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [num=" + num + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}

}

public class Test3 {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		List<User> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int a;
		int b = 1;
		do {
			System.out.println("User를 추가하시겠습니까?\n1.예\t2.아니오");
			a = sc.nextInt();
			if (a == 1) {
				sc.nextLine();
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("전화번호: ");
				String phone = sc.nextLine();
				System.out.print("이메일 주소: ");
				String email = sc.nextLine();
				User user = new User(b, name, phone, email);
				list.add(user);
				b++;
				System.out.println(list);
			}

		} while (a == 1);

		// NotSerializableException : (객체): (객체)가 직렬로 나열이 되지않을 때 발생하는 예외

		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File("d:\\filetest\\test0711-3")));

			for (int i = 0; i < list.size(); i++) {
				oos.writeObject(list.get(i)); // 기록하고 싶은 객체를 그대로적으면 됨
			}
			oos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
