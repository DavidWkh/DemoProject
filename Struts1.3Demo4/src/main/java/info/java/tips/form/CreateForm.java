package info.java.tips.form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import info.java.tips.check.InitializationStatesCities;
import info.java.tips.data.CityData;
import info.java.tips.data.StateData;

public class CreateForm extends ActionForm {
	private String firstname;
	private String middlename;
	private String lastname;
	private String user_id;
	private String password;
	private String dateofbirth;
	private String gender;
	private String email;
	private String address;
	private String postcode;
	private String city;
	private ArrayList<CityData> citylist;
	private String state;
	private ArrayList<StateData> statelist;
	private String country;
	private String user_type;
	private String action;

	public CreateForm(String firstname, String middlename, String lastname, String user_id, String password,
			String dateofbirth, String gender, String email, String address, String postcode, String city,
			ArrayList<CityData> citylist, String state, ArrayList<StateData> statelist, String country,
			String user_type, String action) {
		super();
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.user_id = user_id;
		this.password = password;
		this.dateofbirth = dateofbirth;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.postcode = postcode;
		this.city = city;
		this.citylist = citylist;
		this.state = state;
		this.statelist = statelist;
		this.country = country;
		this.user_type = user_type;
		this.action = action;
	}

	public CreateForm() {
		super();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public ArrayList<CityData> getCitylist() {
		InitializationStatesCities city = new InitializationStatesCities();
		citylist = city.getCities();
		return citylist;
	}

	public ArrayList<CityData> getCitylist(String State) {
		InitializationStatesCities city = new InitializationStatesCities();
		citylist = city.getCities();
		return citylist;
	}

	public void setCitylist(ArrayList<CityData> citylist) {
		this.citylist = citylist;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;

	}

	public ArrayList<StateData> getStatelist() {
		InitializationStatesCities states = new InitializationStatesCities();
		statelist = states.getStates();
		return statelist;
	}

	public void setStatelist(ArrayList<StateData> statelist) {
		this.statelist = statelist;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

}
