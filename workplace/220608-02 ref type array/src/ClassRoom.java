
public class ClassRoom {
	private Student[] students;
	
	public ClassRoom() {}
	
	public ClassRoom(Student.../*Student[]*/ students) {
		this.students = students;
	}

	public void printNames() {
		for (int i = 0; i < students.length; i++) {
			System.out.printf("%d번 학생: \n"+students[i].getName(),i+1);
		}
	}

	public int getTotalAvg() {
		return (students[0].getAverage()
				+ students[1].getAverage()
				+ students[2].getAverage()) / 3;
	}
	
	// compare 메소드 활용
	public Student getTop() {
		Student top = students[0];
		for (int i = 1; i < students.length; i++) {
			top = max(top, students[i]);
		}
		return top;
		//return max(max(stu1, stu2), stu3);
        /*if(stu1.compare(stu2) && stu1.compare(stu3)) {
			return stu1;
		} else if (stu2.compare(stu1) && stu2.compare(stu3)) {
			return stu2;
		} else {
			return stu3;
		}*/
	}
	
	public Student max(Student left, Student right) {
		if (left.getAverage() >= right.getAverage()) {
			return left;
		} else {
			return right; 
		}
	}
	
	public Student getStudent(int index) {
		return students[index];
	}
}

