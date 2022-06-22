import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		boolean b1 = set.add("qwer"); // set도 add가 되며, 원소추가 가능
		boolean b2 = set.add(Integer.valueOf(10));
		boolean b3 = set.add("qwer"); // set은 add를 할 때 추가하려는 값이 기존에 있는 값과 중복된다면 삽입 불가
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println(set.size());
		
		System.out.println(set.toString());
		
//		set.get(0); // set은 list와 다르게 index로 가지고 올 수 있는 getter가 없음
//		for (int i = 0; i < set.size(); i++) {
//			set.get(i);
//		}
		
		for (Object o : set)/*for(담을 곳 : 가져올 곳) {}*/ { // set은 index번호가 없지만 for~each으로는 처리가 가능하다
			System.out.println(o);
		}
		
		Iterator<Object> iter = set.iterator();
		while (iter.hasNext()/*.hasNext() : 이터레이터 인스턴스 내의 값을 하나씩 확인 하는 것*/) {
			System.out.println(iter.next()); // iter.next() : 이터레이터 인스턴스 내의 값을 하나씩 내보내는 것
		}
		
		
		
		
	}

}
