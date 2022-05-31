// 학급(반)
// 학생1
// 학생2
// 학생3

// 1. 3명의 학생의 이름을 콘솔에 출력할 수 있음
// 2. 학생 3명의 총 평균을 알려줄 수 있음.
// 3. 점수가 가장 높은 학생(참조)을 알려줄 수 있음. => 동일 점수. 1, 2, 3 | return type이 학생이여야 함






class Class1 {
	
	private Student st1,st2,st3;

	
	public Class1(Student st1, Student st2, Student st3) {
		super();
		this.st1 = st1;
		this.st2 = st2;
		this.st3 = st3;
	}

	// getter
	public Student getSt1() {
		return st1;
	}	
	public Student getSt2() {
		return st2;
	}
	public Student getSt3() {
		return st3;
	}
	
	//setter	
	public void setSt1(Student st1) {
		this.st1 = st1;
	}
	public void setSt2(Student st2) {
		this.st2 = st2;
	}
	public void setSt3(Student st3) {
		this.st3 = st3;
	}
	
	//메소드
	public void getAllName() {
		System.out.println(st1.getName());
		System.out.println(st2.getName());
		System.out.println(st3.getName());
	}
	
	public int getAllAvg() {
		return st1.getAverage();
	}
	
	
	
}


public class ClassMate {
	public static void main(String[] args) {
	
	Student std1 = new Student("길대수", 100, 85, 80);
	Student std2 = new Student("장예림", 100, 100, 75);
	Student std3 = new Student("전인하", 100, 97, 100);
	
	Class1 c1 = new Class1(std1, std2, std3);
	
	c1.getAllName();
	System.out.println(c1.getAllAvg());
	
	
	}
}


