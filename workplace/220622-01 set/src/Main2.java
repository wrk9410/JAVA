import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Main2 {
	public static void main(String[] args) {
		java.util.Set<String> set = new HashSet<>(); // set 들어가는 값의 순서가 아니라 중복에 중점을 두었음
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("banana"); // 중복된 원소
		
		System.out.println(set.size()); // 중복되는 원소가 있어
		
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next()); // set은 값이 들어갈 때 순서가 없이 들어감
		}
		
		set.contains("banana");
		set.contains("donut");
		
		
		
		
	}

}
