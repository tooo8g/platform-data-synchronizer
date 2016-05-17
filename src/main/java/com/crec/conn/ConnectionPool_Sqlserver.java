package com.crec.conn;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionPool_Sqlserver {
	private ComboPooledDataSource ds;
	private static ConnectionPool_Sqlserver pool;

	private ConnectionPool_Sqlserver() throws Exception {
		Properties props = new Properties();
		InputStream in = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("c3p0.properties");
		props.load(in);
		in.close();
		ds = new ComboPooledDataSource();
		ds.setDriverClass(props.getProperty("c3p0_sqlserver.driverClass"));
		ds.setJdbcUrl(props.getProperty("c3p0_sqlserver.jdbcUrl"));
		ds.setUser(props.getProperty("c3p0_sqlserver.user"));
		ds.setPassword(props.getProperty("c3p0_sqlserver.password"));

		ds.setInitialPoolSize(Integer.parseInt(props
				.getProperty("c3p0.initialPoolSize")));
		ds.setMinPoolSize(Integer.parseInt(props
				.getProperty("c3p0.minPoolSize")));
		ds.setAcquireIncrement(Integer.parseInt(props
				.getProperty("c3p0.acquireIncrement")));
		ds.setMaxPoolSize(Integer.parseInt(props
				.getProperty("c3p0.maxPoolSize")));
		ds.setMaxIdleTime(Integer.parseInt(props
				.getProperty("c3p0.maxIdleTime")));
		ds.setAcquireRetryAttempts(Integer.parseInt(props
				.getProperty("c3p0.acquireRetryAttempts")));
		ds.setAcquireRetryDelay(Integer.parseInt(props
				.getProperty("c3p0.acquireRetryDelay")));
	}

	public static final ConnectionPool_Sqlserver getInstance() {
		if (pool == null) {
			try {
				pool = new ConnectionPool_Sqlserver();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return pool;
	}

	public synchronized final Connection getConnection() {
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
