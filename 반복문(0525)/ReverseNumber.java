// (1) (2) (3) (4) (5)
// (5) (4) (3) (2) (1)
// (1) (2) (3) (4) (5)
// (5) (4) (3) (2) (1)
// (1) (2) (3) (4) (5)

public class ReverseNumber {
	public static void main(String[] args) {
		
		/*for (int i = 0; i < 5; i++) {
			for (int j = 5; j > 0; j--) {
				System.out.printf("(%d)",j);
				for (int k = 1; k < 6; k++) {
					System.out.printf("(%d)",k);
				}
				System.out.println();
			}
			System.out.println();
		}*/

		//쌤 코드
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0){
				//System.out.println("(1) (2) (3) (4) (5)");
				//System.out.println("(5) (4) (3) (2) (1)");
				for (int j = 1; j <= 5; j++) {
					System.out.print("("+j+") ");
				}
				System.out.println();
			} else{
				for (int j = 5; j > 0; j--) {
					System.out.print("("+j+") ");
				}
				System.out.println();
			}
		}
	}
}