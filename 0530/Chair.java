// 의자 클래스
// 제조사
// 생산일자
// 가격
// 모델명

// 초기화 할 수 있는 생성자

// main -> 작성한 생성자를 통해 원하는 필드값으로 초기화 해보세요.\

public class Chair {
	
	String production, model;
	int date, price;
	
	public Chair() {
		
	}
	
	public Chair(String p, int d, int pr,String m) {
		production = p;
		date = d;
		price = pr;
		model = model;
	}
	
	void printAll() {
		System.out.println(production);
		System.out.println(date);
		System.out.println(price);
		System.out.println(model);
	}
	
	public static void main(String[] args) {
		Chair c = new Chair("이수의자제작",2022,50000,"하얼빈");
		
		// System.out.printf("%s 사\n%d년\n%d원\n%s",c.company,c.date,c.price,c.name1);
		
		Chair c2 = new Chair("허먼밀러",2019,2120000,"뉴 에어론");
		
		// System.out.printf("%s 사\n%d년\n%d원\n%s",c2.company,c2.date,c2.price,c2.name1);
		
		c.printAll();
		c2.printAll();
		
	}
}