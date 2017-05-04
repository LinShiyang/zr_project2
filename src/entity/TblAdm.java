package entity;

/**
 * TblAdm entity. @author MyEclipse Persistence Tools
 */

public class TblAdm implements java.io.Serializable {

	

	@Override
	public String toString() {
		return "TblAdm [aid=" + aid + ", aname=" + aname + ", apassword="
				+ apassword + "]";
	}

	private Integer aid;
	private String aname;
	private String apassword;



	/** default constructor */
	public TblAdm() {
	}

	/** full constructor */
	public TblAdm(String aname, String apassword) {
		this.aname = aname;
		this.apassword = apassword;
	}

	// Property accessors

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getApassword() {
		return this.apassword;
	}

	public void setApassword(String apassword) {
		this.apassword = apassword;
	}
	
}