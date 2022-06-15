// 도형
// x좌표
// y좌표

// 넓이 구할 수 있음
public abstract class Shape { // 추상 class
	
	private int x;
	private int y;
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	// 추상 메소드 - 메소드 Body X, header만 있음
	public abstract int getArea(); // 컴파일에러가 나는 이유: 일반적인 class에서는 추상메소드가 존재할 수 없음 | abstract class에서만 존재 가능
	// 도형(Shape)라는 것은 추상적이기에 설정이 어렵지만 넓이를 구하지않으면 의도와 다르게 만들어지기에 설정해주어야 함
	// 위 사항을 abstract(static 같은 것)을 사용해, 추상 메소드로 만들 수 있음
	
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	

}
