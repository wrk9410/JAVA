public class Food {
	private int kcal;
	private int price;
	private int weight;
	
	public Food(int kcal, int price, int weight) {
		this.kcal = kcal;
		this.price = price;
		this.weight = weight;
	}
	
	public int getKcal() {
		return kcal;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getWeigh() {
		return weight;
	}
	
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String toString() {
		return "칼로리: "+kcal+"kcal, 가격: "+price+"원, 중량: "+weight+"kg";
	}
	
}
