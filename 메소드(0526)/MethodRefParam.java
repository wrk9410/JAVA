public class MethodRefParam {
	public static String concat(String left, String right) { //String은 참조형 메소드 
		return left + right;
	}
	
	public static void main(String[] args) {
		String h = "Hello"; // 값이 있는 게 아니라 참조를 가지고 있음, concat의 left를 참조한 형태
		
		/*h라는 박스가 있는데 h는 "Hello"를 참조하여야 되지만, 어떠한 위치가 있고(엑셀의 G3같은) 그 위치를
		찾아갈 수 있게해주는 것 그렇기에 h = G3이고 G3에는 "Hello"가 있는 것이다.*/
		
		String w = "World";
		String result = concat(h, w);
		
		System.out.println(result);
	}
}