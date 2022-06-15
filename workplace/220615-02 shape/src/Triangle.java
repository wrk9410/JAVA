
public class Triangle extends Shape { // 추상class를 상속받았기에 추상method를 구체화 시키지 않을 경우 에러
	private int base;
	private int height;
	
	public Triangle(int x, int y, int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}
	
	@Override
	public int getArea() { // 추상 메소드 Override 시, abstract 작성할 필요 없음
		return base * height / 2;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	
	
}
