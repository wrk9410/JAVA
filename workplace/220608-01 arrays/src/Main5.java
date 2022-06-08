import java.util.Arrays;

public class Main5 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		
		Arrays.fill(arr, 100);
		System.out.println(Arrays.toString(arr));
		
		/*int[] temp = { 40, 50, 60 };
		int[] another = Arrays.copyOfRange(temp, 2, temp.length);
		// copyOfRange(무엇을, 몇번째 인덱스에서, 몇 개의 원소를) 배열 복사하는 메소드
		System.out.println(Arrays.toString(another));*/
		
		
		
		
		
		
		
		
//		int[] copy = Arrays.copyOf(arr, arr.length);
//		int[] arr2 = arr;
//		
//		System.out.println(Arrays.toString(copy));
//		System.out.println(Arrays.equals(arr, copy)); // 길이와 원소값 2개 다 같을 때 true
//		System.out.println(Arrays.equals(arr, arr2)); // 참조가 같아도 true
	}
}
