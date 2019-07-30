package osgi.web.beans;

public class AuditOperation {
	
	public AuditOperation(String account, String name, String role,
			String address, String oper_time, String oper_type, String operate) {
		super();
		this.account = account;
		this.name = name;
		this.role = role;
		this.address = address;
		this.oper_time = oper_time;
		this.oper_type = oper_type;
		this.operate = operate;
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOper_time() {
		return oper_time;
	}
	public void setOper_time(String oper_time) {
		this.oper_time = oper_time;
	}
	public String getOper_type() {
		return oper_type;
	}
	public void setOper_type(String oper_type) {
		this.oper_type = oper_type;
	}
	public String getOperate() {
		return operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}
	private String account;
	private String name;
	private String role;
	private String address;
	private String oper_time;
	private String oper_type;
	private String operate;

}
