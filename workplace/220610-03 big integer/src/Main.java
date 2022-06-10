import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
//		System.out.println(Long.MAX_VALUE);
		
//		//Long 범위를 벗어났을 때 더 큰 수를 표현할 때 쓸 수 있는 타입
//		BigInteger value1 = new BigInteger("9223372036854775808");
//		System.out.println(value1.add(new BigInteger("10"))); //BigInteger는 산술연산자(+,- 등) 사용불가
//		//BigInteger 주의할 점 : value1에 더하라고 하였기에 value1이 바뀌었는지 확인할 경우, 새BigInteger를 만들어서 value1 값 자체가 바뀐 것은 아님
//		System.out.println(value1);
//		
//		BigDecimal dec = new BigDecimal("0.123456789");
//		//double, float 오차를 낼 수 있는 근사값
		
		BigDecimal d = new BigDecimal(0.1);
		// 주의할 점 : 부정확한 값을 가지고 있어 이대로 출력시킬 경우 뒤의 상관없는 값들도 같이 나옴
		System.out.println(d);
	}
}
