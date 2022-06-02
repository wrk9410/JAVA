import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	int diceFace;
	int userGuess;
	
	private void rollDice()
	{
		Random random = new Random();
		// diceFace = (int)(Math.random() * 6) + 1;
		// Math.random 0부터 1의 미만의 실수를 만들어주는 것
		// 곱하는 수에 따라서 1의 자리수 
		diceFace = random.nextInt(6) + 1;
	}
	
	private int getUserInput(String prompt)
	{
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
		/*1.println을 출력하겠다.
		  2.Scanner 생성 후 s라는 변수에 값을 저장하겠다.
		  3.s에 저장된 nextInt를 반환하겠다.
		 * */
	}
	
	private void checkUserGuess()
	{
		if ( diceFace == userGuess ) {
			System.out.println("맞았습니다.");
		}
		else {
			System.out.println("틀렸습니다.");
		}
	}
	
	public void startPlaying()
	{	//반복을 하고싶을 경우 해당 메소드 안에서 반복 설정
		userGuess = getUserInput("예상값을 입력하시오: ");
		rollDice();
		checkUserGuess();
	}
}
