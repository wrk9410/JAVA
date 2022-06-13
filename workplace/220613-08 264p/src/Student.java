public class Student {
	private String name, belong;
	private int id, grade, score;
	public Student(String name, int id, String belong, int grade, int score) {
		super();
		this.name = name;
		this.belong = belong;
		this.id = id;
		this.grade = grade;
		this.score = score;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBelong() {
		return belong;
	}
	public void setBelong(String belong) {
		this.belong = belong;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return "이름: "+name+", "+id+"학번"+", "+belong+"과"+", "+grade+"학년"+", 학점: "+score;
	}
}
