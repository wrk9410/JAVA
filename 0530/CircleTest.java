class Point {
	private int x;
	private int y;
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle {
	private int radius = 0;
	private Point center; // Point 참조 변수가 필드로 선언되어 있다. has-a
	
	// 생성자
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
	
	// 중심점 getter
	public Point getPoint() {
		return center;
	}
	public void setPoint(Point p) {
		center = p;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		// Circle 객체를 생성하고 초기화한다.
		Point p = new Point(25, 78);
		Circle c = new Circle(p, 10);
		
		System.out.println(p); // Point@15db9742, p의 문자열 표기
		System.out.println(c.getPoint()); // Point@15db9742
		
		/*System.out.println(new Point(34, 22)); 새로운 포인트 생성은 p와 다르게 나옴*/
	}
}