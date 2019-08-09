package osgi.web.models;

public class AccountInfo {

	public AccountInfo(long id, String account, String password) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
	}

	public AccountInfo()
	{
		
	}


	@Override
	public String toString() {
		return "AccountInfo [id=" + id + ", account=" + account + ", password="
				+ password + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private long id;
	private String account;
	
	private String password;

}
