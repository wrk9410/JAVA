public class Methods {
	// 숫자 하나가 짝수, 홀수 인지 알고 싶음. 이 기능을 할 수 있는 메소드 구현.
	public static boolean isEven(int number) { // 짝수면 참, 홀수면 거짓
		return number % 2 == 0;
	}
	
	// int isEven(int)
	
	// char isEven(int)
	
	// void isEven(int)
	
	
	
	
	
	
	
	public static void isEven(int num) {
		return; // void 이기에 return은 없음
	}
	
	public static int increase(int a) { // int로 return value 해줘야 함
		a++;
		return a;
	}
	
	// public static int,int createTwoNumber() { // int를 2개 쓰면 컴파일에러가 남
		// return 20, 30;
	// }
	
	public static boolean test() {
		return 10;
	}
	
	public static void main(String[] args) {
		boolean result = isEveb(10);
		System.out.println(result);
		
		/*int a = 10;
		increase(a); // Call By Value

		System.out.println(increase(a));
		System.out.println(a);*/
	}
}