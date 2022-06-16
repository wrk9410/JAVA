class MyClass {
	public static int num;
	
	public int fields = 10000;
	
	static {
		System.out.println("테스트테스트");
//		static이기에 인스턴스화 없이 먼저 실행됨
		MyClass2.hello();
	}
}

class MyClass2 {
	static void hello() {
/*static*/System.out.println(MyClass.num);
/*공간이없어서 불러와지지 않음*/System.out.println(MyClass.fields);
/*객체*/System.out.println(new MyClass().fields);
	}
}

public class Test {

	public static void main(String[] args) {
		System.out.println("시작~~~~~~~~~");
		MyClass2.hello();

	}

}
