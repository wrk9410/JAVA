public class Main2 {
	public static void main(String[] args) {
		// 길이가 5인 정수(int)형 배열을 선언 초기화 하고
		// 모든 원소(element)의 값을 100으로 설정해보세요. 원소: 배열의 1개 1개마다의 칸에 들어가있는 값
		int[] myBox = new int[5]; // int[] : [] 안에 무언가를 적을 경우 type이기에 컴파일에러
		
		for (int i = 0; i < myBox.length ; i++) {
			myBox[i] = 100;
		}		
//		myBox[5] = 100;
		
		for (int i = 0; i < myBox.length; i++) {
			System.out.println(i + "번째 index의 원소값: "+myBox[i]);
		}
		
		System.out.println("프로그램 정상 종료");
	}
}
