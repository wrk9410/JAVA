// 삼각형// 중심점(x, y)// 밑변// 높이// 넓이를 구해서 알려줄 수 있음

// 직사각형// 중심점(x, y)// 가로// 세로// 넓이를 구해서 알려줄 수 있음

// 원// 중심점(x, y)// 반지름// 넓이를 구해서 알려줄 수 있음
public class Main {
	public static void main(String[] args) {
//		Shape s1 = new Shape();
//		Shape s2 = new Shape(10, 20); // 추상 class는 인스턴스화가 불가능(덜 구체적인 class이기에 불가)
		
		Shape r = new Rectangle(0, 0, 10, 10);
		System.out.println(r.getArea());
		
		Shape c = new Circle(0, 0, 5);
		System.out.println(c.getArea());
		
//		Triangle t = new Triangle(0, 0, 5, 5);
//		System.out.println(t.getArea());
//		
//		Shape s = t;
//		System.out.println(s.getArea()); // 자식 참조를 부모 참조로 변경하였을 경우, 추상 메소드 실행 시 자식에 설정되어있는 메소드로 실행됨
	
	}
}
