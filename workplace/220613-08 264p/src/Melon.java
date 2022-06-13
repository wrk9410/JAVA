
public class Melon extends Food {
	private String farm;

	public Melon(int kcal, int price, int weight, String farm) {
		super(kcal, price, weight);
		this.farm = farm;
	}

	@Override
	public String toString() {
		return super.toString()+", 농원: "+farm;
	}
	
}
