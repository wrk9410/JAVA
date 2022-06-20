import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // ArrayList의 사이즈는 값을 넣을 때마다 커지지고 배열로써 관리가 됨, ()안에 캐퍼시티는 설정 가능하나 사이즈는 동적으로 늘어남
		list.add("문자열 객체");
		list.add(new Object());
		list.add(Integer.valueOf(100));
		list.add(Double.valueOf(55.55));
//		add는 객체만 가능하며 원시형 타입은 불가하지만, 원시형 타입을 넣을 경우 auto-boxing이 되어 가능함
		
		list.add(500);	// auto-boxing
		list.add(123.123);
		
//		int size = list.size();
//		System.out.println(size);
//		
//		System.out.println(list.get(0)); // list.get(인덱스 번호) 시 인덱스 번호에 들어간 객체를 확인 가능
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
		
//		for (int i = 0; i < list.size(); i++) { // list(ArrayList) 내의 모든 객체 가져오기
//			System.out.println(list.get(i));
//		}
//		
//		for (int i = list.size() - 1; i >= 0; i--) { // 역순 출력
//			System.out.println(list.get(i));
//		}
		
		for (Object o : list) { // 배열 형식이기에 for each가능
			System.out.println(o);
		}
		
	}
}
