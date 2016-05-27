package com.crec.bean;

import java.util.Date;

public class MDMUNITS {
	
	private  String ID;
	private String unit_id;//计量单位内码
	private String unitnm;//计量单位名称
	private String ssnm;//缩写
	private String recnote;//停用标识【新增字段】
	private String rectype;//修订状态(0-新增 1-修改 2-删除 3-其它)
	private Date RECCREATETIME;//创建时间
	private Date RECUPDATETIME;//最后修改时间
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(String unit_id) {
		this.unit_id = unit_id;
	}
	public String getUnitnm() {
		return unitnm;
	}
	public void setUnitnm(String unitnm) {
		this.unitnm = unitnm;
	}
	public String getSsnm() {
		return ssnm;
	}
	public void setSsnm(String ssnm) {
		this.ssnm = ssnm;
	}
	public String getRecnote() {
		return recnote;
	}
	public void setRecnote(String recnote) {
		this.recnote = recnote;
	}
	public String getRectype() {
		return rectype;
	}
	public void setRectype(String rectype) {
		this.rectype = rectype;
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
