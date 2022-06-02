// 학생(이름, 국영수) 관리 프로그램
// 콘솔 입출력 필요
// 반에 학생을 등록. 최대 3명까지
// 이름 목록 확인 가능하게.
// 사용자가 등록한 학생의 평균을 확인 가능하게
// 1등 학생의 정보도 확인 가능하게
// 추가적인 기능 자유롭게.

// 기존에 만들었던 클래스 << 수정을 한다면, 수정하는 이유와 전 후가 어떻게 바뀌었는지 '전체 기록'







// 학급(반)
// 학생1
// 학생2
// 학생3

// 1. 3명의 학생의 이름을 콘솔에 출력할 수 있음
// 2. 학생 3명의 총 평균을 알려줄 수 있음.
// 3. 점수가 가장 높은 학생(참조)을 알려줄 수 있음. => 동일 점수. 1, 2, 3 | return type이 학생이여야 함




import java.util.Scanner;

class Class1 {
	
	private Student st1,st2,st3;
	

	
	Class1(Student st1, Student st2, Student st3) {
		super();
		this.st1 = st1;
		this.st2 = st2;
		this.st3 = st3;
	}

	// getter
	private Student getSt1() {
		return st1;
	}	
	private Student getSt2() {
		return st2;
	}
	private Student getSt3() {
		return st3;
	}
	
	//setter	
	private void setSt1(Student st1) {
		this.st1 = st1;
	}
	private void setSt2(Student st2) {
		this.st2 = st2;
	}
	private void setSt3(Student st3) {
		this.st3 = st3;
	}
	
	//메소드
	void getAllName() {
		System.out.println(st1.getName());
		System.out.println(st2.getName());
		System.out.println(st3.getName());
	}
	
	int getAllAvg() {
		return (st1.getAverage()+st2.getAverage()+st3.getAverage()) / 3;
	}
	
	private void rankPrint(Student a) {
		System.out.printf("*이름*\t*평균*\n %s\t %d점",a.getName(),a.getAverage());
	}
	
	void getAllAvgRank() {
		int s1 = st1.getAverage();
		int s2 = st2.getAverage();
		int s3 = st3.getAverage();
		//boolean a = true;
		System.out.println("======1등======");
		
		if (s1 >= max(s2,s3)) {
			rankPrint(st1);
		} else if (s2 >= max(s1,s3)) {
			rankPrint(st2);
		} else {
			rankPrint(st3);
		}
	}
	
	public int max(int left, int right) {
		return left > right ? left : right;
	}					    /*true : false*/
		/*if (s1 ==  s2 || s1 == s3) {
			if ( s1 == s2 && s2 == s3) {
				rankPrint(st1);
			}
			else if (s1 >= s2 && s1 >= s3) {
				rankPrint(st1);
			} else if (s2 >= s3 && s2 >= s1) {
				rankPrint(st2);
			} else {
				rankPrint(st3);
			}
		} else if (s1 >= s2 && s1 >= s3) {
			rankPrint(st1);
		} else if (s2 >= s1 && s2 >= s3) {
			rankPrint(st2);
		} else if (s3 >= s1 && s3 >= s2) {
			rankPrint(st3);
		}
	}*/



// 학급 관리 프로그램 추가 클래스
	private void getStName(Student a, Student b,Student c) {
		// 학생 이름 입력
		Scanner s = new Scanner(System.in);
		System.out.print("학생1: ");
		a.setName(s.nextLine());
		System.out.print("학생2: ");
		b.setName(s.nextLine());
		System.out.print("학생3: ");
		c.setName(s.nextLine());
	}
	
	private void getStScore(Student a) {
		Scanner i = new Scanner(System.in);
		
		for(int k=1; k < 4;k++) {
			System.out.printf("* 학생%d 국,영,수 점수 입력 *",k);
				switch (k) {
				case 1: System.out.printf("국%d: ",k);
					a.setKor(i.nextInt());
				case 2: System.out.printf("영%d: ",k);
					a.setEng(i.nextInt());
				case 3: System.out.printf("수%d: ",k);
					a.setMath(i.nextInt());
				}
			}	
		}
			
	public void getAllScore() {
		System.out.printf("국1: %d",st1.getKor());
		System.out.printf("영1: %d",st1.getEng());
		System.out.printf("수1: %d",st1.getMath());
		System.out.printf("국2: %d",st2.getKor());
		System.out.printf("영2: %d",st2.getEng());
		System.out.printf("수2: %d",st2.getMath());
		System.out.printf("국3: %d",st3.getKor());
		System.out.printf("영3: %d",st3.getEng());
		System.out.printf("수3: %d",st3.getMath());
		
	}
	public void getStAll(Student a,Student b,Student c) {
		getStName(a, b, c);
		//getStScore(a, b, c);
		getAllName();
		getAllScore();
	}
}


public class ClassMate {
	public static void main(String[] args) {
		
		// 학급관리 프로그램
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		Class1 c1 = new Class1(st1, st2, st3);
		
		c1.getStAll(st1,st2,st3);

		
		
		//===============================================
		/*Student std1 = new Student("길대수", 100, 100, 100);
		Student std2 = new Student("장예림", 100, 100, 100);
		Student std3 = new Student("전인하", 100, 100, 100);
		
		Class1 c1 = new Class1(std1, std2, std3);
	
		c1.getAllName(); // 전체 이름
		System.out.println(c1.getAllAvg()); // 전체 평균
		c1.getAllAvgRank();
	*/
	
	
	}

	/*private static void getStAll(Student st1, Student st2, Student st3) {
		// TODO Auto-generated method stub
		
	}*/
}


