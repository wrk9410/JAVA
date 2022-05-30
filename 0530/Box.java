public class Box {
	int width;
	int length;
	int height;
	
	public Box() {
		width = 1;
		length = 1;
		height = 1;
	}
	
	public Box(int w, int l, int h){
		// 클래스명으로 메소드를 만들어 파라미터로 수정하여 값을 받을 수 있다.
		width = w;
		length = l;
		height = h;
	}
	
	public static void main(String[] args) {
		Box b3 = new Box(); // 파라미터를 입력하지 않아 컴파일에러
		Box b = new Box(50, 60, 70);
		
		// System.out.println(b.width);
		// System.out.println(b.length);
		// System.out.println(b.height);
		
		
		// 박스 인스턴스화. 생성자를 호출해서 가로 90 세로 100 높이 110
		// Box b2 = new Box(90, 100, 110);
	}
}