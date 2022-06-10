import java.util.Arrays;

public class Main2 {
	
	public static void main(String[] args) {
		// 2 ~ 5의 제곱수들을 각 원소로 가지는 2차원 배열 선언 초기화 후에 모든 원소 출력해보기
		// 2 4 8 16 32 ...
		// 3 9 27 81 ...
		// 4 16 64 ...
		// 5 25 125 ...
		
		/*int[][] arr2d = new int[4][5];
		
		int num = 2;
		
		for (int i = 0; i < arr2d.length; i++) {
			int num2 = num;
			arr2d[i][0] = num;
			for (int j = 1; j < arr2d[i].length; j++) {
				num2 = num2*num;
				arr2d[i][j] = num2;
			}
			num++;
		}*/
		int[][] arr = { {2, 4, 8, 16, 32}
					, {3, 9, 27, 81, 243}
					, {4, 16, 64, 256, 1024}
					, {5, 25, 125, 625, 3125} };
		
		
		int[][] arr2 = new int[4][5];
		for (int i = 0; i < arr2.length; i++) {
			int n = 1;
			for(int j = 0; j < arr2[i].length; j++) {
				n *= 2 + i;
				arr2[i][j] = n;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(arr2)); // 2차원 배열도 deepToString 사용 시 배열 안의 원소 확인 가능
		
		System.out.println(arr == arr2);
		System.out.println(arr.equals(arr2));
		
	}
}
