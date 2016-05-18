package com.crec.bean;

import java.util.Date;

public class MDMUNITS {
	
	private  String ID;
	private String UNITCD;//代码
	private String UNITNM;//名称
	private String SSNM;//缩写
	private String NOTE;//备注
	private String RECSTATUS;//状态
	private String STOPFLAG;//停用标识【新增字段】
	private Date RECCREATETIME;//创建时间
	private Date RECUPDATETIME;//最后修改时间
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getUNITCD() {
		return UNITCD;
	}
	public void setUNITCD(String uNITCD) {
		UNITCD = uNITCD;
	}
	public String getUNITNM() {
		return UNITNM;
	}
	public void setUNITNM(String uNITNM) {
		UNITNM = uNITNM;
	}
	public String getSSNM() {
		return SSNM;
	}
	public void setSSNM(String sSNM) {
		SSNM = sSNM;
	}
	public String getNOTE() {
		return NOTE;
	}
	public void setNOTE(String nOTE) {
		NOTE = nOTE;
	}
	public String getRECSTATUS() {
		return RECSTATUS;
	}
	public void setRECSTATUS(String rECSTATUS) {
		RECSTATUS = rECSTATUS;
	}
	public String getSTOPFLAG() {
		return STOPFLAG;
	}
	public void setSTOPFLAG(String sTOPFLAG) {
		STOPFLAG = sTOPFLAG;
	}
	public Date getRECCREATETIME() {
		return RECCREATETIME;
	}
	public void setRECCREATETIME(Date rECCREATETIME) {
		RECCREATETIME = rECCREATETIME;
	}
	public Date getRECUPDATETIME() {
		return RECUPDATETIME;
	}
	public void setRECUPDATETIME(Date rECUPDATETIME) {
		RECUPDATETIME = rECUPDATETIME;
	}
	
	
}
