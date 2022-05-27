public class Math {
	public static final double PI = 3.144568648646846
	
	public static alalskdkslsl() {
		
	}
}




public class StaticVariableAndConst3 {
	final static int NUMBER = 100; // 전역 변수. 여러 메소드에서 접근이 가능한 변수
	// NUMBER
	// public 붙으면 클래스 이름으로 전역 변수 호출 가능(ex. public static int number = 100) (ex - Math 클래스에 있는 PI)
	// public 아무곳에서나 사용가능하게
	//기능이나 변수들을 자기 자신만 사용하겠다는 키워드로 제약을 줄 수 있다
	//Math.PI도 public 하게 되어있음 
	
	public static void test() {
		// NUMBER++;
		System.out.println("테스트메소드에서 : " + NUMBER);
	}
	
	public static void main(String[] args) {
		// // NUMBER++;
		// System.out.println("메인미소드에서 : "+NUMBER);
		
		// test();
		
		// System.out.println(Math.PI);
		// Math.PI++;
		
		// double a = Math.abs(-372);
		// System.out.println(a);
		
		double r = Math.random();
		r = (int) (r * 10);
		System.out.println(r);
	}
}