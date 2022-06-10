
public class Main {
	
	public static void someMethod(int param) {
		
	}
	
//	public static String sum(int adad, int adad) {
//	//		파라미터의 타입, 순서, 개수가 같으면 같은 메소드임
//	//		리턴형이 달라도 같은 메소드로 취급 }
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	public static void sum(double a, double b) {
		System.out.println(a + b);
	}
	// 파라미터의 타입, 순서, 개수가 다를 경우 다른 메소드임
	
	
	public static void main(String[] args) {
//		someMethod(3873.03736);
//		someMethod("asdf");
		
		// Method Overloading
//		System.out.println(123123);
//		System.out.println(123.123);
//		System.out.println("123.123");
		sum(50, 20);
		sum(10.0, 40.0);
//		sum("asdf", "qwer");
	}

}
