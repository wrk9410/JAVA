import java.util.Arrays;

public class Main3 {
	// 정수형 배열을 전달받아 같은 길이와 원소값을 가지는 정수 배열을 반환하는 메소드
	public static int[] copyArray(int[] origin) {
		int[] copy = new int[origin.length];
		
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		
		return copy; // 배열형도 return 가능
	}
	
	public static int[] printArr(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ",a[i]);
		}
		System.out.println();
		return b;
	}
	
	// 정수형 배열 2개가 동일한지(길이와 각 원소값)를 알 수 있는 메소드
	/*public static void sameArr(int[] a, int[] b) {
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == b[i]) {
					if (i+1 == a.length) {
						System.out.println("두 배열은 동일합니다.");
						printArr(a);
						printArr(b);
					}
				} else {
					System.out.println("두 배열은 동일하지 않습니다.");
				}
			}
		} else {
			System.out.println("두 배열은 동일하지 않습니다.");
		}
	}*/
	// 쌤코드
	public static boolean isSame(int[] left, int[] right) {
		if (left.length != right.length) {			
			return false;
		}
		
		for (int i = 0; i < left.length; i++) {
			if (left[i] != right[i]) {
				return false;
			}
		}

		return true;
	}
	
	public static void main(String[] args) {
		int[] test = { 50, 70, 90, 110 };
		int[] c = copyArray(test);
		//System.out.println(Arrays.toString(c));
		//sameArr(test,c);
		
		boolean result = isSame(test,c);
		System.out.println(result);
	}
}
