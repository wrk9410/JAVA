public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("원본"); //StringBuilder는 빈상태로도 가능하고 문자열을 만든 상태로도 등록가능
		sb.append(",One=")// (StringBuilder참조변수).sppend(붙히고 싶은 문자열), 기존 등록 문자열의 오른쪽에 붙음
				.append(1)
				.append(",DoubleValue=")
				.append(225.0); // 한 번 참조를 한 후 뒤에 지속적으로 .append만 해도 문자열이 더해짐
		
		StringBuffer sbuffer; // StringBuffer는 멀티 스레드 : 여러개의 흐름이 존재함
		
//		sb.reverse(); // 중간에 문자열 더하기, 빼기, 거꾸로 돌리기 등 여러 행동 가능
		
//		sb.setCharAt(0, 'Q'); // 0 인덱스에 있는 단어를 'Q'로 바꿀 수 있는 명령어
		sb.insert(26, "시작"); // 0 인덱스에 "시작"이라는 단어를 끼워넣겠다
		
		String result = sb.toString(); // 더할(+) 문자(정수,소수 가능)들을 더하고 문자열로 만들어주어야 함
		System.out.println(result);
		
		
		
		
		
//		String str = "원본 문자열";
//		String other = "다른 문자열";
//		String origin = "원본 문자열";
//		
//		String concat = str + other;
//		System.out.println(concat);
//		System.out.println("원본 문자열다른 문자열" == concat);
		
//		String을 새로 만들 경우 새로운 인스턴스를
		
//		System.out.println(str == origin);
		
		
		
	}

}
