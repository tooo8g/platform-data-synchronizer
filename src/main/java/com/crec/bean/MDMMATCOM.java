package com.crec.bean;

import java.util.Date;

public class MDMMATCOM {
	
	private String ID;
	private String SPESORTS;//分类树
	private String PRODUCTCD;//产品代码（唯一）
	private String CLASSCD;//产品类别
	private String RECSTATUS;//状态
	private Date RECCREATETIME;//创建时间
	private Date RECUPDATETIME;//最后修改时间
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getSPESORTS() {
		return SPESORTS;
	}
	public void setSPESORTS(String sPESORTS) {
		SPESORTS = sPESORTS;
	}
	public String getPRODUCTCD() {
		return PRODUCTCD;
	}
	public void setPRODUCTCD(String pRODUCTCD) {
		PRODUCTCD = pRODUCTCD;
	}
	public String getCLASSCD() {
		return CLASSCD;
	}
	public void setCLASSCD(String cLASSCD) {
		CLASSCD = cLASSCD;
	}
	public String getRECSTATUS() {
		return RECSTATUS;
	}
	public void setRECSTATUS(String rECSTATUS) {
		RECSTATUS = rECSTATUS;
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
