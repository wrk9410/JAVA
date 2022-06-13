
public class Student extends Person {
	private int score;
	
	public Student(String name, int age, int score) {
		//this는 자기 자신을 참조하는 것이기에 상속을 받은 경우 적용불가
		super(name, age); // 부모의 생성자를 받아온 것(super로 부모의 생성자를 받아올 수 있음), 언제나 생성자의 첫 문장이여야함
		this.score = score;
	}
	
	public void setAge() {
		//this.age = 10;
		//super.age = 10;
		//위 둘 모두 적용을 위해서는 부모 class의 age를 protected로 해야함
	}
	
	public int getScore() {
		return score;
	}
}
