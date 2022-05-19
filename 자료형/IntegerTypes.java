//int, double과 같은 자료형 파일을 알아보자

public class IntegerTypes{
	public static void main(String[] args){
		byte b = 100;
		short s = 30000;
		int i = 10_000_000; // 일반적으로 자리수를 표현하기 위해 쉼표를 쓰나, 컴파일 에러이기에 언더바로 표현
		long l = 123456789L; // 컴파일러에게 long type의 큰 숫자임을 알려주기 위해 L을 붙힘
		
		/*int*/ long sum = 100 + 100L; //long 따라가기에 int로는 연산이 되지않음, 처리를 위해서 int를 long으로 변경하여야 됨
		
		/*int bs = b + s; // 작은 범위와 큰 범위를 연산할 경우 큰 범위를 따라간다.
		System.out.println(bs);*/
		
		/*byte b2 = 100;
		
		byte sum = b1 + b2; // 공간이 넓을 경우 모든 수가 잘 들어가나, 작은 공간은 공간보다 큰 수가 들어가지 않음
							// int가 부족할 경우, long 사용
		System.out.println(sum);*/
	}
	
}