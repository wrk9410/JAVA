public class Loop3 {
	public static void main(String[] args){
		// 0 부터 100 사이의 수 중 3의 배수 또는 7의 배수를 출력해보세요
		// 3 6 7 9 12 14 15
		
		/*int i = 0;
		
		while (i <= 100) {
			if (i % 3 == 0 || i % 7 == 0){
				System.out.println(i);
			}
			i++;
		}*/
		
		// 0부터 100 사이의 수 중 일의 자리 수가 3, 6, 9 일때만 출력.
		// 3 6 9 13 16 19 23 26 29 ...
		int i = 0;
		while (i <= 100) {
			if ( i % 10 == 3 || i % 10 == 6 || i % 10 == 9){
				System.out.println(i);
			}
			i++;
		}
	}
}