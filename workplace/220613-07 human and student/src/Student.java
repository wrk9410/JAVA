
class Student extends Human {
	private String major;
	
	public Student(String name
			, int age
			, String profession
			, String major) {
		super(name, age, profession);
		// 상속 class 사용 시 부모 class 수정할 때 모든 자식 class는 영향을 받게되기에 주의해야함
		this.major = major;
	}

	@Override
	public String getProfession() {
		return "학생";
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		// 부모에 정의 되어있는 메소드는 자식도 동일하게 사용가능
		//return "이름: "+getName()+", 나이: "+getAge()+", 전공: "+major;
		
		// 부모 참조는 super. 으로 가능하다.
		return super.toString()+", 전공: "+major;
	}

}
