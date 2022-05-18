//73p 3번

import java.util.Scanner;

public class Rvolume {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("반지름 입력: ");
		double radius = in.nextDouble();
		
		double volume = (radius*radius*radius) * 4 / 3;
		
		System.out.println("부피: "+volume);
	}
}