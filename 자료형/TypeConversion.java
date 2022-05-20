public class TypeConversion{
	public static void main(String[] args){
		int i;
		double f;
		
		f = 5 / 4; // f는 1.0
		System.out.println(f);
		f = (double) 5 / 4; // f는 1.25, 형변환이 먼저 일어남
		System.out.println(f);
		f = 5 / (double) 4; // f는 1.25, 형변환이 먼저 일어남
		System.out.println(f);
		f = (double) 5 / (double) 4; // f는 1.25
		System.out.println(f);
		i = (int) 1.3 + (int) 1.8; // i = 2, 실수를 (int)로 형변환하여 소수점이 소멸됨
		System.out.println(i);
		i = (int) (1.3 + 1.8); // i = 3, 더하기의 괄호가 먼저 진행되어, 3.1 이후 (int) 형변환되어 소수점 없이 3이 됨
		System.out.println(i);
		
	}
}