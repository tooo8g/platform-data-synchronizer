package com.crec.bean;

import java.util.Date;

public class MDMMATSORTS {
	
	private String ID;
	private String SPESORTS;//分类树【新增字段】
	private String MATERIALSORTNM;//物料分类内码【新增字段】
	private String CLASSCD;//大类编码
	private String CLASSNM;//名称
	private String PARENTCLASSCD;//父类编码
	private String CLASSLEVEL;//层级
	private String STOPFLAG;//停用标志
	private String RECTYPE;
	private String RECSTATUS;//修订状态
	private Date RECCREATETIME;//创建时间
	private Date RECUPDATETIME;//最后修改时间
	private String RECCREATEEMPNM;
	private String RECUPDATEEMPNM;
	private String RECNOTE;
	
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
	public String getMATERIALSORTNM() {
		return MATERIALSORTNM;
	}
	public void setMATERIALSORTNM(String mATERIALSORTNM) {
		MATERIALSORTNM = mATERIALSORTNM;
	}
	public String getCLASSCD() {
		return CLASSCD;
	}
	public void setCLASSCD(String cLASSCD) {
		CLASSCD = cLASSCD;
	}
	public String getCLASSNM() {
		return CLASSNM;
	}
	public void setCLASSNM(String cLASSNM) {
		CLASSNM = cLASSNM;
	}
	public String getPARENTCLASSCD() {
		return PARENTCLASSCD;
	}
	public void setPARENTCLASSCD(String pARENTCLASSCD) {
		PARENTCLASSCD = pARENTCLASSCD;
	}
	public String getCLASSLEVEL() {
		return CLASSLEVEL;
	}
	public void setCLASSLEVEL(String cLASSLEVEL) {
		CLASSLEVEL = cLASSLEVEL;
	}
	public String getSTOPFLAG() {
		return STOPFLAG;
	}
	public void setSTOPFLAG(String sTOPFLAG) {
		STOPFLAG = sTOPFLAG;
	}
	public String getRECTYPE() {
		return RECTYPE;
	}
	public void setRECTYPE(String rECTYPE) {
		RECTYPE = rECTYPE;
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
	public String getRECCREATEEMPNM() {
		return RECCREATEEMPNM;
	}
	public void setRECCREATEEMPNM(String rECCREATEEMPNM) {
		RECCREATEEMPNM = rECCREATEEMPNM;
	}
	public String getRECUPDATEEMPNM() {
		return RECUPDATEEMPNM;
	}
	public void setRECUPDATEEMPNM(String rECUPDATEEMPNM) {
		RECUPDATEEMPNM = rECUPDATEEMPNM;
	}
	public String getRECNOTE() {
		return RECNOTE;
	}
	public void setRECNOTE(String rECNOTE) {
		RECNOTE = rECNOTE;
	}
	
	
	
}
