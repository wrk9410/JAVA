// 학생

// 이름
// 국어 점수
// 영어 점수
// 수학 점수

// 생성자
// getter/setter

// 자기 평균 점수를 알려줄 수 있음.

class Student {
	private String name;
	private int kor, eng, math;
	private double sum, avg;
	
	public Infom(String n, int k, int e, int m) {
		name = n;
		sum = k+e+m;
		avg = sum / 3.0;
	}
	
	//getter
	public String getName(){
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public double getSum() {
		return sum;
	}
	public double getAvg() {
		return avg;
	}
	
	//setter
	public String setName(){
		
	}
	public int setKor() {
		
	}
	public int setEng() {
		
	}
	public int setMath() {
			
	}
	public double setSum() {
		
	}
	public double setAvg() {
		
	}
	
	
}
