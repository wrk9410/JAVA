public class TestRange {
	public static void main(String[] args){
		// 0 ~ 100 사이인지?
		
		// 숫자가 0이상'이고' 100이하 인가? = && and연산자
		int number = 100;
		
		// System.out.println(0 <= number <= 100); // 관계연산자는 한 번에 하나씩만 사용 가능, 두 개 이상 불가
		
		System.out.println(0 <= number && number <= 100);
	}
}