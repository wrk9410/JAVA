import java.time.LocalDate;

interface LeafletHandler {
	String give();
}

// 일수 광고 전단지 제공자
// 전화번호가 포함되어야함

class LoanAD implements LeafletHandler {
	private String phone;
	
	
	public LoanAD(String phone) {
		super();
		this.phone = phone;
	}


	@Override
	public String give() {
		return phone;
	}
}

// 선거 광고 전단지 제공자
// 선거 날짜가 포함되어야함.

class VoteAD implements LeafletHandler {
	private LocalDate day;

	public VoteAD(LocalDate day) {
		super();
		this.day = day;
	}

	public String give() {
		return "투표날짜: " + day.toString();
	}
}

// ----------------
// 광고대행사
// 일수광고/선거광고
class AdCompany {
	private LeafletHandler ad;

	public AdCompany(LeafletHandler ad) {
		super();
		this.ad = ad;
	}
	
	public void consoleAD() {
		System.out.println(ad.give());
	}
}


public class Main {
	public static void main(String[] args) {
		AdCompany company = new AdCompany(LoanAD("010-1111-2222"));
		
		company.consoleAD();
		
//		LeafletHandler h1 = new 일수광고();
//		String 전화번호가포함된일수광고문자열 = h1.give();
//		
//		LeafletHandler h2 new 선거광고();
//		String 선거날짜가포함된광고문자열 = h2.give();
//		
//		광고대행사 p = new 광고대행사(일수광고);
//		p.광고() <<< 일수광고
//		
//		p.set고객(선거광고);
//		p.광고() <<< 선거광고
	}

	private static LeafletHandler LoanAD(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
