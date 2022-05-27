// 2번
// 날짜 클래스
// 필드 : 연도, 월, 일
// 메소드(기능) : "2022-05-27"
//			   "05/27/22"
// 같은 값이여도 출력방식이 달라지는 것, 다양한 서식 변경

import java.util.Scanner;

public class Weather {
	
	//필드
	int month,day,year;
	
	//메소드
	public void printAll(int a) {
		do {
			if(a == 1) {
				System.out.printf("%d-%d-%d",year,month,day);
				break;
			}
			else if (a == 2) {
				if ( month > 10 ){
				System.out.printf("%d월/%d일/%d년",month,day,year % 100);
				break;
				} else {
					System.out.printf("0%d월/%d일/%d년",month,day,year % 100);
					break;
				}
			}
			else {
				System.out.printf("잘못된 입력 입니다.\n재입력 요청\n");
			}
		} while (true);
	}
	
	public static void main(String[] args) {
		Weather w = new Weather();
		Scanner s = new Scanner(System.in);
		
		System.out.print("연도: ");
		
		w.year = s.nextInt();
		System.out.print("월: ");
		w.month = s.nextInt();
		System.out.print("일: ");
		w.day = s.nextInt();
		
		
		System.out.println("1.xxxx-xx-xx\n2.xx-xx-xx");
		int a = s.nextInt();
		
		w.printAll(a);
	}
	
	
	
	
	
	
	
	
	
	
}