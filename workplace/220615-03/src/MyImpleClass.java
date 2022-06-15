//class Test extends MyImpleClass {}

public class MyImpleClass extends MySubClass {
	
	@Override
	public void myMethod() {
//		부모 class의 메소드를 Override하는 것을 막는 것은 부모 메소드에 final 추가
		System.out.println("새롭게 재정의 하였습니다.");
	}
	
	@Override
	public void myMethod2() {
		System.out.println("마이 메소드2 오버라이드 구현");
	}
	
	public static void main(String[] args) {
		MyClass m = new MyImpleClass(); // ImpleClass는 일반 클래스 이기에 인스턴스 가능하지만 위 두 부모 class는 추상 class라 불가
		m.myMethod();
		
		MySubClass sub = (MySubClass) m;
		
		sub.myMethod2();
	
	}
}
