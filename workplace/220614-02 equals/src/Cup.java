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