import java.util.Deque;
import java.util.LinkedList;

public class Main4 {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<>(); // Deque - stack을 사용하는 List
		stack.push("10"); // .push 아래부터 차곡차곡 들어감
		stack.push("20");
		stack.push("30");
		
		System.out.println(stack.pop()); // 선입후출, .pop 위에부터 차례대로 빠져나옴
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		LinkedList<String> list = new LinkedList<>(); // List의 인터페이스에는 여러 메소드들이 많이 있어서 Deque, Queue 등으로 나누어 둔 것임
		
	}

}
