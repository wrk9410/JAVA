public class StringEquals {
	public static void main(String[] args) {
		// 문자 하나하나가 동일하게 이루어져 있는지 비교, 문자열 비교는 equals 사용
		
		String a = "Hello";
		String b = "Hello";
		String llo = "llo";
		
		System.out.println(a == b); // 값이 아니라 참조하는 대상이 같은지를 확인하여 동일한 문자열인지 확인불가
		
		System.out.println(a == ("He" + llo)); // 값은 같지만 참조 대상이 달라짐
		//"He"+llo는 "Hello"가 되지만, 처음부터 "Hello"인 것이 아니기에 처음부터 "Hello"인 a와는 다르게 확인이 되는 것임
		
		System.out.println("------------문자열 값 동등 확인-------------");
		System.out.println(a.equals("He" + llo)); // (기준변수).equals(비교할 변수), 값이 같은지 확인을 하는 것이기에 true가 나옴
		
	}
}