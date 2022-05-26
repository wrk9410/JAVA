// 1. 원의 반지름(실수형)을 전달받아 원넓이(실수형)를 반환하는 메소드 작성 후
// 메인메소드에서 호출하여 출력을 통해 값을 확인해보세요.

import java.util.*;

public class CircleSize {
	
	
	public static double Size(double a){
		return a*a*3.14;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("원의 반지름: ");
		double a = in.nextDouble();
		
		System.out.println(Size(a));
		
	}
}