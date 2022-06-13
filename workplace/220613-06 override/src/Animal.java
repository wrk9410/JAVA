
public class Animal {
	public void sound() {
		System.out.println("동물은 제각각의 소리를 냅니다");
	}
}

class Dog extends Animal {
	@Override // method override 오타방지를 위해 적어두는 annotation
	public void sound()/*method override 오타 조심*/ { // method override
		// 부모 class의 메소드 명,타입,파라미터 순서 등 모든 걸을 똑같이 적어주고, 해당 메소드로 할 명령을 구체적으로 적어주어야 함
		System.out.println("멍멍");
		// 부모에게 정의된 method를 좀 더 구체적으로 표현할 때 override 사용
		//private 할 경우 overriding 불가
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("냐옹");
		
//		class 다이어그램 플러그인 : amateras-modeler
	}
}