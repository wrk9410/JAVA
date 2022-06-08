import java.util.*;
public class Main6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		
		int i = 0;
		
		while(true) {
			int n = scan.nextInt();
			if(n < 0) {
				break;
			}
			arr[i] = n;
			
			i++;
			
			if (i == 5) {
				i = 0;
			}
		}
		scan.close();
		for(i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
	}

}
