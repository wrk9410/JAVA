import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("donut");
		
//		iterable : 열거 가능함, List는 iterable이란 것을 상속하는 중
		Iterator<String> iterator = list.iterator();// .iterator: 리스트의 원소를 하나하나 볼 수 있게끔 도와주는 메소드
		//iterator.next() : 반복하여 가져올 경우 기존 크기보다 클 경우 예외발생
		
		/*5글자의 문자열을 삭제하는 코드*/
		while (iterator.hasNext()) {
			String str = iterator.next(); // 조건: 가져올 원소가 있을 경우이기에 while문으로 사용 후 break도 가능
			if (str.length() == 5) {
				iterator.remove(); // 현재 가져온 객체를 remove()로 삭제 가능
			}
		}
		System.out.println(list);
		
		
		
		
//		System.out.println(list.contains(new String("banana")));
//		list의 banana와 new String의 banana는 참조가 다를 것인데 값이 같다고 확인, 이유는 equals로 확인하고 있기 때문
//		list.remove("banana"); // remove는 ()와 동일한 것 값으로 삭제 가능
		
//		System.out.println(list);
		
		// 위의 리스트에서 5글자 문자열만 찾아서 지우기
//		for (String s : list) { // for each에서는 변경이 불가하여 예외로썬 변경 불가
//			if (s.length() == 5) {
//				list.remove(s);
//			}
//		}
//		System.out.println(list);

	}

}
