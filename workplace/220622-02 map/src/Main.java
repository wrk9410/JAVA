import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("일", 1); // .put 객체의 형태로 2개의 파라미터를 받음
		map.put("이", 2);
		map.put("삼", 3);
		map.put("사", 4);
		
		System.out.println(map.size());
		
		System.out.println(map.get("이")); // map.get은 int값이 아닌 key값을 입력하면 그 key에 저장되어있는 value(원소값)가 나옴
		System.out.println(map.get("삼"));
		System.out.println(map.get("오"));
		System.out.println(map.get("이")); // 기존 생성된 key의 value에 값을 변경하면 마지막에 수정한 value로 덮어쓰기됨
		
		if(!map.containsKey("이")/*.containsKey(key)에 값이 없을 경우에만 넣어라*/) {
			map.put("이", 2222);
		}
		System.out.println(map.get("이"));
		
	}

}
