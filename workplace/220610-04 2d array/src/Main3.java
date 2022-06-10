import java.util.Arrays;
import java.util.Random;

public class Main3 {
	
	public static int[][] randomArray() {
		Random random = new Random();
		int[][] array = new int[5][5];
		
		for(int i = 0; i < array.length; i++) {
				for(int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10);
			}
		}
		return array;
	}
	
	
	public static void print2D(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(Arrays.toString(array[i]));
			System.out.println(sum(array[i]));
		}
		for (int i = 0; i < array[0].length; i++) {
			System.out.print(sum(col(array, i))+ " ");
		}
	}
	
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static int[] col(int[][] array, int col) {
		int[] columnArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			columnArray[i] = array[i][col];
		}
		return columnArray;
	}
	
	public static int count(int[][] array, int target) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == target) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[][] randomArray = randomArray();
//		System.out.println(Arrays.deepToString(randomArray));
		print2D(randomArray);
		System.out.println("\n7의 개수: "+count(randomArray, 7));
		
//		int a = 0;// 각 행의 합
//		int b = 0;// 각 열의 합
//		int seven = 0;// 숫자 7의 개수
//		
//		for (int i = 0; i < randomArray.length; i++) {
//			for (int j = 0; j < randomArray[i].length; j++) {
//				a += randomArray[i][j];
//				if (randomArray[i][j] == 7) {
//					seven++;
//				}
//			}
//			System.out.println("각 "+(i+1)+"행의 합: "+a);
//		}
//		
//		System.out.println();
//		
//		for (int i = 0; i < randomArray.length; i++) {
//			for (int j = 0; j < randomArray[i].length; j++) {
//				b += randomArray[j][i];
//			}
//			System.out.println("각 "+(i+1)+"열의 합: "+b);
//		}
//		
//		System.out.println("\n7의 합: "+seven);
		
	
		
		
		
		
		
		
	}
}
