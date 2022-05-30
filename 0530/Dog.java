// 강아지 Dog 클래스
// name : 이름
// breed : 종
// age : 나이

// 강아지 3개의 모든 필드를 전달받아 초기화 할 수 있는
// 생성자

// 강아지 이름, 종을 전달받은 값으로 초기화하고
// 나이는 1살로 초기화 할 수 있는 생성자

// 모든 필드를 private 접근 제한자로 정보은닉(캡슐화)하고
// 각 필드의 public한 getter/setter를 작성해보세용~~

public class Dog {
	private String name, breed;
	private int age;
	
	// 생성자
	public Dog() {
		
	}
	
	public Dog(String n, String b,int a) { // void 적혀있을 시 메소드
		// 필드 이름과 파라미터 이름은 겹쳐도 된다.
		// this.name = name;
		// this.breed = breed;
		// this.age = age;
		this.name = n;
		this.breed = b;
		this.age = a;
	}
	
	public Dog(String n, String b) { // void 적혀있을 시 메소드
		this.name = n;
		this.breed = b;
		this.age = 1;
	}
	public Dog(String n, String b, int a) {
		this(n,b,a);
	}
	
	
	// setter
	public void	setName(String n) {
		this.name = n;
	}
	public void setBreed(String b) {
		this.breed = b;
	}
	public void setAge(int a) {
		this.age = a;
	}
	
	
	// getter
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
	
	
	
}