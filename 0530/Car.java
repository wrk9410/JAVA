public class Car {
	private int speed;		// 속도
	private int gear;		// 기어
	private String color; //private 외부에서는 해당 필드를 볼 수도, 변경 할 수도 없어짐(숨김처리) | Car라는 자신의 범위에서만 사용가능
	// private : 접근제한자 | 메소드의 형태로 전달가능?
	
	// 첫 번째 생성자
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	// 색상만 주어진 생성자
	public Car(String c) {
		this(c, 0, 1);		// 첫 번째 생성자를 호출한다. | this 자기 자신을 선택하여 값 변경하는 것, 자기 자신을 참조하는 것이며 ()를 할 경우 생성자 변경
		// 색상만 변경되고 기어와 속도가 정해져있는 생성자
		
		System.out.println("초기화 과정 중~~");
	}
	
	// =======중요========
	
	// 접근(색상)
	public String getColor() {
		return color;
	}
	
	
	// 설정 값을 변경 가능하게 (색상)
	
	/*public void setColor(String c) {
		color = c;
	}*/
	
	public boolean setColor(String c) {
		if (c != null) {
			color = c;
			return true;
		}
		return false;
	}
	
	
	//======get,set speed======
	
	// setter <<
	public void setSpeed(int s) { // 값을 변경해주는 것은 set
		speed = s;
	}
	// getter <<
	public int getSpeed() { // 값을 보여주는 것은 get
		return speed;
	}
	
	
	
	//======get,set gear======
	// setter << 설정자
	public void setGear(int g) {
		gear = g;
	}
	// getter << 접근자
	public int getGear() {
		return gear;
	}
	
	
	/*값을 메소드로 변경 후 메소드로 출력 시켜 main에서도
	변경 및 실행 가능*/  
	
	
}