import java.util.StringJoiner;

public class Main2 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",","[","]"); 
		// 델리미터, StringJoiner를 사용할 때 (사이에 넣을 문자, 시작에 올 문자, 끝에 오는 문자) 순으로 넣기
		sj.add("1");
		sj.add("2");
		sj.add("3");
		
//		String result = sj.toString();
//		System.out.println(sj + "asdf"); // toString을 작성하지 않아도 자동적으로 toString이 되어 출력되고, 문자열 더하기도 가능
		System.out.println(sj.toString());
	}
}
