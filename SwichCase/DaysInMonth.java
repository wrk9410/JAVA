import java.util.*;

public class DaysInMonth {
	public static void main(String[] args) {
		int month;
		int year = 2009;
		int days = 0;
		
		System.out.print("일수를 알고 싶은 달을 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		month = scan.nextInt();
		
		switch (month) {
			case 1:		case 3:		case 5:		case 7:
			case 8:		case 10:	case 12:
				days = 31;
				break;
			case 4:		case 6:		case 9:		case 11:
				days = 30;
				break;
			case 2:
				if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) // 윤년
					days = 29;
				else // 평년
					days = 28;
				break;
			default:
				System.out.println("월이 잘못 입력되었습니다.");
				break;
		}
		System.out.printf("월의 날수는 %d일",days);
	}
}