// 사용자의 나이와 이름을 입력받아서
// 자기랑 같으면 true 출력하기

import java.util.Scanner;

public class NameAge {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String myname = "길대수";
		int myage = 24;
		
		System.out.print("이름: ");
		String name = in.nextLine();
		
		System.out.print("나이: ");
		int age = in.nextInt();	
		
		System.out.println(myname.equals(name) && myage == age);
		
		//쌤 코드
		/*
		System.out.print("나이를 입력? ");
		int age1 = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("이름을 입력? ");
		scan.nextLine();
		String name = scan.nextLine();
		
		System.out.println((age == 18) && name.equals("박민"));
		*/
		
		
	}
}