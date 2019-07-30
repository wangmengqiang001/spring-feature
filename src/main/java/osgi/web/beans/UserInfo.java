package osgi.web.beans;

public class UserInfo {
	private String account;
	@Override
	public String toString() {
		return "UserInfo [account=" + account + ", password=" + password + "]";
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
	private String password;
}
