import java.util.ArrayList;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<>(); // 타입에 제네릭을 작성하였을 경우 우측은 <>만 적어도 됨
//		부모는 List class가 있음
		List<Integer> list = new ArrayList<>();
		
		// 위의 리스트에 10, 20, 30, 40의 값을 가지고있는 리스트 만들기
		for (int i = 1; i <= 4; i++) {
			list.add(i * 10);
		}
		
		//모든 원소들을 출력해보세요
		System.out.println(list.toString());
		
		//1번 인덱스의 20 > 15로 변경
		list.set(1, 15);
		System.out.println(list); // 1번 index의 참조는 바뀌었겠지만 값을 변경할 수 있음
		
		//해당 값의 원소가 있는지 여부 확인
		System.out.println(list.contains(30)); // (확인할 값)이 있는지 확인 가능
		System.out.println(list.indexOf(30));  // indexOf()도 리스트에서 사용가능
		
		//원소삭제
		list.remove(2); // (index)를 입력하면 해당 index의 원소를 제거
		System.out.println(list); // 1.사이즈가 줄어듬, 2.사이즈가 줄어들면서 index도 당겨져옴
		
		//값 삽입
		list.add(0, 0); // 좌측: index번호 , 우측: 넣을 원소값
		System.out.println(list); // 1.설정 index 번호에 설정한 원소를 삽입함 2.삽입한 index의 번호 들이 우측으로 밀어짐
		
		//원소 전체삭제
		list.clear();
//		for (int i = 0; i < list.size(); i++) {
//			list.remove(i); // 다 지우는 경우 remove로 할 시 사이즈가 줄어드며 전체 삭제가 되지않음
//		}
		System.out.println("지운 결과 : " + list);
		System.out.println(list.size() == 0); // clear 사용 시 사이즈도 삭제,
		System.out.println(list.isEmpty()); // 원소도 삭제
	}

}
