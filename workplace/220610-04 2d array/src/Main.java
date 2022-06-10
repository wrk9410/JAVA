
public class Main {

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 8, 10 };
		int[] arr2 = { 3, 6, 9, 12, 15, 18, 21 };
		int[] arr3 = { 4, 8, 12, 16, 20 };
		// 이차원 배열: 배열을 가지는 배열
		
		int[][] arr2d = new int[3][5]; // 5개의 값을 담을 수 있는 3개의 배열을 담는 배열, type[행, 세로줄][열, 가로줄]
		// 2차원 배열은 원소개수가 동일한 배열들을 담아두는 배열이기에 크기가 다를 경우 가독성이 떨어짐(실행은 가능)
		// 2차원 배열은 열(가로)의 크기를 적지않아도, 크기가 서로 달라도 참조는 가능하나 문법상 맞지않다고 함
		
		arr2d[0] = arr1;
		arr2d[1] = arr2;
		arr2d[2] = arr3;
		
		for (int j = 0; j < arr2d.length;j++) {
			for(int i = 0; i <arr2d[j].length; i++) {
				System.out.println(arr2d[j][i]);
			}
		}
		
//		int[][] arrAnother = { {2, 4, 6}, {3, 6, 9}, {4, 8, 12} };
//		for(int i = 0; i < arrAnother[0].length; i++) {
//			System.out.println(arrAnother[0][i]);
//		}
	
	}

}
