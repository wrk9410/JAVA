public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {
		// 스캐너 입력으로 저장받기 위해 생성자 1개 더 생성
	}
	
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Student(String name) {
		this.name = name;
	}

	//getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	//setter
	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public boolean compare(Student other) {
		return this.getAverage() >= other.getAverage();
	}
	
	// int 값 반환하는 get average
	public int getAverage() { // void일 경우 리턴 값 보내지 못함
		return getSum() / 3;
	}

	public int getSum() {
		return (kor + eng + math);
	}
}
