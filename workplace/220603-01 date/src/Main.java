/*class Date {
	int year;
	int month;
	int day;
	// getter/setter를 활용하여 저장이 쉬워짐
	
}*/
import java.time.LocalDate;
import java.util.Calendar;

public class Main {
	/*static {
		System.out.println("스태틱 블록안입니다.");
		// static이 붙은 건 객체가 아니기에 쓸 수가 없음?
		// static이 붙은 것은 먼저 만들어 둠
		// static 사용은 정적인 표현이므로 객체지향이 아닌 절차 지향이 됨
	}*/
	
	
	public static void main(String[] args) {		
		/*// java에서의 날짜를 나타냄. java.util.Calendar
		Calendar today = Calendar.getInstance();
		
		// 1.8 ~~ java.date.LocalDate*/
		
		Calendar now = Calendar.getInstance(); // 처키 인형 만드는 것과 비슷하게 날짜를 만들어주는 메소드
		
		System.out.println("상수값 확인: " + Calendar.YEAR);
		
		System.out.println(now.get(Calendar.YEAR)); // 오늘의 연도를 알 수 있는 명령어
		System.out.println(now.get(Calendar.MONTH) + 1); // 오늘의 개월을 알 수 있는 명령어
		System.out.println(now.get(Calendar.DAY_OF_MONTH)); // 오늘의 일자를 알 수 있는 명령어
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); // 숫자로 일~토까지의 요일을 알 수 있는 명령어
		
//		LocalDate now = LocalDate.now(); 
//		System.out.println(now.getYear());
//		
//		System.out.println(now.getMonth());
//		System.out.println(now.getMonthValue());
//		
//		System.out.println(now.getDayOfWeek());
//		System.out.println(now.getDayOfWeek().getValue());
//		
	}

}
