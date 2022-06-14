// 회원 관리 프로그램
// 회원을 콘솔입력으로 등록할 수 있게. 최대 10명
// 중복 등록이 되면 안됨(이름, 키, 몸무게가 동일하면 중복입니다.)
// 기준에 따라 집계를 해서 목록을 보여줘야합니다.

// 회원
// 이름
// 키
// 몸무게

// BMI 지수
// BMI = 몸무게(Kg) / 키^2제곱(m)

// 고도 비만 : 35 이상
// 중도비만 : 30 - 35 미만
// 경도비만 : 25 이상 - 30 미만
// 과체중 : 23 이상 - 25 미만
// 정상 : 18.5 이상 - 23 미만
// 저체중 : 18.5 미만

public class Main {
	public static void main(String[] args) {
		
		Member m1 = new Member("길대수",182,69.5);
		Member m2 = new Member("길대수",175,64.2);
		Member m3 = new Member("길대수",175,64.2);
		
		System.out.println(m3.equals(m2));
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		
		
		
		
	}
}
