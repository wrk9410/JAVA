// 직원
public class Employee {
	private String name;
	private String depart; // 1.조련사, 2.경영 3.사무
	private Animal[] arr;
	
	public Employee(String name, int depart, Animal[] arr) {
		super();
		this.name = name;
		switch (depart) {
			case 1: this.depart = "경영자";
			break;
			case 2: this.depart = "사육사";
			break;
			default : this.depart = "사무";
			break;
		};
		this.arr = arr;
	}
	public Employee(Employee emp) {
		name = emp.getName();
		depart = emp.getDepart();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", depart=" + depart + "]";
	}
	
}
