package entity;

import java.util.Date;

/**
 * TblEmp entity. @author MyEclipse Persistence Tools
 */

public class TblEmp implements java.io.Serializable {


	private Integer eid;
	private String enation;
	private String epassword;
	private String esex;
	private String eidnumber;
	private String etel;
	private Date etime;
	private Date ebirthDay;
	private String egrade;
	private String eeducation;
	private String eaddress;
	private String epoliticalStatus;
	private Double esalary;
	private String eemail;
	private String eapartment;
	private String ename;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEnation() {
		return enation;
	}
	public void setEnation(String enation) {
		this.enation = enation;
	}
	public String getEpassword() {
		return epassword;
	}
	public void setEpassword(String epassword) {
		this.epassword = epassword;
	}
	public String getEsex() {
		return esex;
	}
	public void setEsex(String esex) {
		this.esex = esex;
	}
	public String getEidnumber() {
		return eidnumber;
	}
	public void setEidnumber(String eidnumber) {
		this.eidnumber = eidnumber;
	}
	public String getEtel() {
		return etel;
	}
	public void setEtel(String etel) {
		this.etel = etel;
	}
	public Date getEtime() {
		return etime;
	}
	public void setEtime(Date etime) {
		this.etime = etime;
	}
	public Date getEbirthDay() {
		return ebirthDay;
	}
	public void setEbirthDay(Date ebirthDay) {
		this.ebirthDay = ebirthDay;
	}
	public String getEgrade() {
		return egrade;
	}
	public void setEgrade(String egrade) {
		this.egrade = egrade;
	}
	public String getEeducation() {
		return eeducation;
	}
	public void setEeducation(String eeducation) {
		this.eeducation = eeducation;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public String getEpoliticalStatus() {
		return epoliticalStatus;
	}
	public void setEpoliticalStatus(String epoliticalStatus) {
		this.epoliticalStatus = epoliticalStatus;
	}
	public Double getEsalary() {
		return esalary;
	}
	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public String getEapartment() {
		return eapartment;
	}
	public void setEapartment(String eapartment) {
		this.eapartment = eapartment;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public TblEmp(Integer eid, String enation, String epassword, String esex,
			String eidnumber, String etel, Date etime, Date ebirthDay,
			String egrade, String eeducation, String eaddress,
			String epoliticalStatus, Double esalary, String eemail,
			String eapartment, String ename) {
		super();
		this.eid = eid;
		this.enation = enation;
		this.epassword = epassword;
		this.esex = esex;
		this.eidnumber = eidnumber;
		this.etel = etel;
		this.etime = etime;
		this.ebirthDay = ebirthDay;
		this.egrade = egrade;
		this.eeducation = eeducation;
		this.eaddress = eaddress;
		this.epoliticalStatus = epoliticalStatus;
		this.esalary = esalary;
		this.eemail = eemail;
		this.eapartment = eapartment;
		this.ename = ename;
	}
	public TblEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TblEmp [eid=" + eid + ", enation=" + enation + ", epassword="
				+ epassword + ", esex=" + esex + ", eidnumber=" + eidnumber
				+ ", etel=" + etel + ", etime=" + etime + ", ebirthDay="
				+ ebirthDay + ", egrade=" + egrade + ", eeducation="
				+ eeducation + ", eaddress=" + eaddress + ", epoliticalStatus="
				+ epoliticalStatus + ", esalary=" + esalary + ", eemail="
				+ eemail + ", eapartment=" + eapartment + ", ename=" + ename
				+ "]";
	}



}