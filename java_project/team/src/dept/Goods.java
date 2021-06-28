package dept;

class Goods {
	int icode;
	String iname;
	int iprice;
	
	public int getIcode() {
		return icode;
	}
	public String getIname() {
		return iname;
	}
	public int getIprice() {
		return iprice;
	}
	Goods(int icode, String iname, int iprice) {
		this.icode = icode;
		this.iname = iname;
		this.iprice = iprice;
	}
	
	//리스트 출력할 메서드
	public String toString() {
		return getIcode() + "\t" + getIname() + "\t" + getIprice();
	}
}
