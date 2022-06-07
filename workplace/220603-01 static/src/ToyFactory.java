public class ToyFactory {
	public static Toy makeToy() {
		return new Toy("처키인형", 10000);
		// 동작, 기능 하나만 사용할 것이라면 static으로 설정 요망
	}
}
