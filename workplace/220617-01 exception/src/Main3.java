public class Main3 {
	public static void main(String[] args) {
		try { // try는 항상 실행
			System.out.println("try 블록 안");
			
			System.out.println("문장1");
			
			Object o = new Object();
			String s = (String) o; // 다운캐스팅이 정상적으로 되지않아 예외발생
			
			System.out.println("문장2");
			
			System.out.println("문장3");
		} catch (Exception e){ // catch는 예외가 있을 때만 실행
			System.out.println("catch 블록 안");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally { // 예외가 발생하든 안하든 위 실행이 끝나면 항상 실행함
			System.out.println("finally 블록 안");
		}
		
		System.out.println("정상 종료");
		
		
	}
}
