public abstract class MySubClass extends MyClass {
	
	@Override
	public final void myMethod() { // 부모 class에서 추상 메소드가 final로 되어 있을 경우 접근 불가
		System.out.println("자식 클래스에서 구현되었습니다.");
	}
	
	public abstract void myMethod2();
}
