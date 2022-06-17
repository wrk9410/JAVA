public class Main2 {
	// 여러개의 예외 발생 시 try catch
	public static void main(String[] args) {
		String s = null;
		try {
			String local = "지연변수";
			
			int[] arr = new int[0];
			arr[1] = 10;
			
			int div = 10 / 0;

			s.equals("asdf");
			
			System.out.println("실행되나??");
		} catch (NullPointerException e) { // catch (잡고싶은 오류 <참조변수>)
//			System.out.println(local); try의 지역변수이기에 접근 불가
			System.out.println("널 포인트 익셉션 처리");
		} catch (ArithmeticException e) {
			System.out.println("수 익셉션 처리");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외 처리");
		} catch (Exception e) { // 상위 class가 위에 적혀있으면 아래의 catch 필요 없어서 컴파일 에러 
			System.out.println("모든 예외는 여기서 잡힙니다.");
		}
		// 여러 오류를 잡고 싶을 경우 잡고 싶은 오류의 catch문 다수 입력
		
//		System.out.println(local); try의 지역변수이기에 접근 불가
		
		System.out.println("정상 종료");
	}

}
