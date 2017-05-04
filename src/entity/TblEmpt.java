package entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TblEmpt entity. @author MyEclipse Persistence Tools
 */

public class TblEmpt implements java.io.Serializable {


	private Integer eid;
	private String ename;
	private Timestamp etime;
	private String econdition;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Timestamp getEtime() {
		return etime;
	}
	public void setEtime(Timestamp etime) {
		this.etime = etime;
	}
	public String getEcondition() {
		return econdition;
	}
	public void setEcondition(String econdition) {
		this.econdition = econdition;
	}
	public TblEmpt(Integer eid, String ename, Timestamp etime, String econdition) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.etime = etime;
		this.econdition = econdition;
	}
	public TblEmpt() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TblEmpt [eid=" + eid + ", ename=" + ename + ", etime=" + etime
				+ ", econdition=" + econdition + "]";
	}
	

}