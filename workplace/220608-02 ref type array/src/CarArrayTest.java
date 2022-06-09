
class Car {
	public int speed; // 속도
	public int gear; // 주행거리
	public String color; // 색상
	
	public Car() {
		speed = 0;
		gear = 1;
		color = "red";
	}
	
	public void speedUp() { // 속도 증가 메소드
		speed += 10;
	}
	
	public String toString() { // 객체의 상태를 문자열로 반환하는 메소드
		return "속도: " + speed + " 기어: " + gear + " 색상: " + color;
	}
}

public class CarArrayTest {
	public static void main(String[] args) {
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS]; // 자동차가 만들어진 게 아니라 자동차 배열이 만들어진 것
		
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car(); // i번째 index에 새자동차 참조를 한 것
		}
		
		for (Car car : cars) {
			// cras의 0번 index부터 하나씩 속도를 넣겠다
			car.speedUp();
		}
		
		for (Car car : cars) {
			System.out.println(car);
//			System.out.println(car.toString);
		}
		
//		for (int i = 0; i < cars.length; i++) {
//			cars[i] = new Car();
//		}
//		for (int i = 0; i < cars.length; i++) {
//			cars[i].speedUp();
//		}
//		for (int i = 0; i < cars.length; i++) {
//			System.out.println(cars[i]);
//		}
	}
}
