package info.java.tips.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import info.java.tips.user.user;

public class UserRepository {
	Connection con = null;

	public UserRepository() {
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

	public List<user> getUsers() {
		List<user> users = new ArrayList<>();
		String sql = "select * from strut_user";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				user a = new user();
				a.setFname(rs.getString(1));
				a.setMname(rs.getString(2));
				a.setLname(rs.getString(3));
				a.setUserid(rs.getString(4));
				a.setPassword(rs.getString(5));
				a.setDob(rs.getString(6));
				a.setGender(rs.getString(7));
				a.setEmail(rs.getString(8));
				a.setAddress(rs.getString(9));
				a.setPostcode(rs.getString(10));
				a.setCity(rs.getString(11));
				a.setState(rs.getString(12));
				a.setCountry(rs.getString(13));
				a.setUser_type(rs.getString(14));
				users.add(a);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return users;
	}

	public user getUser(String user_id) {
		user a = new user();
		String sql = "select * from strut_user where userid='" + user_id + "'";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				a.setFname(rs.getString(1));
				a.setMname(rs.getString(2));
				a.setLname(rs.getString(3));
				a.setUserid(rs.getString(4));
				a.setPassword(rs.getString(5));
				a.setDob(rs.getString(6));
				a.setGender(rs.getString(7));
				a.setEmail(rs.getString(8));
				a.setAddress(rs.getString(9));
				a.setPostcode(rs.getString(10));
				a.setCity(rs.getString(11));
				a.setState(rs.getString(12));
				a.setCountry(rs.getString(13));
				a.setUser_type(rs.getString(14));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return a;
	}

	public void createUser(user a1) {
		String sql = "insert into strut_user values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, a1.getFname());
			st.setString(2, a1.getMname());
			st.setString(3, a1.getLname());
			st.setString(4, a1.getUserid());
			st.setString(5, a1.getPassword());
			st.setString(6, a1.getDob());
			st.setString(7, a1.getGender());
			st.setString(8, a1.getEmail());
			st.setString(9, a1.getAddress());
			st.setString(10, a1.getPostcode());
			st.setString(11, a1.getCity());
			st.setString(12, a1.getState());
			st.setString(13, a1.getCountry());
			st.setString(14, a1.getUser_type());
			st.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void updateUser(user a1) {
		String sql = "update  strut_user set fname = ?, mname = ?,lname = ?, password=?, dob = ?, gender = ?, email = ?, address = ?, postcode = ?, city = ?, state = ?, country = ?, usertype = ? where userid = ?";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, a1.getFname());
			st.setString(2, a1.getMname());
			st.setString(3, a1.getLname());
			st.setString(4, a1.getPassword());
			st.setString(5, a1.getDob());
			st.setString(6, a1.getGender());
			st.setString(7, a1.getEmail());
			st.setString(8, a1.getAddress());
			st.setString(9, a1.getPostcode());
			st.setString(10, a1.getCity());
			st.setString(11, a1.getState());
			st.setString(12, a1.getCountry());
			st.setString(13, a1.getUser_type());
			st.setString(14, a1.getUserid());
			st.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void updatePass(String password, String userid) {
		String sql = "update  strut_user set password=? where userid = ?";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, password);
			st.setString(2, userid);
			st.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void changeUserType(String userid) {
		user u = new user();
		String sql = "update  strut_user set usertype = ? where alien_id = ?";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, u.getUser_type());
			st.setString(1, userid);
			st.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void delete(String userid) {

		String sql = "delete from strut_user where userid = ?";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, userid);
			st.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
