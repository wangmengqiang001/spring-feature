package osgi.web.beans;

public class ApproveInfo {
	
	@Override
	public String toString() {
		return "ApproveInfo [id=" + id + ", approver=" + approver
				+ ", approveRes=" + approveRes + ", memo=" + memo + "]";
	}
	public ApproveInfo(){};
	
	String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getApprover() {
		return approver;
	}
	public void setApprover(String approver) {
		this.approver = approver;
	}
	public String getApproveRes() {
		return approveRes;
	}
	public void setApproveRes(String approveRes) {
		this.approveRes = approveRes;
	}
	public String getTmApprove() {
		return tmApprove;
	}
	public void setTmApprove(String tmApprove) {
		this.tmApprove = tmApprove;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	String approver;
	String approveRes;
	String memo;
	String tmApprove;
	
	
	
}
