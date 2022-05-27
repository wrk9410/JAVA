public class TestBox {
	public static void main(String[] args) {
		
		/*Box none = null; //참조형 변수는 null을 참조할 수 있다.
		//null 참조 = 지금 참조하고 있는 것이 없다는 것
		none.width = 10; // 없음을 참조하고 있으므로 가로가 없어서 실행 중 error 발생*/

		
		Box box1; // Box라는 클래스가 하나의 타입으로 선언됨 ( (참조할 메소드) (참조변수) )
		
		box1 = new Box();
		box1.width = 3; // Box class 안의 width의 값을 설정함
		box1.length = 3;
		box1.height = 3;
		
		// System.out.println(box1.color);
		
		Box box2 = new Box(); // 하나는 큰 박스, 하나는 작은 박스인 것을 보여주기 위해
		box2.width = 10;
		box2.length = 10;
		box2.height = 10;
		
		System.out.println(box1.getVolume());
		System.out.println(box2.getVolume());
		
		
		
		box1.printAllState();
		box2.printAllState();
		//각각의 인스턴스마다 고유의 값이 있음
		
		//OOP : 객체 지향 프로그래밍
		//상태를 가지고 흘러가는 프로그램을
		//인스턴스가 공간을 사용하고 있음
		
		// System.out.println(box1.width);
		// System.out.println(box2.width);
		
		// box1.width = 5;
		// System.out.println(box1.width);
	}
}