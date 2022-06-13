class Manager extends Employee {
	private int bonus;
	
	public Manager() {
		super(); // 부모의 기존 생성자를 적지않아도 호출이 있어야 함, super() 생략가능
		// 또는 상속받은 부모 class에 기본 생성자를 만들어주어야함
	}
	
	public Manager(String name, String address, int salary, int RRN, int bonus) {
		super(name, address, salary, RRN);
		this.bonus = bonus;
	}
	public void printSalary() {
		System.out.println(name+"("+address+")"+(salary + bonus));
		// 수퍼클래스의 private 멤버를 제외한 모든 멤버 접근 가능
	}
	
	public void printRRN() {
//		System.out.println(RRN); // 오류! private는 서브 클래스에서 접근 못함!
	}
}