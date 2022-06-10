public class Main2 {
	public static void main(String[] args) {
		int number = 22;
		// Wrapper class
//		Byte
//		Short
//		Integer //int의 Wrapper class는 Integer
//		Long
//		Float
//		Double
//		Character // char의 Wrapper class는 Character
//		Boolean
		// 원시형 타입에서 첫 자를 대문자로 바꿀 경우 Wrapper class가 됨
		Integer i = new Integer(10); //deprecated| 숫자 10이라는 필드형태의 객체가 생성되며 i라는 참조로 참조함, 1.8버전이 아니라 윗 버전일 경우 다른 거 쓰라고 빨간줄이 그임, 단 실행은 가능
		Integer i2 = Integer.valueOf(500); // boxing| Integer.valueOf(정수) 입력 시 원하는 객체로 변경 가능
		int primitiveInt = i2.intValue(); //unboxing| boxing을 풀고 다시 원시형 타입으로 변경을 원할 경우 (Integer).intValue(); 사용
	
		//System.out.println(primitiveInt);
		Integer auto = 100; //auto-boxing| 대입연산시 자동 boxing이 됨
		int un = auto; //aoto-unboxing| 원시형 형태로 참조값 넣을 시 자동 unboxing이 됨
		
		
		Integer.valueOf("5959"); // Integer.valueOf에 문자열 형식으로 숫자를 넣을 경우 자동으로 Integer 형태(정수참조)로 만들어줌
		int result = Integer.valueOf("1234"); // 위에서 Integer가 아닌 int형으로 반환
		
		Integer.parseInt("90"); // 문자열 값을 받아 int형으로 변경하여 반환해줌		
	}

}
