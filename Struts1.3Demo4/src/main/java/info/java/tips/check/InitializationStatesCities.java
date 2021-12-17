package info.java.tips.check;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import info.java.tips.data.CityData;
import info.java.tips.data.StateData;

public class InitializationStatesCities {
	Connection con = null;

	public InitializationStatesCities() {
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

	public ArrayList<CityData> getCities() {
		ArrayList<CityData> city_list = new ArrayList<>();
		String sql = "Select city , city_code from cities";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				CityData a = new CityData();
				a.setCityName(rs.getString(1));
				a.setCityId(rs.getString(2));

				city_list.add(a);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return city_list;
	}

	public ArrayList<CityData> getCities(String state) {
		ArrayList<CityData> city_list = new ArrayList<>();
		String sql = "Select city , city_code from cities where state_code='" + state + "'";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				CityData a = new CityData();
				a.setCityName(rs.getString(1));
				a.setCityId(rs.getString(2));

				city_list.add(a);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return city_list;
	}
	public ArrayList<StateData> getStates() {
		ArrayList<StateData> state_list = new ArrayList<>();
		String sql = "Select state_name , state_code from states";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				StateData a = new StateData();
				a.setStateName(rs.getString(1));
				a.setStateId(rs.getString(2));

				state_list.add(a);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return state_list;
	}
}
