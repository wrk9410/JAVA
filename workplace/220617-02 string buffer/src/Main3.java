// 문자 자르기
import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) {
		String longLine = "apple,banana.carrot/donut";
		
		
		String[] arrays = longLine.split(" "); //.split(자를기준) 자를 기준으로 순서대로 배열에 담겠다는 명령어
		System.out.println(arrays[2]);
		
		
//		StringTokenizer st = new StringTokenizer(longLine,",./");
//		// new StringTokenizer(잘라낼 문자열, 자를 기준), 자를 기준은 여러개가 될 수 있음
//		while (st.hasMoreTokens()/*자를 수 있는 게 있는지 확인 - true, false로 출력*/) {
//			System.out.println(st.nextToken()); // 있으면 출력
//		}
		
//		int i = 0;
//		while (st.hasMoreTokens()) {
//			i++;
//			String result = st.nextToken();
//			if (i == 3) {
//				System.out.println(result);
//			}
//		}
		
		
//		String[] arr = new String[4]; 우측 앞자리분
//		StringBuilder sb = new StringBuilder(longLine);
//		
//		for (int i = 0; i < 3; i++) {
//			int spaceIndex = sb.indexOf(" ");
//			arr[i] = sb.substring(0, spaceIndex);
//			sb.replace(0, spaceIndex + 1, "");
//		}
//		System.out.println(arr[2]);
		
	}

}
