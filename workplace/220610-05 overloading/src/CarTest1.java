class Car {
	// 필드 선언
	private int speed;	// 속도
	//중복 메소드: 정수 버전
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수 버전 호출");
	}
	//중복 메소드: 실수 버전
	public void setSpeed(double s) {
		speed = (int)s; // (int) 형변환 정수부분만 가져옴
		System.out.println("실수 버전 호출");
	}
}

public class CarTest1 {	
	public static void main(String[] args) {
		Car myCar = new Car();	// 첫번째 객체 생성
//		myCar.setSpeed(100);	// 정수 버전 메소드 호출
//		myCar.setSpeed(79.2);	// 실수 버전 메소드 호출
		
//		myCar.setSpeed(1000L); // int 보다 double이 더 범위가 크기에 실수 버전 호출
//		myCar.setSpeed('A'); // 문자여서 아스키 코드로 들어가짐, 정수 버전 실행
//		myCar.setSpeed("A"); // 문자열이여서 String 타입이 없기에 실행불가
	}
}
