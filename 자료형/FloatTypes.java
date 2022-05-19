public class FloatTypes {
	public static void main(String[] args) {
		/*32bit*/ float f = 123.456F; //java 컴파일러는 실수형의 경우 기본적으로 double형으로 생각하기에, F를 붙혀 float이라는 것을 알려줌
		/*64bit*/ double d = 7777.88888;
		
		// /*float*/double sum = f + d; // 실수형도 정수형과 동일하게 큰 공간을 따라가기에 float과 double연산을 하려면 double형으로 자료형 작성하여야 됨
		
		// /*32bit*/int i = 10000;
		// /*int*/double sum = i + f; //정수형과 실수형이 있을 경우 실수형이 더 크기에 실수형을 따라가여서 int로는 불가
	
		// float sum = i + f;
		
		float one = 0.1F;
		System.out.printf("%.15f\n",one * 22); //실수 표현 문자는 %.(자리수)f, 자리수 만큼 소수점을 보이게 함
		// tip. 실수 표현은 double이 더 정확하기에 웬만하면 double로 사용함
		System.out.printf("%10d",10); // %(자리수)d 사용가능, 자리수만큼 빈자리를 채우겠다는 것 
	
	
	
	}
}