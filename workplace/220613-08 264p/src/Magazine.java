public class Magazine extends Book {
	private String date;
	
	public Magazine(String name
			, int page
			, String athor
			, String date) {
		super(name,page,athor);
		this.date = date;
	}
	
	@Override
	public String toString() {
		return super.toString()+", 발매일: "+date;
	}
	
	
	
}
