package com.test.app.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUtil {
	static final String driverName="oracle.jdbc.driver.OracleDriver";
	static final String url="jdbc:oracle:thin:@localhost:1521:xe";
	static final String user="moon";
	static final String pw="1234";

	public static Connection connect() {
		Connection conn=null;
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url,user,pw);
		} catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}
	public static void disconnect(PreparedStatement pstmt, Connection conn) {
		try {

			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}

