/*interface class 제작
 * public interface 인터페이스_이름
 * 	반환형 추상 메소드1(...) 
 * 	반환형 추상 메소드2(...)
 */

/*interface 
 * 
 * 
 * 
 * 
 */

// 인터페이스는 클래스가 아니므로 new 연산자는 사용할 수가 없다.


public class Main {
	public static void main(String[] args) {
//		Flyable f = new Flyable(); interface도 인스턴스화 불가
		
		Penguin penguin = new Penguin();
//		Flyable test = penguin; // Flyable의 
		
		Eagle e = new Eagle();
		Bird b = e;
		Animal a = e;
		Flyable f = e; // interface의 타입으로써도 상속받은 Eagle로 업캐스팅 가능
		
		Eagle downCasting = (Eagle) f;
		downCasting.fly();
		
//		f.fly();
//		
		Flyable p = new Plane();
		Eagle test = (Eagle) p; // Plane과 Eagle은 서로를 참조한 것도 상속 받은 것도 아니기에 다운 캐스팅 불가
		
//		Flyable fish = new FlyingFish();
//		
//		p.fly();
//		fish.fly();
		
	}
}
