import java.util.HashMap;
import java.util.Map;

public class Wordfreq {
	public static void main(String[] args) {
		String line = "Hello. I'm a java developer";

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				int value = map.get(c);
				value += 1;
				map.put(c, value);
			}
			/*코드 설명 : 1.문자열을 하나씩 확인하여 비어있는 map의 key에 문자열의 문자 하나씩들을 담아두어 key로 등록
			 * 		   2.그렇게 하나씩 확인 후 map
			 * */
		}
		System.out.println(map);

//		System.out.println(line.charAt(2));
//		
//		for (int i = 0; i < line.length(); i++) {
//			map.put(line.charAt(i), ()) }

		/* 아래 내용 해석 시 220622 수업 잘 들은 것 */
//		Map<String, Integer> m = new HashMap<String, Integer>();
//
//		String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "problem" };
//		
//		for (String a : sample) {
//			Integer freq = m.get(a);
//			m.put(a, (freq == null) ? 1 : freq + 1); // sample의 순환 중 null일 경우 1을 반환하고
//		}
//		
//		System.out.println(m.size() + " 단어가 있습니다");
//		System.out.println(m.containsKey("to"));
//		System.out.println(m.isEmpty());
//		System.out.println(m);
	}
}
