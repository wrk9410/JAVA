import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		ArrayList<Integer>/*제네릭으로 설정해주어야 다운 캐스팅의 번거로움이 없음, int는 원시형 타입이기에 객체는 원시형 타입이 불가하여 안됨*/
		list = new ArrayList<Integer>();
		
		list.add(10); // Double로 설정 시 원시형 타입의 개념으로는 들어가야되지만 auto-boxing이 되지않아 소수점으로 적어주어야 됨
		list.add(20);
		list.add(30);
		list.add(40);
		
//		list.add("asdf"); // 현재 제네릭으로 Integer만 받을 수 있어 문자열은 받기불가
		
		int sum = 0;
		for (int i = 0; i <list.size(); i++) {
			sum += list.get(i);
			// list가 가지고 있는 것은 Object의 타입으로 설정되어 있기에 값을 가져오기 위해서는 Object 타입으로 담아야 하기에 다운캐스팅해야해서 번거로움
			
		}
		System.out.println(sum);
		
	}

}
