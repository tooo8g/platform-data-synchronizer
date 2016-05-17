package com.crec.data;


public class DataService {
/*
	public static boolean add_mdmunits(MDMUNITS[] data) {
		String insert = "insert into MDMUNITS(unitnm,unitcode,unitname,ishistory,createtime,"
				+ "lastmodifiedtime) values(?,?,?,?,?,?)";
		String delete = "delete from MDMUNITS where unitnm=?";
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		try {
			PreparedStatement p_delete = conn.prepareStatement(delete);
			PreparedStatement p_insert = conn.prepareStatement(insert);
			conn.setAutoCommit(false);
			for (MDMUNITS d : data) {
				p_delete.setString(1, d.getUNITNM());
				p_insert.setString(1, d.getUNITNM());
				p_insert.setString(2, d.getUNITCODE());
				p_insert.setString(3, d.getUNITNAME());
				p_insert.setString(4, d.getISHISTORY());
				p_insert.setDate(5, TimeUtil.parserDate(d.getCREATETIME()));
				p_insert.setDate(6,
						TimeUtil.parserDate(d.getLASTMODIFIEDTIME()));
				p_insert.addBatch();
			}
			p_delete.executeBatch();
			p_insert.executeBatch();
			conn.commit();
			conn.setAutoCommit(true);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public static boolean add_mdmmatsorts(MDMMATSORTS[] data) {
		String insert = "insert into MDMMATSORTS(materialsortnm,materialsortcode,materialsortname,"
				+ "materialsortpath,spetype,layer,isdetail,ishistory,createtime,lastmodifiedtime,materialsortcode_old,parentcode)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?,?)";
		String delete = "delete from MDMMATSORTS where materialsortnm=?";
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		try {
			PreparedStatement p_delete = conn.prepareStatement(delete);
			PreparedStatement p_insert = conn.prepareStatement(insert);
			conn.setAutoCommit(false);
			for (MDMMATSORTS d : data) {
				p_delete.setString(1, d.getMATERIALSORTNM());
				p_insert.setString(1, d.getMATERIALSORTNM());
				p_insert.setString(2, d.getMATERIALSORTCODE());
				p_insert.setString(3, d.getMATERIALSORTNAME());
				p_insert.setString(4, d.getMATERIALSORTPATH());
				p_insert.setString(5, d.getSPETYPE());
				p_insert.setInt(6, ParseUtil.parseInt(d.getLAYER()));
				p_insert.setString(7, d.getISDETAIL());
				p_insert.setString(8, d.getISHISTORY());
				p_insert.setDate(9, TimeUtil.parserDate(d.getCREATETIME()));
				p_insert.setDate(10,
						TimeUtil.parserDate(d.getLASTMODIFIEDTIME()));
				p_insert.setString(11, d.getMATERIALSORTCODE_OLD());
				p_insert.setString(12, d.getPARENTCODE());
				p_insert.addBatch();
			}
			p_delete.executeBatch();
			p_insert.executeBatch();
			conn.commit();
			conn.setAutoCommit(true);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public static boolean add_mdmmaterials(MDMMATERIALS[] data) {
		String insert = "insert into MDMMATERIALS(MATERIALNM,SPESORTS,MATERIALCODE,MATERIALNAME,"
				+ "SPECS,MATERIALSORTNM,PRIMARYUNITNM,STOPFLAG,CREATETIME,"
				+ "LASTMODIFIEDTIME,MATERIALCODE_OLD)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?)";
		String delete = "delete from MDMMATERIALS where MATERIALNM=?";
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		try {
			PreparedStatement p_delete = conn.prepareStatement(delete);
			PreparedStatement p_insert = conn.prepareStatement(insert);
			conn.setAutoCommit(false);
			for (MDMMATERIALS d : data) {
				p_delete.setString(1, d.getMATERIALNM());
				p_insert.setString(1, d.getMATERIALNM());
				p_insert.setString(2, d.getSPESORTS());
				p_insert.setString(3, d.getMATERIALCODE());
				p_insert.setString(4, d.getMATERIALNAME());
				p_insert.setString(5, d.getSPECS());
				p_insert.setString(6, d.getMATERIALSORTNM());
				p_insert.setString(7, d.getPRIMARYUNITNM());
				p_insert.setString(8, d.getSTOPFLAG());
				p_insert.setDate(9, TimeUtil.parserDate(d.getCREATETIME()));
				p_insert.setDate(10,
						TimeUtil.parserDate(d.getLASTMODIFIEDTIME()));
				p_insert.setString(11, d.getMATERIALCODE_OLD());
				p_insert.addBatch();
			}
			p_delete.executeBatch();
			p_insert.executeBatch();
			conn.commit();
			conn.setAutoCommit(true);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	*/
}
