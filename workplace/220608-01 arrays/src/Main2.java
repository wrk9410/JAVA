
public class Main2 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		
		int[] copy = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		

//		int[] copy = arr;
//		
		arr[0] = 1000; // 같은 인스턴스를 참조하기때문에 arr[0]을 바꾸어도 copy[0]에도 동일한 값이 저장됨
		
		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]);
		}
	}

}
