
public class Main {
	public static void main(String[] args) {
		// 다음과 같은 정수형 배열이 있을 때
		int[] arr = {15, 32, 222, 119, 534, 36, 9, 1234 };

		// 2자리 수의 개수와 목록을 콘솔창에 출력해보세요~
		
		// 개수 : 3
		// -- 목록 --
		// 15
		// 32
		// 36
		int a = 0;
		int[] b = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			if (9 < arr[i] && arr[i] < 100) {
				b[a] = arr[i];
				a++;
			}
		}
		System.out.printf("개수: %d\n-- 목록 --\n",a);
		for (int i = 0; i < a; i++) {
			System.out.println(b[i]);
		}
		
	}

}
