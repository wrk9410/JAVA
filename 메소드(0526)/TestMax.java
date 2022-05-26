public class TestMax {
	public static int max(int left, int right) {
		return left > right ? left : right;
	}
	
	public static void main(String[] args) {
		int x = 100;
		int y = 50;
		int z = 75;
		
		int result1 = max(x, y); // 2개를 비교해서 큰 거 알려주는 것에 (x, y) 삽입
		int finalResult = max(result1, z);
		
		System.out.println(finalResult);
		
		int m = max(3, max(7, max(5, 1)));
		
		System.out.println(m);
		
		// if (x > y) {
			// System.out.println(x);
		// } else {
			// System.out.println(y);
		// }
		
		// // 3개 정수 중 가장 큰 값 구하기
		// int a = 3;
		// int b = 4;
		// int c = 5;
		// // 4개
		// int d = 6;
		// // 5개
		// int e = 7;
		
		// System.out.println(max(e, max(d,max(c, max(a, b))))); // 안쪽 괄호부터 순차적으로 진행?
	}
}