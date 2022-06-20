import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Main6 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 8, 9, 1));
		
		Collections.sort(list); // 리스트 순서대로 나열
		System.out.println(list);
		
		int index = Collections.binarySearch(list, 8); // Collections.binarySearch(리스트 참조변수명, 찾길 원하는 값)
		System.out.println("8의 인덱스: " + index);
		
		Collections.reverse(list); // 리스트 역순 정렬
		System.out.println(list);
		
		Collections.shuffle(list); // 리스트 랜덤으로 섞기
		System.out.println(list);
		
		System.out.println(Collections.max(list)); // 리스트 중 가장 큰 수
		System.out.println(Collections.min(list)); // 리스트 중 가장 작은 수
		
		Collections.fill(list, 33); // .fill(리스트 참조변수명, 변경할 값) : 전체 원소를 하나의 값으로 변경
		System.out.println(list);
		
		Collections.replaceAll(list, 33, 77); // replaceAll(리스트 참조변수명, 동일한 값의 총 횟수의 새로운 배열 생성 크기, 그 배열에 넣을 값)
		System.out.println(list);
		
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90, 80, 70));
		Collections.copy(list, target); // 복사한 리스트의 0번 index부터 순서대로 바꿀 값 입력(주의, 해당 값의 크기만큼 배열길이가 있어야 함)
		
		System.out.println(list);
		
	}

}
