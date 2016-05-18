package com.crec.bean;

import java.util.Date;

public class MDMMATERIALS {
	
	private String ID;
	private String SPESORTS;//分类树【新增字段】
	private String PRODUCTCD;//产品代码（唯一）
	private String SPECS;//规格型号【新增字段】
	private String MATERIALCZ;//材质【新增字段】
	private String DRAWNO;//图号【新增字段】
	private String PRODDETAILS;//产品详细描述
	private String PRODUCTNM;//产品名称
	private String PRODUCTSNM;//产品简称
	private String CLASSCD;//产品类别
	private String PRODUCTAREA;//产地
	private String UNITCD;//计量单位代码
	private String MEASUREUNIT;//计量单位
	private String SALEUNIT;//销售单位
	private String CHANGERATE;
	private String TAXRATE;
	private String VENDORCD;//供应商
	private String STOPFLAG;//停用标识【新增字段】
	private String RECTYPE;//操作类型
	private String RECSTATUS;//状态
	private Date RECCREATETIME;//创建时间
	private Date RECUPDATETIME;//最后修改时间
	private String RECCREATEEMPNM;//数据来源
	private String RECUPDATEEMPNM;//
	private String RECNOTE;//
	private String PRODUCTCODE;//应用代码
	private String MATERIALCODE;//物料编码【新增字段】
	
	
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
	public String getSPECS() {
		return SPECS;
	}
	public void setSPECS(String sPECS) {
		SPECS = sPECS;
	}
	public String getMATERIALCZ() {
		return MATERIALCZ;
	}
	public void setMATERIALCZ(String mATERIALCZ) {
		MATERIALCZ = mATERIALCZ;
	}
	public String getDRAWNO() {
		return DRAWNO;
	}
	public void setDRAWNO(String dRAWNO) {
		DRAWNO = dRAWNO;
	}
	public String getPRODDETAILS() {
		return PRODDETAILS;
	}
	public void setPRODDETAILS(String pRODDETAILS) {
		PRODDETAILS = pRODDETAILS;
	}
	public String getPRODUCTNM() {
		return PRODUCTNM;
	}
	public void setPRODUCTNM(String pRODUCTNM) {
		PRODUCTNM = pRODUCTNM;
	}
	public String getPRODUCTSNM() {
		return PRODUCTSNM;
	}
	public void setPRODUCTSNM(String pRODUCTSNM) {
		PRODUCTSNM = pRODUCTSNM;
	}
	public String getCLASSCD() {
		return CLASSCD;
	}
	public void setCLASSCD(String cLASSCD) {
		CLASSCD = cLASSCD;
	}
	public String getPRODUCTAREA() {
		return PRODUCTAREA;
	}
	public void setPRODUCTAREA(String pRODUCTAREA) {
		PRODUCTAREA = pRODUCTAREA;
	}
	public String getUNITCD() {
		return UNITCD;
	}
	public void setUNITCD(String uNITCD) {
		UNITCD = uNITCD;
	}
	public String getMEASUREUNIT() {
		return MEASUREUNIT;
	}
	public void setMEASUREUNIT(String mEASUREUNIT) {
		MEASUREUNIT = mEASUREUNIT;
	}
	public String getSALEUNIT() {
		return SALEUNIT;
	}
	public void setSALEUNIT(String sALEUNIT) {
		SALEUNIT = sALEUNIT;
	}
	public String getCHANGERATE() {
		return CHANGERATE;
	}
	public void setCHANGERATE(String cHANGERATE) {
		CHANGERATE = cHANGERATE;
	}
	public String getTAXRATE() {
		return TAXRATE;
	}
	public void setTAXRATE(String tAXRATE) {
		TAXRATE = tAXRATE;
	}
	public String getVENDORCD() {
		return VENDORCD;
	}
	public void setVENDORCD(String vENDORCD) {
		VENDORCD = vENDORCD;
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
	public String getPRODUCTCODE() {
		return PRODUCTCODE;
	}
	public void setPRODUCTCODE(String pRODUCTCODE) {
		PRODUCTCODE = pRODUCTCODE;
	}
	public String getMATERIALCODE() {
		return MATERIALCODE;
	}
	public void setMATERIALCODE(String mATERIALCODE) {
		MATERIALCODE = mATERIALCODE;
	}
	
}
