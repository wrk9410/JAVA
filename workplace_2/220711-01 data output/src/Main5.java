import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main5 {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;

		// NotSerializableException : (객체): (객체)가 직렬로 나열이 되지않을 때 발생하는 예외

		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File("d:\\filetest\\s1.ser")));

			oos.writeObject(new Student("학생1", 33, 3.0)); // 기록하고 싶은 객체를 그대로적으면 됨
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
		System.out.println("출력 완료");
	}
}
