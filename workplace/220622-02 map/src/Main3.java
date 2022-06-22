import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//중국집 주문 가격 계산기

// 짜장면 : 2500
// 짬뽕 : 4000
// 볶음밥 : 4000
// ex) 탕수육 : 10000

// 메뉴를 '추가'

// 계산 결과 출력 가능

public class Main3 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int choice = 0;
			
			
			// 메뉴 주문
			map.put("짜장면", 2500);
			map.put("짬뽕", 4000);
			map.put("볶음밥", 4000);
	
			int sum = 0;
			int num = 0;
			while (true) {
				System.out.println("메뉴 입력");
				String a = sc.nextLine();
				if (a.equals("계산")) {
					System.out.println(sum + " 주문음식 갯수: " + num);
					break;
				} else {
					sum += map.get(a);
					num++;
				}
			}
			
			// 메뉴 추가
			if (choice == 2)
			System.out.println("추가 요청 메뉴명");
			String menu = sc.nextLine();
			System.out.println("가격?");
			int price = sc.nextInt();
			map.put(menu, price);
			System.out.println(map);
		}
		
		
//		try {
//			while (true) {
//				System.out.println("메뉴 입력");
//				String a = sc.nextLine();
//				String b = a;
//				sum += map.get(a);
//				num++;
//			} 
//		} catch (Exception e) {
//			System.out.println(sum+" 주문음식 갯수: "+num );
//		}

	}
}