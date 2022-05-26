public class TestMethod {
	public static void printRepeat() { // 메소드 머리(head) | class 밖에 작성 시 컴파일에러남
	// 메소드 몸통(body)
		for (int i = 0; i < 3; i++) { // main메소드부터 읽히므로 미호출 시에 실행되지 않음
			System.out.println("반복 중");
		}
	}
	
	// printHello()
	public static void printHello() {
		int num = 10; // 지역변수
		System.out.println("Hello");
		System.out.println("초기화한 변수 값: " + number);
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작~");
		
		printHello();
		/*System.out.println("헬로 안에서 초기화한 변수 값: " + number);
		for (int i = 0; i < 2; i++) {
			printRepeat();
		}*/
		
		System.out.println("프로그램 끝~");
	}
}
