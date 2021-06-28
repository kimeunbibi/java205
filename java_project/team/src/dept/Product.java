package dept;

public class Product {
	private int icode;
	private String iname;
	private int iprice;
	
	public Product(int icode, String iname, int iprice) {
		this.icode = icode;
		this.iname = iname;
		this.iprice = iprice;
	}
	public int getIcode() {
		return icode;
	}
	public void setIcode(int icode) {
		this.icode = icode;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getIprice() {
		return iprice;
	}
	public void setIprice(int iprice) {
		this.iprice = iprice;
	}
	
	@Override
	public String toString() {
		return "Menu [icode=" + icode + ", iname=" + iname + ", iprice=" + iprice + "]";
	}
	
}
