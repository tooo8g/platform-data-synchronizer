package com.crec.bean;

import java.util.Date;

public class MDMMATCOM {
	
	private String ID;
	private String spesorts;//分类树
	private String product_id;//物料内码
	private String class_id;//物料分类内码
	private String rectype;//修订状态(0-新增 1-修改 2-删除 3-其它)
	private Date RECCREATETIME;//创建时间
	private Date RECUPDATETIME;//最后修改时间
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getSpesorts() {
		return spesorts;
	}
	public void setSpesorts(String spesorts) {
		this.spesorts = spesorts;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getClass_id() {
		return class_id;
	}
	public void setClass_id(String class_id) {
		this.class_id = class_id;
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
