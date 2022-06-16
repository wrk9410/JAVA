interface PrintAll {
	void printAll();
}

public class Main {
//	못할 것 같으면 이전의 class 방식으로 진행해도 무관
	public static void main(String[] args) {
//		아주 사소한 class라도 파일이 생기기에 그러한 부분의 손실을 방지하기 위해 익명 class를 사용
		PrintAll a = new PrintAll() {
			@Override
			public void printAll() {
				System.out.println("출력할 거시 없는거시예여");
			}
		};
		a.printAll();
		a.printAll();
		
		
//		class Point implements PrintAll { // local class(지역 클래스)
//			int x;
//			int y;
//			public Point(int x, int y) {
//				super();
//				this.x = x;
//				this.y = y;
//			}
//			
//			@Override // local class의 interface 호출
//			public void printAll() {
//				System.out.println(x);
//				System.out.println(y);
//			}		
//		}.printAll();
//		
//		Point p = new Point(10, 20);
//		p.printAll();
		
	}

}
