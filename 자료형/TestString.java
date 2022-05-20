public class TestString {
	public static void main(String[] args){
		String str; // 클래스를 불러오는 것이기에 시작이 대문자이다. (타입 변수명)
		str = "Hello World";
		
		System.out.println(str);
		
		String s2 = "다음 문자열"; // 선언과 초기화를 동시에 가능
		System.out.println(s2);
		
		String concat = str + (1 + 2) + "\n" + true + s2 + 3.0;
		// 문자열이지만 합 연산도 가능, 문자로 취급이 되어 정수 등을 써도 문자열로 표현됨, 정수의 합을 따로 ()할 경우 합산 후 문자열 취급
		System.out.println(concat);
		
	}
}