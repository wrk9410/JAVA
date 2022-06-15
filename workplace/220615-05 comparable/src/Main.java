import java.util.Arrays;

class Member implements Comparable<Member2>/*generic 사용 시 비교대상을 <비교대상>으로 고정 시킬 수 있음*/ {
	String name; // 이름
	int height; // 키
	int weight; // 몸무게
	
	public Member(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	// 키
	@Override
	public int compareTo(Member2 o) {
		return this.height - o.height;
	}
	
	/*public int compare(Member member) {
		// 내가 크면 양수, 같으면 0, 내가 작으면 음수
		return height - member.height;
		// 반환값으로 대소비교 가능 > 메소드로 정의
	}*/
}

public class Main {
	public static void main(String[] args) {
		Member2[] members = { new Member2("키큰놈", 190, 60)
				, new Member2("키작은놈", 130, 20)
				, new Member2("중간쯔음", 176, 65)
				};
//		System.out.println(members[0].compareTo(members[1]));
		Arrays.sort(members);
		System.out.println(members[0].height);
		System.out.println(members[1].height);
		System.out.println(members[2].height);
		
	}
}
