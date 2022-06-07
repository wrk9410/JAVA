import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class PrintCalendar_techer {

	public static void main(String[] args) {
		LocalDate now = LocalDate.of(2022, 8, 7);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd eee");
		String result = formatter.format(now);
		// 2022 06 01
		LocalDate firstDay = LocalDate.of(now.getYear(), now.getMonthValue(), 1);
		int dayOfWeek = firstDay.getDayOfWeek().getValue();
		int length = now.lengthOfMonth();
		
		System.out.println("오늘:"+result);
		System.out.println("일   월   화   수   목   금   토");
		//System.out.print("         ");
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("   ");
		}
		for (int i = 1; i <= length; i++) {
			System.out.printf("%02d ", i);
			dayOfWeek++;
			if (dayOfWeek % 7 == 0) {
				System.out.println();
			}
		}
		
		
		
		
	}

}
