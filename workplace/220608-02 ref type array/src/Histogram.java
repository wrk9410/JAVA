import java.util.Arrays;
import java.util.Scanner;

//p237 2번
public class Histogram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("정수%d: ",i+1);
			int a = s.nextInt();
			if (0 < a && a <= 100) {
				arr[i] = a;
			} else {
				System.out.println("잘못된 입력");
				i--;
			}
		}
		int[] arr2 = new int[10];
		
		/*for (int i = 0; i < arr.length; i++) {
			if (0 < arr[i] && arr[i] < 11) {
				arr2[0] += 1; 
			} else if (arr[i] < 21) {
				arr2[1] += 1;
			} else if (arr[i] < 31) {
				arr2[2] += 1;
			} else if (arr[i] < 41) {
				arr2[2] += 1;
			} else if (arr[i] < 51) {
				arr2[2] += 1;
			} else if (arr[i] < 61) {
				arr2[2] += 1;
			} else if (arr[i] < 71) {
				arr2[2] += 1;
			} else if (arr[i] < 81) {
				arr2[2] += 1;
			} else if (arr[i] < 91) {
				arr2[2] += 1;
			} else if (arr[i] <= 100) {
				arr2[2] += 1;
			}
		}*/
		int gg = 0;
		int ll = 1;
		int kk = 10;
		for (int j = 0; j < arr2.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if (ll <= arr[i] && arr[i] < kk) {
					arr2[j] += 1; 
				}
			}
			gg++;
			ll += 10;
			kk += 10;
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
	}
}
