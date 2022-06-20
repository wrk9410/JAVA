import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main8 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79));
		
		// 합, 평균
//		Iterator<Integer> iter = list.iterator(); //Iterator는 하나씩 다 보는 것이 목적이다.
//		while (iter.hasNext()) {
//			iter.next();
//		}
		
		int a = 0;
		for (int i = 0; i < list.size();i++) {
			a += list.get(i);
		}
		int avg = a / list.size();
		System.out.println("합: "+a+" 평균: "+avg);
		
		// 정수 57이 리스트에 있는지? 있으면 몇 번 째 index에 위치하는지?
		System.out.println(list.contains(57)); // 57이 있는지 확인
		System.out.println(list.indexOf(57)); // 몇 번 index에 있는지 확인
		
		// 정수 23의 개수
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 23) {
				count++;
			}
		}
		System.out.println(count);
		
		// 중복되는 원소 23을 '하나' 삭제하기
		list.remove(Integer.valueOf(23)); // remove는 객체, 인덱스만 받을 수 있음
		System.out.println(list);
		
//		Iterator<Integer> iter = list.iterator();
//		while (iter.hasNext()) {
//			int value = iter.next();
//			if (value == 23) {
//				iter.remove();
//				break;
//			}
//		}
//		System.out.println(list);
//		int index = list.lastIndexOf(23);
//		list.remove(index);
//		System.out.println(list);
		
	}

}
