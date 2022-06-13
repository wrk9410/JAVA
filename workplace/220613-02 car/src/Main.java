
public class Main {
	public static void main(String[] args) {
		SportsCar c = new SportsCar();
		c.color = "Red";
		c.speedUp(100);
		c.speedDown(30);
		c.setTurbo(true);
		
		Car normalCar = new Car();
		normalCar.color = "Green";
		normalCar.speedUp(30);
		normalCar.speedDown(20);
//		normalCar.setTurbo(true);
		
		// 자바에서는 다중 상속은 안되지만 인터페이스로 비슷한 구현을 할 수 있음
		
	}
}
