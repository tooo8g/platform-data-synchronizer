package com.crec.bean;

import java.util.Date;

public class MDMMATERIALS {
	
	private String ID;
	private String SPESORTS;//分类树【新增字段】
	private String product_in_id;//物料内码
	private String productmodel;//规格型号【新增字段】
	private String productmaterial;//材质【新增字段】
	private String productth;//图号【新增字段】
	private String proddetails;//产品详细描述
	private String productnm;//细目名称(标准名称)
	private String productsnm;//物料名称(俗称)
	private String class_id;//物料分类内码
	private String unit_id;//计量单位内码
	private String recnote;//停用标识（“0”在用，“1”停用）
	private String rectype;//修订状态(0-新增 1-修改 2-删除 3-其它)
	private Date RECCREATETIME;//创建时间
	private Date RECUPDATETIME;//最后修改时间
	private String PRODUCTCODE;//既有编码
	private String productcd;//物料编码
	
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
	public String getProduct_in_id() {
		return product_in_id;
	}
	public void setProduct_in_id(String product_in_id) {
		this.product_in_id = product_in_id;
	}
	public String getProductmodel() {
		return productmodel;
	}
	public void setProductmodel(String productmodel) {
		this.productmodel = productmodel;
	}
	public String getProductmaterial() {
		return productmaterial;
	}
	public void setProductmaterial(String productmaterial) {
		this.productmaterial = productmaterial;
	}
	public String getProductth() {
		return productth;
	}
	public void setProductth(String productth) {
		this.productth = productth;
	}
	public String getProddetails() {
		return proddetails;
	}
	public void setProddetails(String proddetails) {
		this.proddetails = proddetails;
	}
	public String getProductnm() {
		return productnm;
	}
	public void setProductnm(String productnm) {
		this.productnm = productnm;
	}
	public String getProductsnm() {
		return productsnm;
	}
	public void setProductsnm(String productsnm) {
		this.productsnm = productsnm;
	}
	public String getClass_id() {
		return class_id;
	}
	public void setClass_id(String class_id) {
		this.class_id = class_id;
	}
	public String getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(String unit_id) {
		this.unit_id = unit_id;
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
	public String getPRODUCTCODE() {
		return PRODUCTCODE;
	}
	public void setPRODUCTCODE(String pRODUCTCODE) {
		PRODUCTCODE = pRODUCTCODE;
	}
	public String getProductcd() {
		return productcd;
	}
	public void setProductcd(String productcd) {
		this.productcd = productcd;
	}
	
	
	
}
