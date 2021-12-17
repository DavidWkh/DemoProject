package info.java.tips.check;

import java.sql.*;

public class UserAuthentication {
	Connection con = null;

	public UserAuthentication() {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=Walao";
		String username = "Walao";
		String password = "DavidWkh0323";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public Boolean userExist (String user) {
		String name=null;
		String sql = "select * from strut_user where userid ='" + user+"'";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				name = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		if (name != null)
			return true;
		else
			return false;
	}

	public String getpassword (String user) {
		String pass = null;
		String sql = "select password from strut_user where userid ='" + user+"'";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				pass = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return pass;
	}
	
	public String getUerType (String user) {
		String type = null;
		String sql = "select usertype from strut_user where userid ='" + user+"'";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				type = rs.getString(1);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return type;
	}
}
