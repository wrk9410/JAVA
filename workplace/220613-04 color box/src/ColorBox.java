
public class ColorBox extends Box {
	String color;
	
	public ColorBox(int width
			, int length
			, int height
			, String color) {
		super(width, length, height);
		this.color = color;
		// 생성자를 적었을 경우 위와 같이 초기화 시켜주어야 함
		
		/*super();
		this.color = null;*/
		//extends Box는 위 코드가 생략되어 있음
	}
	
	public String getColor() {
		return color;
	}
}
