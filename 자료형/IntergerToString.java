public class IntergerToString {
	public static void main(String[] args) {
		// String strNum = 12345; // 자료형이 다르기에 정수 > 문자열 변환 불가로 컴파일 오류
		String strNum = String.valueOf(12345); // 위 코드의 문제 해결 코드, (none타입, 실수형타입도 가능)
		System.out.println(strNum);
		
		int i = 5055;
		String strNum2 = "" + i; // 정수 > 문자열로 변환 불가 오류 해결꼼수(?)
		
		System.out.println(i + 100); // 정수의 합
		System.out.println(strNum2 + 100); // 문자열의 결합
		
		
		
	}
}