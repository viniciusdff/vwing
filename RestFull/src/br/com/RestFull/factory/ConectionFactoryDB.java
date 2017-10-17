package br.com.RestFull.factory;

import java.sql.*;

public class ConectionFactoryDB {
	
	private static final String dirverMySQL = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/mysql";
	private static final String userDB = "valida";
	private static final String passwordDB = "valida";
	
	public Connection criaConexao() {
		Connection conn = null;
		try {
			Class.forName(this.dirverMySQL);
			conn = DriverManager.getConnection(URL, userDB, passwordDB);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return conn;		
	}

	public void fechaConexao (Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (conn != null) {
				conn.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if( rs != null) {
				rs.close();
			}
				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
