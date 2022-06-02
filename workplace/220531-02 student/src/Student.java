import java.util.Scanner; // 입력을 받기 위해 Scanner 클래스 호출


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
	
	// int 값 반환하는 get average
	public int getAverage() { // void일 경우 리턴 값 보내지 못함
		return getSum() / 3;
	}

	public int getSum() {
		return (kor + eng + math);
	}
	
	// 학급관리 프로그램 추가 메소드
	
	/*private void getStName(String a) {
		// 학생이름 입력 후 저장
		for (int i = 3; i > 0; i--) {
			System.out.println(a);
			Scanner s = new Scanner(System.in);
			return s.nextLine();
		}
		
	}
	
	private int getStScore(String a) {
		// 학생점수 입력 후 저장
		System.out.println(a);
		Scanner i = new Scanner(System.in);
		return i.nextInt();
	}*/
	
	
	// 학급관리 프로그램 수정 메소드
	 
	//"""""""""
	
	
	
}
