/*
1.
*
**
***
****
*****
*/

public class StarTree1 {
	public static void main(String[] args) {
		
		String star1 = "*";
		String star2 = "  0";
		
		for (int i = 0; i < 5; i++) {
			star2 += star1;
			System.out.println(star2);
		}
		
	}
}