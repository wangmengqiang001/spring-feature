package osgi.web.beans;

public class ApplyApproval {
	public ApplyApproval(String reportid) {
		super();
		this.reportid = reportid;
	}
	private String reportid;
	public ApplyApproval(){};
	
	public void setReportid(String reportid){this.reportid=reportid;}
	public String getReportid(){return reportid;}
}
