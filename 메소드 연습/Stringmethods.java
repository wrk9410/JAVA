public class Stringmethods {
	public static void main(String[] args) {
		String hello = "hello";
		
		int index = hello.indexOf("o"); // "o"는 몇 번째 index인지 확인 코드, 동일한 값이 여러가지 일 때는 제일 빠른 index만 찾음
		System.out.println(index);
		
		int notFound = hello.indexOf("a"); // 해당하는 값이 존재하지 않을 경우 무조건 -1로 출력
		System.out.println(notFound);
		
		int index2 = hello.indexOf("l", 4); // 해당 문자열이 시작하는 index의 값이 나옴, ("찾고자하는 문자", index 시작점)
		System.out.println(index2);
		
		int index3 = hello.lastIndexOf("l"); // 동일한 문자의 제일 늦는 index 번호 출력
		System.out.println(index3);
	}
}