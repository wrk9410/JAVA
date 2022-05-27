public class StaticVariableAndConst2 {
	
	public static void printTest(int param) {
		// param++;
		System.out.println(param);
	}
	
	
	
	public static void main(String[] args) {
		int innerMain = 10;
		// System.out.println(TEST_SCOPE);
		final int TEST_SCOPE = 20;
		printTest(TEST_SCOPE);
		System.out.println("메인에서의 상수값: "+TEST_SCOPE);
		
	}
}