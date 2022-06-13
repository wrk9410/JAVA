public class SmartPhone extends Phone {
	private String software;
	private int ver, memory;
	private boolean camera,bluetooth;
	
	public SmartPhone(String company, int price, 
			int comtype, String software,int ver,int memory
			, boolean camera,boolean bluetooth) {
		super(company,price,comtype);
		this.software = software;
		this.ver = ver;
		this.memory = memory;
		this.camera = camera;
		this.bluetooth = bluetooth;
	}

	public String getSoftware() {
		return software;
	}

	public void setSoftware(String software) {
		this.software = software;
	}

	public int getVer() {
		return ver;
	}

	public void setVer(int ver) {
		this.ver = ver;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
	
	public String toString() {
		return super.toString()+", 운영체제: "+software+
				", 버전: "+ver+"0.ver, 메모리 크기: "+memory+
				"GB, 카메라: "+camera+", 블루투스: "+bluetooth;
	}
	
}
