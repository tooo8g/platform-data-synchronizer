package com.crec.bean;

import java.util.Date;

public class MDMMATSORTS {
	
	private String ID;
	private String spesorts;//分类树【新增字段】
	private String class_id;//物料分类内码【新增字段】
	private String classcd;//物料分类编号
	private String classnm;//物料分类名称
	private String parentclasscd;//父类编码
	private String classlevel;//层级
	private String recnote;//停用标志
	private String rectype;//修订状态(0-新增 1-修改 2-删除 3-其它);
	private Date reccreatetime;//创建时间
	private Date recupdatetime;//最后修改时间
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
	public String getClass_id() {
		return class_id;
	}
	public void setClass_id(String class_id) {
		this.class_id = class_id;
	}
	public String getClasscd() {
		return classcd;
	}
	public void setClasscd(String classcd) {
		this.classcd = classcd;
	}
	public String getClassnm() {
		return classnm;
	}
	public void setClassnm(String classnm) {
		this.classnm = classnm;
	}
	public String getParentclasscd() {
		return parentclasscd;
	}
	public void setParentclasscd(String parentclasscd) {
		this.parentclasscd = parentclasscd;
	}
	public String getClasslevel() {
		return classlevel;
	}
	public void setClasslevel(String classlevel) {
		this.classlevel = classlevel;
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
	public Date getReccreatetime() {
		return reccreatetime;
	}
	public void setReccreatetime(Date reccreatetime) {
		this.reccreatetime = reccreatetime;
	}
	public Date getRecupdatetime() {
		return recupdatetime;
	}
	public void setRecupdatetime(Date recupdatetime) {
		this.recupdatetime = recupdatetime;
	}
	
	
}
