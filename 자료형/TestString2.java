public class TestString2 {
	public static void main(String[] args) {
		String hello = "Hello"; // 문자열의 글자 수 순서는 index로 되어 있으며, index는 0부터 시작, index 최대값은 (글자수-1)이다.
		
		char h = hello.charAt(0); // charAt(index 번호)에 맞는 값(문자 1개)을 가져옴
		System.out.println(h);
		System.out.println(hello.charAt(1));
		System.out.println(hello.charAt(2));
		System.out.println(hello.charAt(3));
		System.out.println(hello.charAt(4));
		// System.out.println(hello.charAt(-1)); // 음수값은 불가하기에 컴파일은 되지만, 실행 시 오류발생
		
		int length = hello.length(); // ()입력파라미터 : 메소드가 동작할 때 동작할 곳을 알려주는 곳
		System.out.println(length); // String을 int에 담을 시 ()의 값에 대한 문자열 최대 글자 수 정수로 확인 가능
	}
}