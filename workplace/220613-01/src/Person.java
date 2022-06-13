
public class Person {
	private String name;
	private int age; // Person의 나이가 private하게 되어있어 Sudent와 Athor
	// package(가장 큼) > class(패키지 내에서만 가능) > global(모두 접근가능)
	//public: 모든 곳에서 사용가능
	//protected 자식들까지 사용가능(자식이라면 다른 패키지도 적용가능)
	//private: 해당 class에서만 사용가능
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age; // 부모에서 만들면 자식들은 사용가능
	}
	
	public String getName() {
		return name;
	}
}
