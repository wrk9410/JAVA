public class TestIf {
	public static void main(String[] args) {
		
		/*if ( 조건식(논리값) ) /*true와 false둘 중 하나가 들어감*/ {
			// 참의 경우 안의 내용이 실행됨
		}
		// 거짓일 경우 해당 조건식을 건너뛰고 실행됨*/		
		
		boolean condition = false;
		if (condition) {
			System.out.println("조건문 블록 안 입니다.");
		}
		System.out.println("프로그램 종료");
	}
}