public class Test {
	public static void main(String[] args) {
		Magazine m = new Magazine("책제목",642,"작성자","2022-06-13");
	
		System.out.println(m.toString());
	
		Melon mel = new Melon(540, 25000, 5,"열대농원");
		
		System.out.println(mel.toString());
	
		SmartPhone p = new SmartPhone("삼성", 1900000, 5,"안드로이드", 8,32,true,true);
		
		System.out.println(p.toString());
		
		Student s = new Student("에휴", 21, "경영", 2, 4);
		
		System.out.println(s.toString());
		
	}

}
