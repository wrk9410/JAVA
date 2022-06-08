// p237 1번
import java.util.Arrays;
import java.util.Scanner;
public class Reservation2 {
	
	public static void printIndex(int... arr) {
		System.out.println("현재 예약 상태는 다음과 같습니다.\n------------------------");
		System.out.println("1 2 3 4 5 6 7 8 9 10\n------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	public static void reservSeat(int... arr) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("좌석을 예약하시겠습니까?(1 또는 0) ");
			int a = s.nextInt();
			if (a == 1) {
				printIndex(arr);
				System.out.print("몇 번째 좌석을 예약하시겠습니까? ");
				a = s.nextInt();
				if (arr[a-1] != 1) {
					arr[a-1] = 1;
					System.out.println("예약되었습니다.");
				} else {
					System.out.println("* 이미 예약된 좌석 입니다. *");
				}
			} else if (a == 0) {
				System.out.println("* 예약종료 *");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
			
		}
	}
	
	public static void main(String[] args) {
		Reservation r = new Reservation();
		int[] a = new int[] { 0,0,0,0,0,1,1,1,0,0 };
		r.reservSeat(a);
	}
	

}
