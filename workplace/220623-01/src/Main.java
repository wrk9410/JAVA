import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("hello", 1);
		map.put("world", 2);
		map.put("abc", 123);
		
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("hello", 1);
		treeMap.put("world", 2);
		treeMap.put("abc", 123);
		
		System.out.println(map);
		System.out.println(treeMap);
	}
}
