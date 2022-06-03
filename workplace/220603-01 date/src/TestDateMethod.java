import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class TestDateMethod {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
//		now.set(2022, Calendar.JUNE, 4);
		now.add(Calendar.DAY_OF_MONTH, 1);
		
		Date date = now.getTime();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String result = dateFormat.format(date);
		System.out.println(result);
		
//		LocalDate now = LocalDate.now();
//		//System.out.println("오늘: "+today);
//		LocalDate nowPlusOne = now.plusDays(1);
//		
//		// 내일의 날짜 객체
//		LocalDate tomorrow = LocalDate.of(2022, 6, 4);
//		
//		System.out.println(tomorrow.equals(nowPlusOne));
		
		
	}
}
