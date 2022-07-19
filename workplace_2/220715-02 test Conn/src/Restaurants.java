
public class Restaurants {
	private int id;
	private String name, phoneNumber, address;

	public Restaurants(int id, String name, String phoneNumber, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(String number) {
		this.phoneNumber = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Restaurants [Id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + "]\n";
	}

}
