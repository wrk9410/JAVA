import java.util.Scanner;

public class NumberRange {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = scan.nextInt();
		//int numberCopy = number; //값을 저장해두는 것도 가능
		
		num -= 2;
		System.out.printf("%d ",num);
		num += 1;
		System.out.printf("%d ",num);
		num += 1;
		System.out.printf("%d ",num);
		num += 1;
		System.out.printf("%d ",num);
		num += 1;
		System.out.printf("%d ",num);
		
		// System.out.printf("-2 ~ +2 숫자: %d %d %d %d %d",)
	}
}