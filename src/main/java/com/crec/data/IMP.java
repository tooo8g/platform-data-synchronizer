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
			r = new CsvReader(path, ',', Charset.forName("GBK"));
			r.readHeaders();
//			SPESORTS,MATERIALNM,CompanyMatCode ,SPECS,PRODDETAILS,ITEMNAME,MATERIALSUCHEN,MATERIALSORTNM,
//			PRIMARYUNITNM,STOPFLAG,EDITSTATE,CREATETIME,LASTMODIFIEDTIME,RECCREATEEMPNM
			while (r.readRecord()) {
				MDMMATERIALS data = new MDMMATERIALS();
				data.setSPESORTS(r.get("SPESORTS"));
				data.setProductcd(r.get("CompanyMatCode"));
				data.setProddetails(r.get("PRODDETAILS"));
				data.setProductnm(r.get("ITEMNAME"));
				data.setProductsnm(r.get("MATERIALSUCHEN"));
				data.setProductmodel(r.get("SPECS"));
				data.setProductmaterial(r.get("MATERIALCZ"));
				data.setProductth(r.get("DRAWNO"));
				data.setRectype(r.get("EDITSTATE"));
				data.setProduct_in_id(r.get("MATERIALNM"));
				data.setClass_id(r.get("MATERIALSORTNM"));
				data.setUnit_id(r.get("PRIMARYUNITNM"));
				data.setRECCREATETIME(TimeUtil.parserTime(r.get("CREATETIME")));
				data.setRECUPDATETIME(TimeUtil.parserTime(r.get("LASTMODIFIEDTIME")));
				datas.add(data);
			}
			DataService.add_mdmmaterials(datas.toArray(new MDMMATERIALS[] {}),table);
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
			r = new CsvReader(path, ',', Charset.forName("GBK"));
			r.readHeaders();
			while (r.readRecord()) {
				MDMMATSORTS data = new MDMMATSORTS();
				data.setClasscd(r.get("MATERIALSORTCODE"));
				data.setClassnm(r.get("MATERIALSORTNAME"));
				data.setParentclasscd(r.get("PARENTCODE"));
				data.setClasslevel(r.get("LAYER"));
				data.setRectype(r.get("EDITSTATE"));
				data.setRecnote(r.get("ISHISTORY"));
				data.setSpesorts(r.get("SPESORTS"));
				data.setClass_id(r.get("MATERIALSORTNM"));
				data.setReccreatetime(TimeUtil.parserTime(r.get("CREATETIME")));
				data.setRecupdatetime(TimeUtil.parserTime(r.get("LASTMODIFIEDTIME")));
				datas.add(data);
			}
			DataService.add_mdmmatsorts(datas.toArray(new MDMMATSORTS[] {}),table);
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
			r = new CsvReader(path, ',', Charset.forName("GBK"));
			r.readHeaders();
			while (r.readRecord()) {
				MDMUNITS data = new MDMUNITS();
				data.setUnit_id(r.get("UNITNM"));
				data.setUnitnm(r.get("UNITNAME"));
				data.setSsnm(r.get("SSNM"));
				data.setRectype(r.get("EDITSTATE"));
				data.setRecnote(r.get("ISHISTORY"));
				data.setRECCREATETIME(TimeUtil.parserTime(r.get("CREATETIME")));
				data.setRECUPDATETIME(TimeUtil.parserTime(r.get("LASTMODIFIEDTIME")));
				datas.add(data);
			}
			DataService.add_mdmunits(datas.toArray(new MDMUNITS[] {}),table);
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
			r = new CsvReader(path, ',', Charset.forName("GBK"));
			r.readHeaders();
			while (r.readRecord()) {
				MDMMATCOM data = new MDMMATCOM();
				data.setProduct_id(r.get("MATERIALNM"));
				data.setClass_id(r.get("MATERIALSORTNM"));
				data.setRectype(r.get("EDITSTATE"));
				data.setSpesorts(r.get("SPESORTS"));
				data.setRECCREATETIME(TimeUtil.parserTime(r.get("CREATETIME")));
//				System.out.println("第一个时间："+r.get("CREATETIME"));
				data.setRECUPDATETIME(TimeUtil.parserTime(r.get("LASTMODIFIEDTIME")));
//				System.out.println("第2个时间："+r.get("LASTMODIFIEDTIME"));
				datas.add(data);
			}
			DataService.add_mdmmatcom(datas.toArray(new MDMMATCOM[] {}),table);
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
		String t_it_yzb_materials = "E:/test/data/yzb/t_it_yzb_materials.csv";
		String t_it_yzb_relation = "E:/test/data/yzb/t_it_yzb_relation.csv";
		String T_IT_yzb_MATERIALCLASSES = "E:/test/data/yzb/T_IT_yzb_MATERIALCLASSES.csv";
		String t_it_yzb_unit = "E:/test/data/yzb/t_it_yzb_unit.csv";
//		impMDMMATERIALS(t_it_jd_materials);
//		impMDMMATSORTS(T_IT_JD_MATERIALCLASSES);
//		impMDMMATCOM(t_it_jd_relation);
//		impMDMUNITS(t_it_jd_unit);
//		String table = "T_IT_JD_MATERIALS";
//		String table = "T_IT_YZB_RELATION";
//		String table = "T_IT_YZB_MATERIALS";
		String table = "T_IT_YZB_MATERIALCLASSES";
//		String table = "T_IT_YZB_UNIT";
//		impMDMMATERIALS(t_it_yzb_materials,table);
//		impMDMMATERIALS(t_it_jd_materials,table);
//		impMDMMATCOM(t_it_yzb_relation,table);
//		impMDMUNITS(t_it_yzb_unit,table);
		impMDMMATSORTS(T_IT_yzb_MATERIALCLASSES, table);
	}
	
}
