// package
import first.InPackageClass;
import first.second.AnotherClass;
//import를 하지않을 경우 같은 package 안에서 우선적으로 확인하여 없기에 컴파일에러남

public class Main {
	public static void main(String[] args) {
		InPackageClass test = new InPackageClass(); //import로 호출하여 에러 사라짐
		
		AnotherClass test2 = new AnotherClass(); //import로 호출하여 에러 사라짐
		test2.number = 10;
//		test2.mySecret = 22; // private여서 접근 불가
		test2.test = 33;
		// public도 private도 안적혀있지만 default(또는 package)접근자이기에 동일 package가 아닐 경우접근 불가
		
	}
}
