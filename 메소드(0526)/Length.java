// 3. 전달받은 두 문자열의 길이 값의 합을 반환하는 메소드. ☆★

import java.util.*;

public class Length {
	
	public static void sumLength(String a, String b) {
		int c = a.length();
		int d = b.length();
		System.out.println(c + d);
		//return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("단어1: ");
		String a = in.nextLine();
		
		System.out.print("단어2: ");
		String b = in.nextLine();
		
		sumLength(a,b);
	}
}