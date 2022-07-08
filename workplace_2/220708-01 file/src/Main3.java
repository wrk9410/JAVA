import java.io.File;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		// URL의 경로의 구분 : /, 문자열 경로 구분(JAVA) : \\
//		File file = new File("d:\\filetest");
//		System.out.println("있냐? " + file.exists());
//		System.out.println("폴더임? " + file.isDirectory());
//		System.out.println("파일임?" + file.isFile());
//
//		boolean result = file.mkdir();
//		System.out.println("디렉토리 생성여부: " + result); // 첫 실행은 있냐?와 폴더임?은 false로 나왓지만 두번째는 디렉토리를 생성했기에 둘 다 true로 바뀜

		// d드라이브에 filetest 폴더(디렉토리)안에 abc 폴더를 생성해보세요
//		
//		
//		File file2 = new File("d:\\filetest\\abc\\..\\def");
//		file2.mkdir();
//		File file3 = new File("D:\\filetest\\def"); // getCanonicalPath() 문자열 반환 | 항상 예외가 발생하여 try catch를 하여야하지만 throws로 예외를 던져도 실행가능

		File textFile = new File("d:\\filetest\\mytext.txt");
		try {
			boolean result = textFile.createNewFile();
			System.out.println("생성됨? " + result); // 파일 생성되었는지 확인
		} catch (IOException e) {
			// 예외처리
			e.printStackTrace();
		}
	}
}
