import java.util.Arrays;

public class Main {
	public static void insertionSort(int[] arr)
	{
	   for(int index = 1 ; index < arr.length ; index++){

	      int temp = arr[index];
	      int aux = index - 1;

	      while( (aux >= 0) && ( arr[aux] > temp ) ) {

	         arr[aux + 1] = arr[aux];
	         aux--;
	      }
	      arr[aux + 1] = temp;
	   }
	}
	
	public static void main(String[] args) {
		Book[] books = new Book[3]; 
		
		int[] arr = { 50, 30, 20, 60, 10 };
//		
//		insertionSort(arr);
		Arrays.sort(arr); // 오름차순으로 자동 정렬
		int index = Arrays.binarySearch("20의 인덱스: ", index);
		
		System.out.println(Arrays.toString(arr));
	}

}
