package first.second; // package(first) 안의 package(second)

public class AnotherClass {
	public int number; // 전체 접근 가능
	private int mySecret; // getter/setter로 접근가능
	int test; // 동일 package에서만 접근가능
/*test필드: default/package access modifier: 
	 외부에서 접근은 가능하지만 같은 package에 있을 때만 접근 가능*/
}
