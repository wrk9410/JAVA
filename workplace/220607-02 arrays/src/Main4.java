import java.util.Arrays;

public class Main4 {
	static void printArray(char[] target) {
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i]);
		}
	}
	
	// 배열의 모든 원소를 문자열로 표현해서 반환하는 메소드
	static String arrToString(char[] target) {
		String a = "";
		for (int i = 0; i < target.length; i++) {
			a += target[i];
		}
		return a;
	}
	
	// 캐릭터 배열에서 하나의 특정문자의 인덱스를 찾아 반환하는 메소드
	static int whereIs(char[] target, char c) {
		for (int i = 0; i < target.length; i++) {
			if (target[i] == c) { // return이 조건 안에 있을 경우 return값이 없다는 에러남
				return i;
			}
		}
		return -1; // return이 조건문 안에 있어 음수로 반환하게하여 아무것도 반환하지 않게하는 것, 조건문 후 반환만 가능하게 하기위해
	}
	
	public static void main(String[] args) {
		char[] hello = { 'H','e','l','l','o' }; // 문자의 배열(캐릭터 배열형)
		String result = Arrays.toString(hello);
		System.out.println(result);
//		Main4.printArray(hello); // 같은 클래스이기에 Main4.를 적지않아도 괜찮음
//		String result = arrayToString(hello);
//		System.out.printf(result);
		
		
		
//		for (int i = 0; i < hello.length; i++) {
//			System.out.print(hello[i]);
//		}
		
		// 위의 문자 배열 o문자에 해당하는 인덱스를 찾아보세요~
//		for (int i = 0; i < hello.length; i++) {
//			if(hello[i] == 'o') {
//				System.out.println("찾았다: " + i);
//			}
//		}
	}
}
