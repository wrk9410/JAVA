public interface Flyable {
	//int number = 10; // 필드 아님
	
	/*public abstract : 인터페이스는 무조건 public이기에 생략해도 됨*/void fly();
	
	/*public void print() { // 인터페이스는 추상메소드만을 가질 수 있기에, 일반 메소드 생성 불가
		System.out.println("Hello");
	}*/
}

class Animal {}

class Bird extends Animal {}

class Eagle extends Bird implements Flyable { // implements : 인터페이스 호출, 추상 메소드를 구체적으로 구현하여 작성할 수 있게 하는 것
	@Override
	public void fly() {
		System.out.println("독수리가 푸드득 푸드득 납니다.");
	}
}

class Penguin extends Bird {}

class FlyingFish extends Animal implements Flyable {
	@Override
	public void fly() {
		System.out.println("날치가 물위로 남");
	}
}

class Plane implements Flyable {
	@Override
	public void fly() {
		System.out.println("비행기가 남");
	}
	
}






