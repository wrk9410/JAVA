import java.util.Arrays;
import java.util.Scanner;

public class Histogram {
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("정수%d: ",i+1);
			int a = s.nextInt();
			if (0 < a && a <= 30) {
				arr[i] = a;
			} else {
				System.out.println("잘못된 입력");
				i--;
			}
		}
		
		int[] arr2 = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			if (0 < arr[i] && arr[i] < 11) {
				arr2[0] += 1; 
			} else if (arr[i] < 21) {
				arr2[1] += 1;
			} else if (arr[i] < 31) {
				arr2[2] += 1;
			}
		}
		
		int l = 1;
		int k = 10;
		for (int i = 0; i < arr2.length; i++) {
			System.out.printf("%d - %d: ",l,k);
			for (int j = 0; j < arr2[i]; j++) {
				System.out.print('*');
			}
			System.out.println();
			l += 10;
			k += 10;
		}
		
		
		// System.out.printf("1 - 10: %s\n11 - 20: %s\n21 - 30: %s",star*arr[0],star*arr[1],star*arr[2]);
		
		
		

	}

}
