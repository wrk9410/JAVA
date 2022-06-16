public interface Days {
//	public static final int NUM = 10; // interface는 필드가 없고 상수로 적용됨
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WENDSDAY = 3;
}

interface MyInterface {
	default void printHello() {
//		default로 설정 후 상속받은 자식들이 사용할 경우 Override를 사용하게 함
		System.out.println("Hello");
	}
	
	default String printHelloo() {
//		static : 정적
		return "Hello";
	}
	
	public static void myStaticMethod() {
//		static 메소드도 interface에서 설정 가능
	}
	
	/*private*/static int sum(int a, int b) {
//		interface는 private 메소드를 기본적으로 설정 불가 하지만 가능하게 할 수 있음, 방법 모름
//		객체의 추상적인 행동만 나타내야하는 것이기에 
//		제목만 똑같고 내용은 다르다는 것이 추상적인 표현
		return a + b;
		
//		객체는 인스턴스를 만들어 참조를 해야 사용 가능하지만 static은 객체가 아니므로 그냥 메소드 그 자체이다.
	}
	
	
	
	
	
	
	
	
}