public class AutoInc {
	public static void main(String[] args) {
		int a = 10;
		// 복합 대입 연산자 += -= 등
		// a += 1; // 11
		// a -= 1; // 10
		
		a++; // 명령어보다 먼저 적용을 받기위해서는 위에 먼저 입력해주는 것이 좋음
		System.out.println(++a);
		
		// 증감연산자 , 앞 뒤 상관없이 가능, 순서에 차이있음
		// 1.++(변수) : 먼저 수행, 2.(변수)++ : 나중에 수행
		// a++; //a에 1만큼 더 하겠다.
		// a++;
		// a++;
		
		// a--; //a에 1만큼 빼겠다.
		// System.out.println(a);
	}
}