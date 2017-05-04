package entity;

/**
 * TblOnline entity. @author MyEclipse Persistence Tools
 */

public class TblOnline implements java.io.Serializable {

	// Fields

	private Integer eId;
	private String eName;
	private String eIp;
	private String ePort;
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteIp() {
		return eIp;
	}
	public void seteIp(String eIp) {
		this.eIp = eIp;
	}
	public String getePort() {
		return ePort;
	}
	public void setePort(String ePort) {
		this.ePort = ePort;
	}
	public TblOnline(Integer eId, String eName, String eIp, String ePort) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eIp = eIp;
		this.ePort = ePort;
	}
	public TblOnline() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TblOnline [eId=" + eId + ", eName=" + eName + ", eIp=" + eIp
				+ ", ePort=" + ePort + "]";
	}

	

}