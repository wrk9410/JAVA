import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
//		Map<key에 대한 타입, value에 대한 타입> 참조변수명 = new HashMap<>();
		map.put("둘리", 100);
		map.put("홍길동", 90);
		map.put("도우너", 150);

		Map<Integer, String> map2 = new HashMap<>();

		map2.put(1, "둘리");
		map2.put(4, "홍길동");
		map2.put(3, "도우너");

		System.out.println(map.toString());

		Set<Entry<String, Integer>> entrySet = map.entrySet(); // Entry<key타입,value타입> : key와 value를 하나로 묶은 것, 타언어로는
																// pare라고 함
		for (Entry<String, Integer>/* 하나의 Map은 Entry이기에 */ e : entrySet) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}

//		map.keySet(); // key들을 Set에 관리중이여서 모든 (참조변수).key들을 볼 수 있음
//		Set<String> keySet = map.keySet(); // .keySet : 모든 key를 반환
//		
//		for (String key : keySet) {
//			System.out.println(key + "=" + map.get(key)); // .get(key) : key에 등록된 value를 확인할 수 있음
//		}

//		Iterator<String> iter = keySet.iterator();
//
//		while (iter.hasNext()) {
//			String key = iter.next();
//			Integer value = map.get(key);
//
//			System.out.println(key + "=" + value);
//		}
	}

}
