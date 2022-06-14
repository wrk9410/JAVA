// 컵라면
// 제조사
// 이름
// 가격

// 생성자, 게터세터

// Override
// toString
// equals - 제조사와 이름이 같을 경우 true
// 기준은 제조사와 이름

class Cup {
	private String company;
	private String name;
	private int price;
	
	public Cup(String company, String name, int price) {
		super();
		this.company = company;
		this.name = name;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public boolean equals(Object o) {		
		if ( o instanceof Cup) {
			Cup other = (Cup) o;
			return this.company.equals()
		}
	}
	/*@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cup) {
			if (company.equals(((Cup) obj).company) && 
					name.equals(((Cup) obj).name)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}*/
	
	@Override
	public String toString() {
		return "Cup [company=" + company + ", name=" + name + ", price=" + price + "]";
	}
}

public class Main2 {
	public static void main(String[] args) {
		Cup c1 = new Cup("농심", "육개장", 1000);
		Cup c2 = new Cup("삼양", "육개장", 1200);
		Cup c3 = new Cup("농심", "육개장", 1000);
		
		System.out.println(c1.toString());
//		System.out.println(c1.hashCode());
		System.out.println(c2);
		System.out.println(c3);
		
//		다운캐스팅(하향형병환)은 되지않음
		
		
//		Cup a = new Cup("육개장","농심",900);
//		Cup b = new Cup("육개장","농심",1150);
//		
//		System.out.println(a.toString()+"  "+b.toString());
//		
//		if (a.equals(b)) {
//			System.out.println("동일");
//		} else {
//			System.out.println("비동일");
//		}
//		
		
		
	}

}
