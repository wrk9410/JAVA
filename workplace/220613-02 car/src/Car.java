
public class Car { //부모 class
	int speed;
	int gear;
	public String color;
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public void speedDown(int decrement) {
		speed -= decrement;
	}
	
	
}
