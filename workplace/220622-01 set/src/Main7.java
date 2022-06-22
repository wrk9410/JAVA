import java.util.Set;
import java.util.TreeSet;

public class Main7 {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>(); // set과 동일 index가 없고 중복을 삭제, 삽입되는 원소들의 대소를 비교하여 순서가 정렬된 것처럼 출력이 됨 | abc,가나다 오름차순으로 정렬
		set.add(50);
		set.add(17);
		set.add(2);
		set.add(50);
		set.add(22);
		set.add(17);
		set.add(30);
		
		for (int i : set) {
			System.out.println(i);
		}
		
		
	}

}
