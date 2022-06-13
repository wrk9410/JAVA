public class Box {
	int width;
	int length;
	int height;
	
	
	/*public Box() {
		//해당 기본 생성자는 생략 가능
	}*/
	
	public Box(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
		//생성자를 하나라도 적으면 자동으로 만들어주지 않아 적지않아야 함
	}



	/*public Box() {
		width = 5;
		length = 5;
		height = 5;
		// 부모 class에서 값을 설정하면 자식 class에서도 해당 값이 기본값으로 설정됨
	}*/
	
	public int getVolume() {
		return width * length * height;
	}
	
}
