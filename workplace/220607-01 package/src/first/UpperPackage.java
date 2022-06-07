package first;

import first.second.AnotherClass;

public class UpperPackage {
	public static void main(String[] args) {
		AnotherClass a = new AnotherClass();
		a.number = 11;
//		a.mySecret = 22; private으로 접근 불가
//		a.test = 33; // 동일 package아니기에 접근 불가
	}
}