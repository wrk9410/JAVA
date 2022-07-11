import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		// 원시형 타입을 그대로 기록할 수 있는 OutputStream
		DataOutputStream dos = null;

		try {
			dos = new DataOutputStream(new FileOutputStream("d:\\filetest\\mydata.dat"));

//			byte값 자체(int,double,문자열 등)로 저장하여 파일을 열 경우 사람이 읽을 수 없는 형태로 저장되어있음 | code에서 읽을 경우는 더 편함
			dos.writeInt(50); // .writeInt : 정수를 정수 형태로 출력
			dos.writeDouble(123.123); // .writeDouble : 실수를 실수 형태로 출력
			dos.writeUTF("문자열"); // .writeUTF : 문자열을 문자열 형태로 출력
			dos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (dos != null) { // byte 타입으로 받을 경우 finally에 null이 아닐 경우를 설정해주어야 함
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

//		불러오기
		DataInputStream dis = null;

		try {
			dis = new DataInputStream(new FileInputStream(new File("d:\\filetest\\mydata.dat")));

			int valueInt = dis.readInt(); // int로 저장된 값을 int로 읽기 | 연산자 가능
			double valueDouble = dis.readDouble(); // double로 저장된 값을 double로 읽기
			String valueString = dis.readUTF(); // String로 저장된 값을 String로 읽기
			// DataInputStream : -1, null이라는 값을 쓸 수 없음

			System.out.println(valueInt);
			System.out.println(valueDouble);
			System.out.println(valueString);
			
			dis.readBoolean();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 끝까지 다 읽음.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
