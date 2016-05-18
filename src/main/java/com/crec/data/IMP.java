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
	public static void impMDMMATERIALS(String path) {
		CsvReader r = null;
		List<MDMMATERIALS> datas = new ArrayList<MDMMATERIALS>();
		try {
			r = new CsvReader(path, ',', Charset.forName("GBK"));
			r.readHeaders();
			while (r.readRecord()) {
				MDMMATERIALS data = new MDMMATERIALS();
				data.setSPESORTS(r.get("SPESORTS"));
				data.setPRODUCTCD(r.get("MATERIALNM"));
				data.setSPECS(r.get("SPECS"));
				data.setMATERIALCZ(r.get("MATERIALCZ"));
				data.setDRAWNO(r.get("DRAWNO"));
				data.setPRODDETAILS(r.get("PRODDETAILS"));
				data.setPRODUCTNM(r.get("ITEMNAME"));
				data.setPRODUCTSNM(r.get("MATERIALSUCHEN"));
				data.setCLASSCD(r.get("MATERIALSORTNM"));
				data.setUNITCD(r.get("PRIMARYUNITNM"));
				data.setSTOPFLAG(r.get("STOPFLAG"));
				data.setRECSTATUS(r.get("EDITSTATE"));
				data.setRECCREATETIME(TimeUtil.parserTime(r.get("CREATETIME")));
				data.setRECUPDATETIME(TimeUtil.parserTime(r.get("LASTMODIFIEDTIME")));
				data.setRECCREATEEMPNM(r.get("RECCREATEEMPNM"));
				data.setMATERIALCODE(r.get("CompanyMatCode"));
				datas.add(data);
			}
			DataService.add_mdmmaterials(datas.toArray(new MDMMATERIALS[] {}));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (r != null)
				r.close();
		}
	}

	public static void impMDMMATSORTS(String path) {
		CsvReader r = null;
		List<MDMMATSORTS> datas = new ArrayList<MDMMATSORTS>();
		try {
			r = new CsvReader(path, ',', Charset.forName("GBK"));
			r.readHeaders();
			while (r.readRecord()) {
				MDMMATSORTS data = new MDMMATSORTS();
				data.setSPESORTS(r.get("SPESORTS"));
				data.setMATERIALSORTNM(r.get("MATERIALSORTNM"));
				data.setCLASSCD(r.get("MATERIALSORTCODE"));
				data.setCLASSNM(r.get("MATERIALSORTNAME"));
				data.setPARENTCLASSCD(r.get("PARENTCODE"));
				data.setCLASSLEVEL(r.get("LAYER"));
				data.setSTOPFLAG(r.get("ISHISTORY"));
				data.setRECSTATUS(r.get("EDITSTATE"));
				data.setRECCREATETIME(TimeUtil.parserTime(r.get("CREATETIME")));
				data.setRECUPDATETIME(TimeUtil.parserTime(r.get("LASTMODIFIEDTIME")));
				datas.add(data);
			}
			DataService.add_mdmmatsorts(datas.toArray(new MDMMATSORTS[] {}));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (r != null)
				r.close();
		}
	}

	public static void impMDMUNITS(String path) {
		CsvReader r = null;
		List<MDMUNITS> datas = new ArrayList<MDMUNITS>();
		try {
			r = new CsvReader(path, ',', Charset.forName("GBK"));
			r.readHeaders();
			while (r.readRecord()) {
				MDMUNITS data = new MDMUNITS();
				data.setUNITCD(r.get("UNITNM"));
				data.setUNITNM(r.get("UNITNAME"));
				data.setSSNM(r.get("SSNM"));
				data.setRECSTATUS(r.get("EDITSTATE"));
				data.setSTOPFLAG(r.get("ISHISTORY"));
				data.setRECCREATETIME(TimeUtil.parserTime(r.get("CREATETIME")));
				data.setRECUPDATETIME(TimeUtil.parserTime(r.get("LASTMODIFIEDTIME")));
				datas.add(data);
			}
			DataService.add_mdmunits(datas.toArray(new MDMUNITS[] {}));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (r != null)
				r.close();
		}
	}
	
	public static void impMDMMATCOM(String path) {
		CsvReader r = null;
		List<MDMMATCOM> datas = new ArrayList<MDMMATCOM>();
		try {
			r = new CsvReader(path, ',', Charset.forName("GBK"));
			r.readHeaders();
			while (r.readRecord()) {
				MDMMATCOM data = new MDMMATCOM();
				data.setSPESORTS(r.get("SPESORTS"));
				data.setPRODUCTCD(r.get("MATERIALNM"));
				data.setCLASSCD(r.get("MATERIALSORTNM"));
				data.setRECSTATUS(r.get("EDITSTATE"));
				data.setRECCREATETIME(TimeUtil.parserTime(r.get("CREATETIME")));
				data.setRECUPDATETIME(TimeUtil.parserTime(r.get("LASTMODIFIEDTIME")));
				datas.add(data);
			}
			DataService.add_mdmmatcom(datas.toArray(new MDMMATCOM[] {}));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (r != null)
				r.close();
		}
	}
}
