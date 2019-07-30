package osgi.web.beans;

public class ReportInfo {
	public ReportInfo(){
		
	}
	public ReportInfo(int id, String name, String memo, int total,
			String author, String saveon,String status) {
		super();
		this.id = id;
		this.name = name;
		this.memo = memo;
		this.total = total;
		this.author = author;
		this.saveon = saveon;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	private int id; //UID
    public int getLeftnum() {
		return leftnum;
	}
	public void setLeftnum(int leftnum) {
		this.leftnum = leftnum;
	}
	public int getSecuritylevel() {
		return securitylevel;
	}
	public void setSecuritylevel(int securitylevel) {
		this.securitylevel = securitylevel;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	private String name; //name or title
    private int total;   //total number    
    private int leftnum;
    private int securitylevel;
    private String memo; //description
   
    private String saveon;  //date-time to save
    private String status; //status
    private String author; //author 的名称
    public String getAuthor_userid() {
		return author_userid;
	}
	public void setAuthor_userid(String author_userid) {
		this.author_userid = author_userid;
	}
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	private String author_userid; //author的账号名称
    private int author_id;	//author在账号表中的主键id
    private String depart; //author's department
    
    public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSaveon() {
		return saveon;
	}
	public void setSaveon(String saveon) {
		this.saveon = saveon;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "ReportInfo [id=" + id + ", name=" + name + ", total=" + total
				+ ", leftnum=" + leftnum + ", securitylevel=" + securitylevel
				+ ", memo=" + memo + ", saveon=" + saveon + ", status="
				+ status + ", author=" + author + ", depart=" + depart + "]";
	}
	
	

	
    

}
