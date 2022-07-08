import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main7 {
	public static void main(String[] args) {
		Map<Integer, Set<Integer>> lotto = new LinkedHashMap<>();
		lotto.put(1000, new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
		lotto.put(1001, new HashSet<Integer>(Arrays.asList(7, 8, 9, 10, 11, 12)));
		lotto.put(1002, new HashSet<Integer>(Arrays.asList(14, 15, 16, 17, 18, 19)));

		// lotto.txt 출력
//		1000 : [1,2,3,4,5,6]
//		1001 : [7,8,9,10,11,12]
//		1002 : [14,15,16,17,18,19]

		File file = new File("d:\\filetest\\lotto.txt");
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(file);
			Set<Integer> keySet = lotto.keySet();
			for (Integer i : keySet) {
				pw.println(i + " : " + lotto.get(i));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
		// --------------------------------------------------------

		PrintWriter pw2 = null;
		try {
			pw2 = new PrintWriter(new FileWriter(file, true)); // true가 없을 경우 기존 내용은 사라지고 덮어씌어짐
			pw2.println("새 번호: 20,22,23,24,25,26");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw2.close();
		}

//		Set<Integer> keySet = lotto.keySet();
//		for (Integer key : keySet) {
//			System.out.println(key + " : " + lotto.get(key));
//		}

	}
}
