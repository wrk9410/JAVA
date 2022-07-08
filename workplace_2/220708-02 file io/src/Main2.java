import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		FileOutputStream fos = null; // 잠시는 가르키는 것이 없기에 null값 넣어두기
		String line = "Hello";
		try {
			fos = new FileOutputStream(new File("d:\\filetest\\practice.txt")); // txt 파일 생성

			fos.write(line.getBytes());
//			 생성한 txt 파일에 넣고싶은 String의 byte 삽입 | write 파라미터는 문자열이 아니라 byte 단위만 받을 수 있기에 .getBytes() 추가

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) { // 널 포인트 예외 방지
				try {
					fos.close(); // try 범위 안에 만들어진 지역 변수이기에 finally에서 적용 불가 | 해결: 선언만 try 밖으로 빼기
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
