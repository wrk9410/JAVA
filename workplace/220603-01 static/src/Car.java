
class Car {
	private String color;
	private int speed;
	private int gear;
	private int id;
	
	public static final int SHARE_NUMBER = 22;
	// 같은 값을 공유하여 사용할거면 상수(변하지 않는 수)로 설정해두는 것이 좋음
	private static int numberOfCars = 0;
	//static이 붙은 것은 외부에 존재하기에 객체, 필드가 아님
	
	public Car(String c, int s, int g) {
		this.color = c;
		this.speed = s;
		this.gear = g;
		
		numberOfCars++;
		id = ++numberOfCars;
	}
	
	/*public static void printColor() {
		System.out.println(color);
		// '프로그램이 실행'되어야 color라는 '필드가 생성'되기 때문에 color는 static에서 존재하지않아 접근 불가능
	}*/
	
	public void printStaticNumber() {
		System.out.println(numberOfCars);
	}
	
	public static int getNumberOfCars() {
		return numberOfCars;
	}
}
