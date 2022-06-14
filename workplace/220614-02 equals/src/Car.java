
public class Car {
	private String model;
	// 상태라는 값에 비교하여 값이 같을 경우인 지를 판별
	
	public Car(String model) {
		super();
		this.model = model;
		}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Car) {
			return model.equals(((Car) obj).model);
		}
		else {
			return false;
		}
		
	}
}