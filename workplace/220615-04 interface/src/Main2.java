// 학생 : 이름, 나이
// 영국학생 : 인사할 수 있음 (Hello)
// 한국학생 : 인사할 수 있음(안녕)
// 미국인 : 인사할 수 잇음 (Wassup)

interface IHello {
	void hello();
}

interface EngHello extends IHello {
	//interface 끼리는  상속이 가능
	//인터페이스를 구현하기 위해 쓰는 것 : implements
	//상속일 때는 인터페이스라도 extends로 상속
}

interface KorHello extends IHello {
	void whatisyourfarther();
}

class StdenT {
	
}
class BritStudent extends StdenT implements IHello {
	@Override
	public void hello() {
		System.out.println("Hello");
	}
}
class KorStudent extends StdenT implements KorHello {
	@Override
	public void hello() {
		System.out.println("안녕");
	}

	@Override
	public void whatisyourfarther() {
		System.out.println("느그 아부지 무하시노");
		
	}
	
}
class American implements IHello {
	@Override
	public void hello() {
		System.out.println("Wassup");
	}
}

public class Main2 {
	public static void main(String[] args) {
		KorStudent s1 = new KorStudent();
		BritStudent s2 = new BritStudent();
		American s3 = new American();
		
		IHello[] arr = new IHello[3]; // 인터페이스도 똑같이 타입 선언이 가능
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].hello();
		}
		
	}

}
