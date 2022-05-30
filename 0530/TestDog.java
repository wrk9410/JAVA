public class TestDog {
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		// public Dog()
		// 이름, 종, 나이 모두 setter 설정 가능
		d.setName("림트리버");
		d.setBreed("리트리버");
		d.setAge(6);
		
		System.out.println(d.getName());
		System.out.println(d.getBreed());
		System.out.println(d.getAge());
		
		
		// public Dog(String n, String s,int a)
		// 이름, 종, 나이 모두 초기화하여야 사용가능
		Dog d2 = new Dog("망아지","포메라니안",5);
		
		System.out.println(d2.getName());
		System.out.println(d2.getBreed());
		System.out.println(d2.getAge());
		
		
		// public Dog(String n, String s)
		//이름, 종 설정 가능 , 나이 1살 고정
		Dog d3 = new Dog("루이","시베리안 허스키");
		
		System.out.println(d3.getName());
		System.out.println(d3.getBreed());
		System.out.println(d3.getAge());
		
		
		
	}
}