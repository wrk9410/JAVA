import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
//		Set 인스턴스 2개의 모든 값을 중복없이 넣기
		Set<Integer> setUnion = new HashSet<>();
		setUnion.addAll(setA); // .addAll(참조변수) : 참조변수 내의 모든 값을 중복없이 저장하는 메소드
		setUnion.addAll(setB);
		System.out.println(setUnion);

//		2개의 Set 인스턴스를 합한 리스트 중 중복되는 것이 무엇들인지 확인
		Set<Integer> setDuplicate = new HashSet<>();
		setDuplicate.addAll(setA);
		setDuplicate.retainAll(setB);
		System.out.println(setDuplicate);

//		하나의 set의 원소들에서 다른 Set과 중복되는 원소는 전부 지워줌, 차집합(중복되지않는 부분)만 남도록
		Set<Integer> setLeftOuter = new HashSet<>();
		setLeftOuter.addAll(setA);
		setLeftOuter.addAll(setB);
		System.out.println(setLeftOuter);

		Set<Integer> setSame = new HashSet<>(Arrays.asList(7, 6, 5, 4, 3, 2, 1));
		System.out.println(setSame.equals(setUnion)); // 삽입된 index가 없기때문에 순서가 맞지않더라도 원소가 같다라면 equals는 true.
	}

}
