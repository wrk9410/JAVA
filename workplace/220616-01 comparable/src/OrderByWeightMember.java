import java.util.Arrays;
import java.util.Comparator;

// 멤버 관리 프로그램
// 키 순(오름차순)으로 멤버를 조회하기
//----------------------------
// 몸무게 순(오름차순)으로 멤버를 조회하기 << 어제거랑 위에거 다 하고 난 후~~

class WeightComparator implements Comparator<Member> {
	// Comparator 사용을 위해 추가적인 class 생성
	
	@Override
	public int compare(Member o1, Member o2) {
		return o1.weight - o2.weight;
	}
}

/*class NameComparator implements Comparator<Member> {
	@Override
	public int compare(Member o1, Member o2) {
		return o1.name.compareTo(o2.name);
		// String 타입은 copareTo가 원래 implements되어 있어서 비교가능
		// 부모 class에 compareTo는 자동으로 알파벳 순으로 비교해준다
	}
	
}*/

public class OrderByWeightMember {
	public static void main(String[] args) {
		Member[] members = { new Member("키큰놈", 190, 60)
				, new Member("키작은놈", 130, 30)
				, new Member("중간쯔음", 176, 65)
		};
		
		WeightComparator comparator = new WeightComparator();
		int result = comparator.compare(members[0], members[1]);
//		System.out.println(result);
		
		Arrays.sort(members, comparator);
		System.out.println(members[0].weight);
		System.out.println(members[1].weight);
		System.out.println(members[2].weight);
		
		/*class NameComparator implements Comparator<Member> {
			@Override
			public int compare(Member o1, Member o2) {
				return o1.name.compareTo(o2.name);
//		모든 class는 일회용으로 main에서 생성이 가능하지만 인스턴스보다는 class가 상단에 위치해야 오류가 나지않음
//		간단한 class는 이름도 입력으로 쓸 수 있게 생성됨
			}
		};*/
		Comparator<Member> nameCom = new Comparator<Member>() {
//		인터페이스를 구현하는 class를 인스턴스한 것
			public String myField;
			
			public void hello() {
				System.out.println("Hello");
			}
			public int compare(Member o1, Member o2) {
				return o1.name.compareTo(o2.name);
			}
		};
		
		Comparator<Member> c = new Comparator<Member>() {
//		이것 전체가 이름없는 anonymous class임
			@Override
			public int compare(Member o1, Member o2) {
				return o1.name.compareTo(o2.name);
			}
		};
		
		Arrays.sort(members, c);
		System.out.println(members[0].name);
		System.out.println(members[1].name);
		System.out.println(members[2].name);	
	}
}
