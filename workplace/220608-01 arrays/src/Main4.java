import java.util.Arrays;

public class Main4 {
	// 두 개 정수 배열을 전달받아 결합시켜 반환하는 메소드
	// 예) [1, 2, 3] [10, 11, 12, 13, 14]
	// [1, 2, 3, 10, 11, 12, 13, 14]
	
	public static int[] sumArrLength(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int i = 0;
		for (; i < a.length;) {
			c[i] = a[i];
			i++;
		}
		for (int j = 0; i < c.length; j++) {
			c[i] = b[j];
			i++;
		}
		return c;
	}
	
	//쌤코드
	public static int[] concatArray(int[] left, int[] right) {
		int[] newArray = copy(left, right.length);
		
		for (int i = left.length; i < newArray.length; i++) {
			newArray[i] = right[i - left.length];
		}
		return newArray;
	}
	
	
	
	
	
	// 두 개 정수 배열의 합을 가지는 배열을 반환하는 메소드
	// 예) [1, 2, 3] [10, 11, 12, 13, 14]
	// [11, 13, 15, 13, 14]
	
	/*public static int[] sumArrNum(int[] a, int[] b) {
		int[] c;
		a.length > b.length ? c = new int[a.length] : c = new int[b.length];
	}*/
	
	public static int[] sumArray(int[] left, int[] right) {
		int[] copy;
		int[] target;
		
		//삼항연산자
		copy = left.length > right.length ? copy(left, 0) : copy(right, 0);
		//if~else, for문
		if (left.length > right.length) {
			target = copy(left, 0);
		} else {
			copy = copy(right, 0);
			target = left;
		}
		for (int i = 0; i < target.length; i++) {
			copy[i] = target[i];
		}
		//
		
		return copy;
	}

	
	public static int[] copy(int[] arr, int newLength) {
		int[] larger = new int[arr.length + newLength];
		for ( int i = 0; i < arr.length; i++) {
			larger[i] = arr[i];
		}
		return larger;
	}
	
	
	public static void main(String[] args) {
		/*int[] a = { 1, 2, 3 };
		int[] b = { 10, 11, 12, 13, 14 };
		int[] c = sumArrLength(a,b);
		System.out.println(Arrays.toString(c));*/
		
		int[] arr = { 10, 20, 30 };
		int[] arr2 = { 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(sumArray(arr, arr2)));
		
		/*int[] newArray = copy(arr,arr2.length);
		
		for (int i = arr.length; i < newArray.length; i++) {
			newArray[i] = arr2[i - arr.length];
		}
		System.out.println(Arrays.toString(a));*/
		
		/*int[] arr = { 10, 20, 30 };
		
		int[] larger = new int[arr.length + 2];
		for (int i = 0; i < arr.length; i++) {
			larger[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(larger));*/
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
	}
}
