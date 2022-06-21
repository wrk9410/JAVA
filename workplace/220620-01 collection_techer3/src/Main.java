import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("문자열 객체");
		list.add(new Object());
		list.add(Integer.valueOf(100));
		list.add(Double.valueOf(55.55));
		
		list.add(500); // auto-boxing
		list.add(123.123);
		
		int size = list.size();
		System.out.println(size);
		
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
		for (Object o : list) {
			System.out.println(o);
		}
	}
}












