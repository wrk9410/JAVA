public class Add{
    public static void main(String[] args) {

	//변수선언 (variable declare)
	//int : 정수형 data type (자료형), 변수의 형태
	//x, y, sum : 변수의 이름
	/* 변수 이름
	영소문자로 시작 (대소문자를 구별)
	숫자가능
	공백불가
	특수문자(-, _ 두가지만 사용)
	ex)book_Title
	*/


    	int x;
	// 첫 번째 정수를 저장할 변수
	int y;
	// 두 번째 정수를 저장할 변수
	int sum;
	// 두 정수의 합을 저장하는 변수

	//초기화 (initalize)
	x = 100; // 대입연산자 (assignment)
	y = 200;
	sum = x + y;

	System.out.println(sum);
	//return; 생략하여도 적용은 됨, 오류날 수도 있음

	System.out.println(x - y);

	int minus;
	minus = x - y;
	System.out.println(minus);

	//return; 생략하여도 적용은 됨, 오류날 수도 있음
    }
}