import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student implements Serializable { // 해당 class를 직렬화 가능하게 하기 위해서는 인터페이스를 추가해야됨, implements Serializable | 직렬화 가능 =
										// 객체를 온전히 저장할 수 있음
	private String name;
	private int age;
	private transient/* 추가할 경우 직렬화에서 제외할 수 있음 */ double score;

	public Student(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
}

public class Main {

	public static void main(String[] args) {
		// 학생
		// 이름: 문자열
		// 나이: 정수
		// 학점: 실수

		BufferedReader br = null;

		List<Student> list = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(new File("d:\\filetest\\student.txt")));
			while (true) {
				String name = br.readLine();
				// 메모장에 저장해둔 문자열들을 int, double 등으로 형변환하여 Student 객체로 만들 수 있게 해줌
				int age = Integer.valueOf(br.readLine());
				double score = Double.valueOf(br.readLine());

				Student s = new Student(name, age, score);
				list.add(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(list);

//		List<Student> list = new ArrayList<>(
//				Arrays.asList(new Student("홍길동", 22, 2.5), new Student("둘리", 33, 3.3), new Student("도우너", 44, 4.4))); // 파싱?
//
//		PrintWriter pw = null;
//
//		try {
//			pw = new PrintWriter(new File("d:\\filetest\\student.txt")); // 1.txt파일을 만들어서
//
//			for (int i = 0; i < list.size(); i++) {
//				Student s = list.get(i);
//
//				pw.println(s.getName()); // 2.만든 txt파일에 값들을 출력(넣기)
//				pw.println(s.getAge());
//				pw.println(s.getScore());
//				
//			}
//			pw.flush(); // 버퍼 정리?
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			pw.close();
//		}

	}

}
