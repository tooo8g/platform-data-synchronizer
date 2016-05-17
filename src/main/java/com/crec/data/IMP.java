package com.crec.data;


public class IMP {
/*
	public static void impMDMMATERIALS(String path) {
		CsvReader r = null;
		List<MDMMATERIALS> datas = new ArrayList<MDMMATERIALS>();
		try {
			r = new CsvReader(path, ',', Charset.forName("GBK"));
			r.readHeaders();
			while (r.readRecord()) {
				MDMMATERIALS data = new MDMMATERIALS();
				data.setMATERIALNM(r.get("MATERIALNM"));
				data.setSPESORTS(r.get("SPESORTS"));
				data.setMATERIALCODE(r.get("MATERIALCODE"));
				data.setMATERIALNAME(r.get("MATERIALNAME"));
				data.setSPECS(r.get("SPECS"));
				data.setMATERIALSORTNM(r.get("MATERIALSORTNM"));
				data.setPRIMARYUNITNM(r.get("PRIMARYUNITNM"));
				data.setSTOPFLAG(r.get("STOPFLAG"));
				data.setCREATETIME(r.get("CREATETIME"));
				data.setLASTMODIFIEDTIME(r.get("LASTMODIFIEDTIME"));
				data.setMATERIALCODE_OLD(r.get("MATERIALCODE_OLD"));
				// data.setSTOPTIME(r.get("STOPTIME"));
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
				data.setCREATETIME(r.get("CREATETIME"));
				data.setISDETAIL(r.get("ISDETAIL"));
				data.setISHISTORY(r.get("ISHISTORY"));
				data.setLASTMODIFIEDTIME(r.get("LASTMODIFIEDTIME"));
				data.setLAYER(r.get("LAYER"));
				data.setMATERIALSORTCODE(r.get("MATERIALSORTCODE"));
				data.setMATERIALSORTNAME(r.get("MATERIALSORTNAME"));
				data.setMATERIALSORTPATH(r.get("MATERIALSORTPATH"));
				data.setSPETYPE(r.get("SPETYPE"));
				data.setMATERIALSORTNM(r.get("MATERIALSORTNM"));
				data.setMATERIALSORTCODE_OLD(r.get("MATERIALSORTCODE_OLD"));
				data.setPARENTCODE(r.get("PARENTCODE"));
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
				data.setCREATETIME(r.get("CREATETIME"));
				data.setISHISTORY(r.get("ISHISTORY"));
				data.setLASTMODIFIEDTIME(r.get("LASTMODIFIEDTIME"));
				data.setUNITCODE(r.get("UNITCODE"));
				data.setUNITNAME(r.get("UNITNAME"));
				data.setUNITNM(r.get("UNITNM"));
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
	*/
}
