public class TestCar {
	public static void main(String[] args) {
		Car c = new Car("green", 10, 1);	// 설정하지 않으면 컴파일 에러
		Car c2 = new Car("yellow");			// 3개를 적어도 되지만 그럴 경우 3개의 입력을 받는 필드가 실행, 2개일 경우 존재하지않기에 컴파일 에러
		Car c3 = new Car("red");
		
		// c.color = "빨강";
		// Syetem.out.println(c.color);
		
		c.setColor("빨강"); // color
		System.out.println(c.getColor());
		
		c.setSpeed(30); // speed
		System.out.println(c.getSpeed());
		
		c.setGear(5); // gear
		System.out.println(c.getGear());
		
	}
}