import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 학생
// 이름
// 나이

// (학생은 이름과 나이가 같으면 동일 학생입니다.)

// 홍길동 15
// 둘리 22
// 도우너 33

// 위의 학생을 원소로 가지는 리스트를 생성하고
// (도우너 33) 학생의 인덱스를 찾아보세요

class Student implements Comparable<Student>/*비교를 위해서는 Comparable 비교 및 <제네릭> 작성하여야 됨*/ {
	private int age;
	private String name;
	private int score;

	public Student(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}

	public Student(String name, int age, int score) {
		super();
		this.age = age;
		this.name = name;
		this.score = score;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", score=" + score + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		return score - o.score;
	}

}

public class Main2 {
	public static void main(String[] args) {

		Student s1 = new Student("홍길동", 15, 90);
		Student s2 = new Student("둘리", 22, 80);
		Student s3 = new Student("도우너", 33, 95);

		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		int index = list.indexOf(new Student("도우너", 33, 0));
		System.out.println(index);
		
		//정렬
		Collections.sort(list); // list가 가지고 있는 원소(제네릭)이 Student인데 Student는 대소를 비교할 메소드가 없어서 정렬 불가
//		List를 비교할려면 equals를 override해야하며, 정렬을 위해 Comparable도 implements를 받아 compareTo를 override 해야함
		System.out.println(list);
		
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}
		};
		
		Collections.sort(list, comparator);
		System.out.println(list);
	}
}
