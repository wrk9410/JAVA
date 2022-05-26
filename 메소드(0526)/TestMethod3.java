public class TestMethod3 {
	public static int getSum(int a, int b) { // parameters | 개수, 타입, 순서가 다를 경우 컴파일에러
		return a + b;
	}
	
	// 두 개 int 정수를 전달받아 곱 연산결과를 반환하는 메소드를 작성하고 호출해 반환값을 메인메소드에서 출력해보세요.
	public static int getMultiply(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		int sum = getSum(30, 60);
		System.out.println(sum);
		
		// System.out.println(a); // 지역에서 벗어난 지역변수이기에 main에서 호출 불가
		
		System.out.println(getSum(100, 200));
		
		// 곱 연산결과 반환
		//int mult = getMultiply(); | 꼭 변수를 새로 작성할 필요없음
		System.out.println(getMultiply(5, 4));
		
		getMultiply();
	}
}