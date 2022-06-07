import java.util.Scanner;

public class Main5 {
	
	// 사용자에게 5번의 정수를 입력받아
	// 최근 입력한 순(역순)으로 출력하기

	// 예) 10 20 30 40 50 -> 50 40 30 20 10
	static void printOther(int[] a) {
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.printf("정수%d: ",i+1);
			a[i] = s.nextInt();
		}
		
		for (int i = a.length-1; 0 <= i; i--) {
			System.out.printf("%d ",a[i]);
		}
	}
	
	// 사용자가 0이하의 정수를 입력할 때까지 반복하여 입력
	// 최근 5개를 출력

	// 10 20 30 40 50 60 70 80 90 100 -1 -> 100 90 80 70 60
	static void printRvsOther(int[] a) {
		Scanner s = new Scanner(System.in);
		int i = 1;
		a = new int[i];
		while (true) {
				System.out.printf("정수%d: ",i);
				a[] = s.nextInt();
				i+=1;
			if ( s.nextInt() < 0) {
				System.out.println("입력종료 최근 입력  5개 출력");
				int j = a.length;
				for (int k = 5; k < 0; k--) {
					System.out.println(a[j]);
					j--;
				}
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		//int[] a = new int[5];
		//printOther(a);
		int[] b = new int[5];
		printRvsOther(b);
	}

}
