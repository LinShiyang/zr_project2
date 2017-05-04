package entity;

import java.sql.Timestamp;

/**
 * TblChat entity. @author MyEclipse Persistence Tools
 */

public class TblChat implements java.io.Serializable {

	// Fields

	// Constructors

	/** default constructor */

	private Integer tNum;
	private Integer tSendID;
	private Integer tReceivedID;
	private Timestamp tDateTime;
	private String tMessage;

	public TblChat() {
		// TODO Auto-generated constructor stub
	}
	
	public TblChat(Integer tNum, Integer tSendID, Integer tReceivedID, Timestamp tDateTime, String tMessage) {
		super();
		this.tNum = tNum;
		this.tSendID = tSendID;
		this.tReceivedID = tReceivedID;
		this.tDateTime = tDateTime;
		this.tMessage = tMessage;
	}

	public Integer gettNum() {
		return tNum;
	}

	public void settNum(Integer tNum) {
		this.tNum = tNum;
	}

	public Integer gettSendID() {
		return tSendID;
	}

	public void settSendID(Integer tSendID) {
		this.tSendID = tSendID;
	}

	public Integer gettReceivedID() {
		return tReceivedID;
	}

	public void settReceivedID(Integer tReceivedID) {
		this.tReceivedID = tReceivedID;
	}

	public Timestamp gettDateTime() {
		return tDateTime;
	}

	public void settDateTime(Timestamp tDateTime) {
		this.tDateTime = tDateTime;
	}



	public String gettMessage() {
		return tMessage;
	}

	public void settMessage(String tMessage) {
		this.tMessage = tMessage;
	}
	
	@Override
	public String toString() {
		return ""+tDateTime+"ID：" + tSendID + "对 ID："+tReceivedID +"说："+ tMessage+"";
	}

}