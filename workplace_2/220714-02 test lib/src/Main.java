import kr.co.greenart.MyMath;
import kr.co.greenart.Person;

public class Main {
	public static void main(String[] args) {
		// 외부라이브러리 : 외부 클래스를 가져다 쓸 수 있음
		
		Person p = new Person("이름",15);
		System.out.println(p);
		System.out.println(MyMath.getZero());
		System.out.println(MyMath.sum(10, 20));
		
		
	}
}
