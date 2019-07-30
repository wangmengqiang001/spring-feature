package osgi.web.beans;

public class Account {
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	@Override
//	public String toString() {
//		return "Account [id=" + id + ", account=" + account + ", name=" + name
//				+ ", role=" + role + ", phone=" + phone + ", email=" + email
//				+ "]";
//	}
	
	public Account()
	{
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [id=").append(id).append(", account=")
				.append(account).append(", name=").append(name)
				.append(", role=").append(role).append(", phone=")
				.append(phone).append(", email=").append(email)
				.append(", depart=").append(depart).append(", securityLevel=")
				.append(securityLevel).append("]");
		return builder.toString();
	}
	//在构造方法中增加depart字典，并修改AccountService类
	public Account(int id, String account, String name, String role,String dep,
			String phone, String email) {
		super();
		this.id = id;
		this.account = account;
		this.name = name;
		this.role = role;
		this.phone = phone;
		this.email = email;
		this.depart=dep;
	}
	public Account(int id, String account, String name, String role,
			String phone, String email, String depart, int securityLevel) {
		super();
		this.id = id;
		this.account = account;
		this.name = name;
		this.role = role;
		this.phone = phone;
		this.email = email;
		this.depart = depart;
		this.securityLevel = securityLevel;
	}
	private String account;
	private String name;
	private String role; //管理员(admin)，审计员(audit), 普通用户(user)
	private String phone;
	private String email;
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	private String depart; //部门
	private int securityLevel=0;
	public int getSecurityLevel() {
		return securityLevel;
	}
	public void setSecurityLevel(int securityLevel) {
		this.securityLevel = securityLevel;
	}
	

}
