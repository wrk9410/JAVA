import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

//import java.text.SimpleDateFormat;
//import java.time.format.DateTimeFormatter;

public class DateFormat {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		String format = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		cal.add(cal.DATE, +1); //날짜를 하루 더한다.
		String date = sdf.format(cal.getTime());
		System.out.println(date);
		
		
		
		
//		LocalDate date = LocalDate.now();
//		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//		String result = dateFormat.format(date);
//		System.out.println(result);
					
//		Calendar cal = Calendar.getInstance();
//		Date date = cal.getTime();
//		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		String result = dateFormat.format(date);
//		System.out.println(result);

	}

}
