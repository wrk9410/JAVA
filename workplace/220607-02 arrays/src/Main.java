public class Main {
	public static void main(String[] args) {
		int[] aBox; // 정수형 배열 변수 선언.
		aBox = new int[4]; // 길이가 4인 배열 초기화
		
		System.out.println("배열의 길이값: "+aBox.length);
//		aBox.length = 10; // final(상수)하게 되어 있어 길이 변경 불가
		
		aBox[0] = 56; // aBox(배열의 0번 index)에 56이라는 값을 넣겠다.
		aBox[1] = 57;
		aBox[2] = 58;
		aBox[3] = 59;
		
		System.out.println(aBox[0]);
		System.out.println(aBox[1]);
		System.out.println(aBox[2]);
		System.out.println(aBox[3]);
	}

}
