import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 4 * 1 = 4
		// 4 * 2 = 8
		// 4 * 3 = 12
		// 4 * 4 = 16
		// 4 * 5 = 20
		// 4 * 6 = 24
		// 4 * 7 = 28
		// 4 * 8 = 32
		// 4 * 9 = 36
		
		
		/*int i = 1;
		
		while (i <= 9) {
			System.out.printf("4 * %d = %d\n",i,4*i);
			//예림누나 코드: System.out.println("4 * "+i+" = " +(i * 4));
			i++;
		}*/
		
		// 사용자가 입력한 수의 구구단 출력
		Scanner in = new Scanner(System.in);
		
		System.out.print("원하는 구구단의 수 입력: ");
		int num = in.nextInt();
		
		int i = 1;
		
		while (i <= 9){
			System.out.printf("%d * %d = %d\n",num,i,num * i);
			i++;
		}
		
	}
}