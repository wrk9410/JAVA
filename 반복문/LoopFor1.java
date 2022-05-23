public class LoopFor1 {
	public static void main(String[] args){
		// "반복"이라는 문자열 5번 출력 하기
		/*for (int i = 0; true; i++) { //true or false 2가지의 답만 올 수 있음 | for ( ; ; )비어있어도 동작 가능, 비었을 경우 true
			System.out.println("반복");
		}*/
		
		// System.out.println(i); for문에서 생성된 변수는 for문 밖에서 사용불가
		
		// 1부터 10까지 출력하기 (for)
		/*for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}*/
		
		// 21부터 30까지의 3의 배수 출력하기
		/*for (int k = 21; k <= 30; k++) {
			if (k % 3 == 0){
				System.out.println(k);
			}
		}*/
		/*for (int i = 21; i <= 30; i += 3) {
			System.out.println(i);
		}*/
		
		
		// 30 29 28 ... 20까지 역순 출력
		for (int i = 30; i >= 20; i--) {
			System.out.println(i);
		}
	}
	
}