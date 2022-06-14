import java.util.Scanner;

public class Member {
	private String name;
	private int height;
	private double weight;
	
	public Member(String name,int height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public Member consoleMember() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("관리할 인원 입력");
		int member = s.nextInt();
		
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member o = (Member) obj;
			return this.name.equals(o.name) && 
					this.height == o.height &&
					this.weight == o.weight;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
	
}
