
public class Phone {
	private String company;
	private int price;
	private int comtype;
	
	public Phone(String company, int price, int comtype) {
		this.company = company;
		this.price = price;
		this.comtype = comtype;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getComtype() {
		return comtype;
	}

	public void setComtype(int comtype) {
		this.comtype = comtype;
	}
	
	public String toString() {
		return "제조사: "+company+", 가격: "+price+"원, 통신타입: "+comtype+"g";
	}

}
