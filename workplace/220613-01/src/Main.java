// 학생
// 이름
// 나이
// 점수

// 이름 알려주기
// 점수 알려주기



// 작가
// 이름
// 나이
// 작품 목록

//이름 알려주기
// 작품 목록 알려주기

public class Main {
	public static void main(String[] args) {
		// 상속
		// 사자는 동물이다, 개는 동물이다, 관리자는 직원이다 : is a 관계
		// 도서관은 책이 있다 : has a 관계 (책은 도서관이다X이기에)
		
		Person p = new Person("사람이름", 22);
		// 사람의 이름과 나이를 가져오기에 학생에서 입력한 파라미터를 덮어씌어지는 것이 아닌 특징(이름과 나이를 받을 수 있는 field가 만들어진 것)
		
		Student s = new Student("학생이름", 17, 90);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getScore());
		
//		p.getScore(); 사람 class에는 존재하지 않기에 호출도 되지않음
		
		Author a = new Author("작가이름",30, "반지의길");
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(a.getBookList());
		
		// Penson p와 Student s와 Author a가 각각 생성이 된 것이고 서로 참조를 원할 경우 기존 참조에 맞게 설정을 도와주면 됨
	}
}













