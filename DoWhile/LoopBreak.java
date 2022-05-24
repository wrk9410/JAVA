public class LoopBreak {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break; // 반복문을 즉시 종료하는 것
			}
			System.out.println(i);
		}
		System.out.println("프로그램 종료");
	
		for (int i = 10; i < 20; i++) {
		if (i % 10 == 5) {
			continue; // 반복문을 종료시키진 않지만, 현재 단계를 건너뜀, 건너뛰고 다시 증감식으로 진입
		}
			System.out.println(i);
		
		int i = 20;
		while (i < 30) {
			if (i == 25) {
				continue;
			}
		if (i != 25) {
			System.out.println(i);
		}
			i++;
		System.out.println("프로그램 종료");
	}
}