// 1번
// 책 클래스 (class Book)
// 필드(상태) : 제목, 저자
// 메소드(기능) : 제목과 저자를 콘솔에 출력 가능


public class Book {
	
	//필드
	String title = "";
	String author = "";
	
	//메소드
	public void printAll() { // 객체의 표현은 static과 연관이 없음
		System.out.printf("제목: %s\n저자: %s",title, author); //println은 1개만 출력 가능
	}
	
	/*public static void main(String[] args) {
		//인스턴스화
		Book s = new Book();
		
		s.title = "PowerJAVA";
		s.author = "천인국";
		
		s.printAll();		
	}*/
	
	
	
	
	
}