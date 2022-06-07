package first.second;

public class SamePackage {

	public static void main(String[] args) {
		AnotherClass a = new AnotherClass();
		a.number = 11;
//		a.mySecret = 22; private하여 접근 불가
		a.test = 33; // 동일 package이므로 접근 가능
	}
}
