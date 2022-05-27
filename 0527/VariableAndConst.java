public class VariableAndConst {
	public static void main(String[] args) {
		
		int i = 10; // 상수라고 한다
		i++;
		
		final int ASDF;
		ASDF = 10; // 최초의 대입연산은 상수도 초기화가 일어날 수 있다.
		//ASDF = 15;
		
		final int MY_NUMBER = 22; // 대문자로 이름 작성(변수(주로 소문자)와의 구분을 위해서), 단어가 _로 띄어쓰기 대체
		//MY_NUMBER++; // final 이라는 자료형을 사용하면 값이 변화가 되지않음
		
		final double PI = 3.14;
		System.out.println(5 * 5 * PI);
	}
}