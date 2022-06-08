public class Main6 {
	public static void someMethod(double d, int... arr) {
		// ... 가변길이 파라미터, 배열 타입 대체하여 적어도 적용
		// 가변길이 파라미터 규칙 : 파라미터가 여러개일 경우 제일 마지막에 적어야 함
		for (int number : arr) {
			System.out.println(number);
		}
	}
	
	// 정수 2개를 전달받아 합을 구해서 반환하는 메소드
	public static int sum(int... numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
	
	
	
	public static void main(String[] args) {
		int result = sum(10, 20, 30, 40, 50, 60, 70, 80);
		//int[] result = new int[] { 10, 20, 30, 40, 50, 60, 70, 80 };
		System.out.println(result);
	
		
		
		
		
		
		
		
//		int[] arr = { 10, 20, 30, 40, 50 };
//		
//		someMethod(40, 50, 60, 70, 80);
//		int[]로는 위 문법이 안되지만, int...일 경우 사용 가능
//		여러 파라미터 사용 시 차례대로, 갯수별로 파라미터 적용 후 가변길이 파라미터 적용됨
		
//		someMethod(arr);
//		someMethod(new int[] { 20, 30, 40, 50, 60});
//		System.out.println("---");
//		someMethod(new int[] { 4, 5, 6 });
//		System.out.println("종료");
		
//		int[] arr = { 10, 20, 30, 40, 50 };
//
//		for (int number : arr) { 
//			// for each 문 (타입 변수명):(배열 등 여러개를 담을 수 있는 객체)
//			// 오른쪽의 값을 왼>오의 순서대로 빼내어줌
//			// 0번째 인덱스는 값이 변경 되지않음
//			arr[0] = 50;
//			arr[1] = 50;
//			arr[2] = 50;
//			System.out.println(number);
//		}
	}
}
