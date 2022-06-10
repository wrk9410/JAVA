
public class Main3 {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		// refNumber는 참조이기에 .입력 시 여러 실행을 확인가능 하지만, number1은 그렇지 않음
		Integer refNumber = Integer.valueOf(10);
		refNumber.compareTo(20); //
		
		
		System.out.println(Integer.max(100, 500));
	}
}
