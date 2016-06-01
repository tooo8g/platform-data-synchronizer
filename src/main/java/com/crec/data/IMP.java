package com.crec.data;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.crec.bean.MDMMATERIALS;
import com.crec.bean.MDMMATSORTS;
import com.crec.bean.MDMMATCOM;
import com.crec.bean.MDMUNITS;
import com.crec.util.TimeUtil;
import com.csvreader.CsvReader;

public class IMP {
	public static void impMDMMATERIALS(String path,String table) {
		CsvReader r = null;
		List<MDMMATERIALS> datas = new ArrayList<MDMMATERIALS>();
		try {
			r = new CsvReader(path, ',', Charset.forName("UTF-8"));
			r.readHeaders();
//			SPESORTS,MATERIALNM,CompanyMatCode ,SPECS,PRODDETAILS,ITEMNAME,MATERIALSUCHEN,MATERIALSORTNM,
//			PRIMARYUNITNM,STOPFLAG,EDITSTATE,CREATETIME,LASTMODIFIEDTIME,RECCREATEEMPNM
			while (r.readRecord()) {
				MDMMATERIALS data = new MDMMATERIALS();
				data.setSPESORTS(r.get("SPESORTS").trim());
				data.setProductcd(r.get("CompanyMatCode").trim());
				data.setProddetails(r.get("PRODDETAILS").trim());
				data.setProductnm(r.get("ITEMNAME").trim());
				data.setProductsnm(r.get("MATERIALSUCHEN").trim());
				data.setProductmodel(r.get("SPECS").trim());
				data.setProductmaterial(r.get("MATERIALCZ").trim());
				data.setProductth(r.get("DRAWNO").trim());
				data.setRectype(r.get("EDITSTATE").trim());
				data.setRecnote(r.get("STOPFLAG").trim());
				data.setProduct_in_id(r.get("MATERIALNM").trim());
				data.setClass_id(r.get("MATERIALSORTNM").trim());
				data.setUnit_id(r.get("PRIMARYUNITNM").trim());
				data.setRECCREATETIME(TimeUtil.parserTime(r.get("CREATETIME").trim()));
				data.setRECUPDATETIME(TimeUtil.parserTime(r.get("LASTMODIFIEDTIME").trim()));
				datas.add(data);
			}
			DataService.add_mdmmaterialsByCount(datas.toArray(new MDMMATERIALS[] {}),table);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (r != null)
				r.close();
		}
	}

	public static void impMDMMATSORTS(String path,String table) {
		CsvReader r = null;
		List<MDMMATSORTS> datas = new ArrayList<MDMMATSORTS>();
		try {
			r = new CsvReader(path, ',', Charset.forName("UTF-8"));
			r.readHeaders();
			while (r.readRecord()) {
				MDMMATSORTS data = new MDMMATSORTS();
				data.setClasscd(r.get("MATERIALSORTCODE").trim());
				data.setClassnm(r.get("MATERIALSORTNAME").trim());
				data.setParentclasscd(r.get("PARENTCODE").trim());
				data.setClasslevel(r.get("LAYER").trim());
				data.setRectype(r.get("EDITSTATE").trim());
				data.setRecnote(r.get("ISHISTORY").trim());
				data.setSpesorts(r.get("SPESORTS").trim());
				data.setClass_id(r.get("MATERIALSORTNM").trim());
				data.setReccreatetime(TimeUtil.parserTime(r.get("CREATETIME").trim()));
				data.setRecupdatetime(TimeUtil.parserTime(r.get("LASTMODIFIEDTIME").trim()));
				datas.add(data);
			}
			DataService.add_mdmmatsortsByCount(datas.toArray(new MDMMATSORTS[] {}),table);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (r != null)
				r.close();
		}
	}

	public static void impMDMUNITS(String path,String table) {
		CsvReader r = null;
		List<MDMUNITS> datas = new ArrayList<MDMUNITS>();
		try {
			r = new CsvReader(path, ',', Charset.forName("UTF-8"));
			r.readHeaders();
			while (r.readRecord()) {
				MDMUNITS data = new MDMUNITS();
				data.setUnit_id(r.get("UNITNM").trim());
				data.setUnitnm(r.get("UNITNAME").trim());
				data.setSsnm(r.get("SSNM").trim());
				data.setRectype(r.get("EDITSTATE").trim());
				data.setRecnote(r.get("ISHISTORY").trim());
				data.setRECCREATETIME(TimeUtil.parserTime(r.get("CREATETIME").trim()));
				data.setRECUPDATETIME(TimeUtil.parserTime(r.get("LASTMODIFIEDTIME").trim()));
				datas.add(data);
			}
			DataService.add_mdmunitsByCount(datas.toArray(new MDMUNITS[] {}),table);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (r != null)
				r.close();
		}
	}
	
	public static void impMDMMATCOM(String path,String table) {
		CsvReader r = null;
		List<MDMMATCOM> datas = new ArrayList<MDMMATCOM>();
		try {
			r = new CsvReader(path, ',', Charset.forName("UTF-8"));
			r.readHeaders();
			while (r.readRecord()) {
				MDMMATCOM data = new MDMMATCOM();
				data.setProduct_id(r.get("MATERIALNM").trim());
				data.setClass_id(r.get("MATERIALSORTNM").trim());
				data.setRectype(r.get("EDITSTATE").trim());
				data.setSpesorts(r.get("SPESORTS").trim());
				data.setRECCREATETIME(TimeUtil.parserTime(r.get("CREATETIME").trim()));
//				System.out.println("第一个时间："+r.get("CREATETIME"));
				data.setRECUPDATETIME(TimeUtil.parserTime(r.get("LASTMODIFIEDTIME").trim()));
//				System.out.println("第2个时间："+r.get("LASTMODIFIEDTIME"));
				datas.add(data);
			}
			DataService.add_mdmmatcomByCount(datas.toArray(new MDMMATCOM[] {}),table);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (r != null)
				r.close();
		}
	}
	public static void main(String[] args) {
		String t_it_jd_materials = "E:/test/data/csv/t_it_jd_materials.csv";
		String T_IT_JD_MATERIALCLASSES = "E:/test/data/csv/T_IT_JD_MATERIALCLASSES.csv";
		String t_it_jd_relation = "E:/test/data/csv/t_it_jd_relation.csv";
		String t_it_jd_unit = "E:/test/data/csv/t_it_jd_unit.csv";
		String t_it_yzb_materials = "E:/test/data/yzb/t_it_yzb_materials-20160601.csv";
		String t_it_yzb_relation = "E:/test/data/yzb/t_it_yzb_relation-20160601.csv";
		String T_IT_yzb_MATERIALCLASSES = "E:/test/data/yzb/T_IT_yzb_MATERIALCLASSES-20160601.csv";
		String t_it_yzb_unit = "E:/test/data/yzb/t_it_yzb_unit-20160531.csv";
//		impMDMMATERIALS(t_it_jd_materials);
//		impMDMMATSORTS(T_IT_JD_MATERIALCLASSES);
//		impMDMMATCOM(t_it_jd_relation);
//		impMDMUNITS(t_it_jd_unit);
//		String table = "T_IT_JD_UNIT";
//		String table = "T_IT_JD_MATERIALS";
//		String table = "T_IT_YZB_RELATION";
		String table = "T_IT_YZB_MATERIALS";
//		String table = "T_IT_YZB_MATERIALCLASSES";
//		String table = "T_IT_YZB_UNIT";
		impMDMMATERIALS(t_it_yzb_materials,table);
//		impMDMMATERIALS(t_it_jd_materials,table);
//		impMDMMATCOM(t_it_yzb_relation,table);
//		impMDMUNITS(t_it_yzb_unit,table);
//		impMDMUNITS(t_it_jd_unit,table);
//		impMDMMATSORTS(T_IT_yzb_MATERIALCLASSES, table);
	}
	
}
