// p110 ~ 111

import java.util.*;

public class StringSwitch {
	public static void main(String[] args) {
		String month = "february";
		
		int monthNumber;
		swich (month) {
			case "january":
				monthNumber = 1;
			break;
			case "february":
				monthNumber = 2;
			break;
			case "march":
				monthNumber = 3;
			default:
			monthNumber = 0;
			break
		}
		System.out.println(monthNumber);
	}
}