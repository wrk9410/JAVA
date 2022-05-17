public class MulDiv {
    public static void main(String[] args) {
	//System.out.println("ABC" / 5);
	//문자와 정수는 사칙연산이 적용 불가하여 컴파일이 불가해짐
	System.out.println(50 / 0);
	

	System.out.println("10 곱하기 5는 "+ (10 * 5));
	//Java에서는 *우선 실행 그 후 +실행
	//괄호 먼저 수행
	System.out.println("22 나누기 4는 "+ (22 / 4));
	System.out.println("22 나누기 4는 "+ 22.0 / 4.0);

    }
}