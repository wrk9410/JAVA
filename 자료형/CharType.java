public class CharType {
	public static void main(String[] args) {
		//캐릭터 타입? : 글자 하나만 가져옴, ""따옴표와 다르게 ''따옴표로 사용
		// java는 유니코드를 사용하여 한글도 표현가능
		char a = 'a';
		char b = 'b';
		char ga = '가';
		char num1 = '1';
		
		char what = 65;
		
		// System.out.println(what + a); // 숫자로 취급하기에 숫자로 print 됨
		
		char linefeed = '\n';
		char tab = '\t';
		System.out.print("q\nw\ne\nr\n");
		System.out.print(tab + "다음줄인가??\n");
		
		System.out.println('\'');
		System.out.println("\"");
		System.out.println("\\");
		// ", ', \ 등을 문자로 하기 위해서는 \가 앞에 붙어야 사용가능
		
		
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(ga);
		// System.out.println(num1);
		
	}
}