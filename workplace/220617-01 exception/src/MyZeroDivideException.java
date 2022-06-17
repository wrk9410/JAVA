import java.time.LocalTime;
import java.util.Scanner;

// 상속 사용하면 나만사용 가능한 예외 생성 가능
public class MyZeroDivideException extends RuntimeException {
	public MyZeroDivideException(String message) {
		super(message + ", "+ LocalTime.now() + "에 발생하였음");
	}
	
}
