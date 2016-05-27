package com.crec.data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.crec.bean.MDMMATCOM;
import com.crec.bean.MDMMATERIALS;
import com.crec.bean.MDMMATSORTS;
import com.crec.bean.MDMUNITS;
import com.crec.conn.ConnectionPool;

public class DataService {
	public static boolean add_mdmunits(MDMUNITS[] data,String table) {
		String insert = "insert into "+table+"(UNIT_ID,UNITNM,SSNM,RECTYPE,RECNOTE,RECCREATETIME,RECUPDATETIME,RECCREATEEMPNM,RECUPDATEEMPNM) values(?,?,?,?,?,?,?,?,?)";
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		try {
			PreparedStatement p_insert = conn.prepareStatement(insert);
			conn.setAutoCommit(false);
			for (MDMUNITS d : data){
				p_insert.setString(1,d.getUnit_id());
				p_insert.setString(2, d.getUnitnm());
				p_insert.setString(3, d.getSsnm());
				p_insert.setString(4, d.getRectype());
				p_insert.setString(5, d.getRecnote());
				p_insert.setDate(6, new Date( d.getRECCREATETIME().getTime()));
				p_insert.setDate(7,new Date(d.getRECUPDATETIME().getTime()) );
				p_insert.setString(8, "LBMDM");
				p_insert.setString(9, "LBMDM");
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

	public static boolean add_mdmmatsorts(MDMMATSORTS[] data,String table) {
		String insert = "insert into "+table+"(CLASSCD,CLASSNM,PARENTCLASSCD,"
				+ "CLASSLEVEL,RECTYPE,RECNOTE,SPESORTS,CLASS_ID,RECCREATETIME,RECUPDATETIME,RECCREATEEMPNM,RECUPDATEEMPNM)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?,?)";
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		try {
			PreparedStatement p_insert = conn.prepareStatement(insert);
			conn.setAutoCommit(false);
			for (MDMMATSORTS d : data) {
				p_insert.setString(1, d.getClasscd());
				p_insert.setString(2, d.getClassnm());
				p_insert.setString(3, d.getParentclasscd());
				p_insert.setString(4, d.getClasslevel());
				p_insert.setString(5, d.getRectype());
				p_insert.setString(6, d.getRecnote());
				p_insert.setString(7, d.getSpesorts());
				p_insert.setString(8, d.getClass_id());
				p_insert.setDate(9,  new Date(d.getReccreatetime().getTime()) );
				p_insert.setDate(10, new Date(d.getRecupdatetime().getTime()));
				p_insert.setString(11, "LBMDM");
				p_insert.setString(12, "LBMDM");
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

//	SPESORTS,MATERIALNM,CompanyMatCode ,SPECS,MATERIALCZ,DRAWNO,PRODDETAILS,ITEMNAME,
//	MATERIALSUCHEN,MATERIALSORTNM,PRIMARYUNITNM,STOPFLAG,EDITSTATE,CREATETIME,LASTMODIFIEDTIME,OLDCODE
	
	public static boolean add_mdmmaterials(MDMMATERIALS[] data,String table) {
		String insert = "insert into "+table+"(SPESORTS,PRODUCTCD,PRODDETAILS,PRODUCTNM,PRODUCTSNM,PRODUCTMODEL,"
				+ "PRODUCTMATERIAL,PRODUCTTH,RECTYPE,RECNOTE,"
				+ "PRODUCT_IN_ID,CLASS_ID,UNIT_IN_ID,RECCREATETIME,RECUPDATETIME,RECCREATEEMPNM,RECUPDATEEMPNM)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		try {
			PreparedStatement p_insert = conn.prepareStatement(insert);
			conn.setAutoCommit(false);
			for (MDMMATERIALS d : data) {
				p_insert.setString(1, d.getSPESORTS());
				p_insert.setString(2, d.getProductcd());
				p_insert.setString(3, d.getProddetails());
				p_insert.setString(4, d.getProductnm());
				p_insert.setString(5, d.getProductsnm());
				p_insert.setString(6, d.getProductmodel());
				p_insert.setString(7, d.getProductmaterial());
				p_insert.setString(8, d.getProductth());
				p_insert.setString(9, d.getRectype());
				p_insert.setString(10, d.getRecnote());
				p_insert.setString(11, d.getProduct_in_id());
				p_insert.setString(12, d.getClass_id());
				p_insert.setString(13, d.getUnit_id());
				p_insert.setDate(14, new Date(d.getRECCREATETIME().getTime()));
				p_insert.setDate(15, new Date(d.getRECUPDATETIME().getTime()));
				p_insert.setString(16,"LBMDM");
				p_insert.setString(17, "LBMDM");
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
	
	public static boolean add_mdmmatcom(MDMMATCOM[] data,String table) {
		String insert = "insert into "+table+"(PRODUCT_ID,CLASS_ID,RECTYPE,SPESORTS,"
				+ "RECCREATETIME,RECUPDATETIME,RECCREATEEMPNM,RECUPDATEEMPNM)"
				+ " values(?,?,?,?,?,?,?,?)";
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		try {
			PreparedStatement p_insert = conn.prepareStatement(insert);
			conn.setAutoCommit(false);
			for (MDMMATCOM d : data) {
				p_insert.setString(1, d.getProduct_id());
				p_insert.setString(2, d.getClass_id());
				p_insert.setString(3, d.getRectype());
				p_insert.setString(4, d.getSpesorts());
				p_insert.setDate(5, new Date(d.getRECCREATETIME().getTime()) );
				p_insert.setDate(6, new  Date(d.getRECUPDATETIME().getTime()));
				p_insert.setString(7, "LBMDM");
				p_insert.setString(8, "LBMDM");
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
