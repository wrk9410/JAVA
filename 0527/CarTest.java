class Car {
	// 필드 정의
	String color; // 색상
	int speed; // 현재 속도
	int gear; // 현재 기어
	
	void print() {// 접근이 달라지는 거지 메소드의 기능이 바뀌는 건 아님
		System.out.print("("+color+", "+speed+", "+gear+")");
	}
}

public class CarTest {
	public static void main(String[] args) {
		{
			int a = 100;
			Car someCar = new Car(); 
		}
		// 중괄호를 나가면 instance가 사라지는 것이지만, 참조할 방법이 없으므로 쓰레기가 됨
		//GarbageCollector : 자동으로 쓰레기값을 처리해주는 메소드? 명령어? 가 있음
		
		
		
		
		
		
		
		/*Car myCar = new Car(); // 인스턴스화를 할 때 new는 필수적으로 있어야 함
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		myCar.print();
		
		//색상:blue 속도:60 기어:3
		
		Car myCar2 = new Car();
		myCar.color = "blue";
		myCar.speed = 60;
		myCar.gear = 3;
		myCar.print();*/
	}
}