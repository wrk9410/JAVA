import java.util.Arrays;

class Member implements Comparable<Member> {
	// Comparable은 하나밖에 잡지 못함, 그래서 Comparator가 있음
	// Comparator : 인터페이스, 기능 : Object 2개를 전달 받으면 둘 중 무엇이 더 큰지 int로써 알려줄 수 있음
	// 
	
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
	public int compareTo(Member o) {
		return this.height - o.height;
	}
}

public class Main {
	public static void main(String[] args) {
		Member[] members = { new Member("키큰놈", 190, 60)
				, new Member("키작은놈", 130, 30)
				, new Member("중간쯔음", 176, 65)
		};
//		System.out.println(members[0].compareTo(members[1]));
		Arrays.sort(members);
		System.out.println(members[0].height);
		System.out.println(members[1].height);
		System.out.println(members[2].height);
	}
}










