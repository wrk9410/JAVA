class Can {
	private String name;
	
	public Can(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

public class Main2 {
	public final int COLA = 1;
	public final int SPRITE = 2;
	public final int FANTA = 3;
	
	// 자판기 메소드
	// 정수형  -> 반환Type : Can
	// 1 -> field "콜라"
	// 2 -> field "사이다"
	
	
	//문자열 -> 반환Type: Can
	// "Cola" -> field "콜라"
	
	public static Can machine(int a) {
		Can c;
		switch (a) {
			case 1: c = new Can("콜라");
				return c;
			case 2:  c = new Can("사이다");
				return c;
			default:  c = new Can("환타");
				return c;
		}
	}
	
	public static Can machine(String a) {
		Can c;
		if (a.equals("Cola")) {
			c = new Can("콜라");
			return c;
		} else if (a.equals("Sprite")) {
			c = new Can("사이다");
			return c;
		} else {
			c = new Can("환타");
			return c;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(machine(1));
		System.out.println(machine("Sprite"));
	}

}
