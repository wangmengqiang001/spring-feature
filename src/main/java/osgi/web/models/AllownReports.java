package osgi.web.models;

import java.io.Serializable;

public class AllownReports implements Serializable{
	
	private int userid;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getAllown() {
		return allown;
	}
	public void setAllown(int allown) {
		this.allown = allown;
	}
	private int productid;
	private int allown;
	public AllownReports(int userid, int productid) {
		super();
		this.userid = userid;
		this.productid = productid;
		allown = 1;
	}
	public AllownReports() {
		super();
	}
	

}
