public class Loop2 {
	public static void main(String[] args) {
		// 1 ~ 10000까지 출력하세요.
		/*int i = 0;
		while (i <= 10000) {
			i++;
			System.out.println(i);
		}*/
		
		// 20 ~ 29까지 출력하기
		/*int i = 0;
		int j = 20;
		while ( i <= 9){
			System.out.println(j);
			j++;
			i++;
		}*/
		
		// 10 9 8 ~~~ 0 까지
		/*int i = 10;
		
		while (i >= 0) {
			System.out.println(i);
			i--;
		}*/
		
		// 3의 배수를 출력해보세요.무한 히
		/*int i= 1;
		while (true) {
			System.out.println(i * 3);
			i++;
		}*/
		
		// 100보다 작은 3의 배수를 출력해보세요.
		/*int l = 0;
		while (l < 100) {
			System.out.println(l);
			l += 3;
		}*/
		
		/*int a = 0;
		
		while (a < 8) {
			System.out.printf("☆\n★\n");
			a++;
		}*/
		
		int q = 0;
		while ( q < 8 ) {
			System.out.println( (q % 2 == 0) ? "☆" : "★"); // 홀수, 짝수마다 다른 별 나오게 조건
			q++;
		}
		
	}
}