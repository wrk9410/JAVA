// 두 수 44와 72의 + - * / 각각의 연산결과를 출력해보세요.

// 공유폴더 기초상담_파일.hwp 작성 후 카톡이나 줌 등으로 개인 전송해주세요.

//JDK, JRE 설치 과정과 환경 변수를 설정했던 과정을 문서로 작성 후 공유폴더에 Your Code 폴더에 넣어주세요.

//

public class Arithmetic {
    public static void main(String[] args) {

	int x = 44;
	int y = 72;
	int sum1 = x + y;
	int sum2 = x - y;
	int sum3 = x / y;
	int sum4 = x * y;
	
	System.out.println(x+" + "+y+" = "+sum1);
	System.out.println(x+" - "+y+" = "+sum2);
	System.out.println(x+" / "+y+" = "+sum3);
	System.out.println(x+" * "+y+" = "+sum4);
	
    }
}