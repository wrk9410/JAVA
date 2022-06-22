import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main6 {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>(); // LinkedHashSet : Set의 들어간 순서를 기억하기 위해 만들어둔 것. 단, index는 여전히 없음
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("apple");

		for (String s : set) {
			System.out.println(s);
		}

		Set<String> set2 = new HashSet<>(Arrays.asList("apple", "donut", "egg", "fanta"));
		
		set.addAll(set2);
		System.out.println(set); // LinkedHashSet에 들어갈 경우 삽입순서에 알맞게 들어갔으며, HashSet에서는 뒤죽박죽이기에 순서가 지켜지다가 흐트러진다.
		set2.addAll(set);
		System.out.println(set2);

	}

}
