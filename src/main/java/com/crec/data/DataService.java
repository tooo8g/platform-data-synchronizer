package com.crec.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.crec.bean.MDMMATCOM;
import com.crec.bean.MDMMATERIALS;
import com.crec.bean.MDMMATSORTS;
import com.crec.bean.MDMUNITS;
import com.crec.conn.ConnectionPool;

public class DataService {
	public static boolean add_mdmunits(MDMUNITS[] data) {
		String insert = "insert into MDMUNITS(UNITCD,UNITNM,SSNM,RECSTATUS,STOPFLAG,RECCREATETIME,RECUPDATETIME) values(?,?,?,?,?,?,?)";
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		try {
			PreparedStatement p_insert = conn.prepareStatement(insert);
			conn.setAutoCommit(false);
			for (MDMUNITS d : data) {
				p_insert.setString(1,d.getUNITCD());
				p_insert.setString(2, d.getUNITNM());
				p_insert.setString(3, d.getSSNM());
				p_insert.setString(4, d.getRECSTATUS());
				p_insert.setString(5, d.getSTOPFLAG());
				p_insert.setDate(6, (java.sql.Date) d.getRECCREATETIME());
				p_insert.setDate(7,(java.sql.Date) d.getRECUPDATETIME());
				p_insert.addBatch();
			}
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
		String insert = "insert into MDMMATSORTS(SPESORTS,MATERIALSORTNM,CLASSCD,"
				+ "CLASSNM,PARENTCLASSCD,CLASSLEVEL,STOPFLAG,RECSTATUS,RECCREATETIME,RECUPDATETIME)"
				+ " values(?,?,?,?,?,?,?,?,?,?)";
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		try {
			PreparedStatement p_insert = conn.prepareStatement(insert);
			conn.setAutoCommit(false);
			for (MDMMATSORTS d : data) {
				p_insert.setString(1, d.getMATERIALSORTNM());
				p_insert.setString(2, d.getCLASSCD());
				p_insert.setString(3, d.getCLASSNM());
				p_insert.setString(4, d.getPARENTCLASSCD());
				p_insert.setString(5, d.getCLASSLEVEL());
				p_insert.setString(6, d.getSTOPFLAG());
				p_insert.setString(7, d.getRECSTATUS());
				p_insert.setDate(9,  (java.sql.Date) d.getRECCREATETIME());
				p_insert.setDate(10, (java.sql.Date)d.getRECUPDATETIME());
				p_insert.addBatch();
			}
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
		String insert = "insert into MDMMATERIALS(PRODUCTCD,SPECS,PRODDETAILS,PRODUCTNM,"
				+ "PRODUCTSNM,UNITCD,STOPFLAG,RECTYPE,"
				+ "RECCREATETIME,RECUPDATETIME,MATERIALCODE)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?)";
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		try {
			PreparedStatement p_insert = conn.prepareStatement(insert);
			conn.setAutoCommit(false);
			for (MDMMATERIALS d : data) {
				p_insert.setString(1, d.getPRODUCTCD());
				p_insert.setString(2, d.getSPECS());
				p_insert.setString(3, d.getPRODDETAILS());
				p_insert.setString(4, d.getPRODUCTNM());
				p_insert.setString(5, d.getPRODUCTSNM());
				p_insert.setString(6, d.getUNITCD());
				p_insert.setString(7, d.getSTOPFLAG());
				p_insert.setString(8, d.getRECTYPE());
				p_insert.setDate(9, (java.sql.Date) d.getRECCREATETIME());
				p_insert.setDate(10, (java.sql.Date) d.getRECUPDATETIME());
				p_insert.setString(11, d.getMATERIALCODE());
				p_insert.addBatch();
			}
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
	
	public static boolean add_mdmmatcom(MDMMATCOM[] data) {
		String insert = "insert into MDMMATCOM(SPESORTS,PRODUCTCD,CLASSCD,RECSTATUS,"
				+ "RECCREATETIME,RECUPDATETIME"
				+ " values(?,?,?,?,?,?)";
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		try {
			PreparedStatement p_insert = conn.prepareStatement(insert);
			conn.setAutoCommit(false);
			for (MDMMATCOM d : data) {
				p_insert.setString(1, d.getSPESORTS());
				p_insert.setString(2, d.getPRODUCTCD());
				p_insert.setString(3, d.getCLASSCD());
				p_insert.setString(4, d.getRECSTATUS());
				p_insert.setDate(5, (java.sql.Date) d.getRECCREATETIME());
				p_insert.setDate(6, (java.sql.Date) d.getRECUPDATETIME());
				p_insert.addBatch();
			}
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
	
}
