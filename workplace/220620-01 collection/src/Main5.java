import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList(Arrays.asList(10, 20, 30, 40, 50)); // Arrays.asList(원소값,원소값,원소값...) : list 선언과 동시에 값 추가
		System.out.println(list);
		
//		List<Integer> test = Arrays.asList(10, 20, 30, 40, 50);
//		test.add(60);
		
		list.addAll(Arrays.asList(60, 70, 80)); // add는 불가하지만 addAll(Arrays.asList(원소값, 원소값...)) 입력 시 값 추가 가능
		System.out.println(list);
		
		list.removeAll(Arrays.asList(30, 40, 50)); // removeAll(Arrays.asList(원소값, 원소값...)) 입력 시 값 삭제 가능
		System.out.println(list);
		
		System.out.println(list.containsAll(Arrays.asList(10, 20)));
		
		List<Integer> sub = list.subList(0, 3); // .subList(index, 담을 값의 개수) : subList 생성 가능
		System.out.println(sub);
		System.out.println(list);
	}

}
