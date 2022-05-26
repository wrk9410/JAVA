public class MethodHead2 {
	// 정수 두 개를 전달받아 왼쪽이 큰지 오른쪽이 큰지 혹은 같은지를 알고 싶음.
	/*public static int compare(int left, int right) { // 숫자로는 3개 값이 비교가능하지만 문자는 어려움
		return left - right; // 왼쪽이 크면 양수, 오른쪽이 크면 음수, 같으면 0
	}*/
	
	public static char compare(int left, int right) { // 'L', 'R', 'S'
		if (left > right) {
			return 'L';
		} else if (left < right) {
			return 'R';
		} else {
			return 'S';
		}
	}
	
	/*short  compare(int, int)*/
	
	public static void main(String[] args) {
		//String.valueOf(123); // 정적메소드
			
		char result = compare(150, 170);
		System.out.println(result);
	}
}