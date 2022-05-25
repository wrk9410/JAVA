// 구구단
// 2단 ~ 9단까지 전체 출력
// 반복문을 반복문으로 씌워서 실행

public class Gugudan {
	public static void main(String[] args) {
		for (int j = 2; j <= 9; j++) {
			for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n",j,i,j*i);
			}
			System.out.println();
		}
	}
}