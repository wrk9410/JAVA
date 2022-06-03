/*import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;

/*
	오늘:2022-06-03 금
	일   월   화   수   목   금   토
	         01 02 03 04
	05 06 07 08 09 10 11
	12 13 14 15 16 17 18
	19 20 21 22 23 24 25
	26 27 28 29 30
 */


public class PrintCalendar {
	
	public static String getWeek(int week) {
		String a = "";
		switch (week) { // switch case문은 해당 값을 찾아 그 밑에있는 값을 확인하는 것
			case 1: a ="일";
				break;
			case 2: a = "월";
				break;
			case 3: a = "화";
				break;
			case 4: a = "수";
				break;
			case 5: a = "목";
				break;
			case 6: a = "금";
				break;
			case 7: a = "토";
		}
		return a;
	}
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // 오늘
		//now.set(2022, Calendar.JUNE, 1); // 날짜 변경. 6월0일(5월31일)
		//now.add(Calendar.DAY_OF_MONTH, 1); // 6월0일(5월31일)에 1을 더해 6월1일
		// 오늘에 해당하는 월에 1일 씩 더하여라
		
		
		
		Date date = now.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String result = dateFormat.format(date);		
		
		int week = now.get(Calendar.DAY_OF_WEEK); // 오늘 요일 해당 숫자로 출력
		String w = getWeek(week);
		int month = now.get(Calendar.DAY_OF_MONTH);
		//System.out.println(month);

		System.out.printf("오늘:%s %s\n",result,w);
		System.out.println("일   월   화   수   목   금   토");
		
		int a = now.getActualMaximum(Calendar.DAY_OF_MONTH); // 금일 기준 달의 끝일자
		int i = 1;
		int blank = 0;
		
		for (; i <= a;) {
			if (blank > 0 && blank % 7 == 0) {
				System.out.println();
			}
			if (blank < month) {
				System.out.print("   ");
			} else {
				now.set(2022, Calendar.JUNE, i);
				date = now.getTime();
				dateFormat = new SimpleDateFormat("dd");
				result = dateFormat.format(date);
				System.out.printf("%s ",result);
				i++;
			}
			blank++;
		}
		
		
	}
	
}
