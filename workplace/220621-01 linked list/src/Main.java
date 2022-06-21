import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>(Arrays.asList("A", "B", "C", "D")); // 사용법 : 리스트와 동일

		list.remove(0);
		
		list.remove("C");
		
		System.out.println(list);
		
		LinkedList<String> down = (LinkedList<String>) list;
		down.addFirst("asdf");
		down.removeFirst();
		down.getFirst();
	}

}
