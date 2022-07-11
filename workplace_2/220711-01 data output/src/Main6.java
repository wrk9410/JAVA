import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main6 {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("d:\\filetest\\s1.ser"));
			
			Student s = (Student) ois.readObject(); // 기본적으로 Object로 생성되기 때문에 다운캐스팅 해주면 됨
			
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
