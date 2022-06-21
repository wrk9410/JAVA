import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main3 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>(); // LinkedList의 구현이 있으며, Queue의 구현도 있음
//		인터페이스로 사용했기에 LinkedList의 모든 동작이 아닌 Queue에 해당하는 동작만 사용가능
		
		
		List<String> list = new LinkedList<>();
		
		list.add("asdf"); // queue의 .offer
		list.remove(0); // queue의 .poll
		
//		queue.add("원소1"); // List의 add도 되며,
//		queue.offer("원소2"); // queue의 offer도 값을 넣는 것이 가능
//		
//		System.out.println(queue);
//		
//		String elem1 = queue.poll();
//		String elem2 = queue.remove();
//		
//		System.out.println(elem1);
//		System.out.println(elem2);
//		
//		System.out.println(queue.size()); // 
		
	}

}
