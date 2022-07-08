import java.io.File;
import java.io.IOException;

public class Main4 {
	public static void main(String[] args) {
		// d:\\filetest\\한글이름.txt

//		File fileKor = new File("d:\\filetest\\한글이름.txt");
//		try {
//			System.out.println("생성됨? " + fileKor.createNewFile());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// 파일이름 변경을 원할 경우
//		fileKor.renameTo(new File("d:\\filetest\\newname.txt")); // renameTo(File 객체) : 파일명 변경 가능, boolean값으로 리턴, 예외 처리(runtime 예외)
		
		File mytext = new File("d:\\filetest\\mytext.txt");
		mytext.delete(); // 파일 삭제, 복구는 없음
		
	}
}
