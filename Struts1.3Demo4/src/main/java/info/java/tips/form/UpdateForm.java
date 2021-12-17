package info.java.tips.form;

import org.apache.struts.action.ActionForm;

import info.java.tips.user.user;

public class UpdateForm extends ActionForm {
	private String fname;
	private String mname;
	private String lname;
	private String userid;
	private String password;
	private String dob;
	private String gender;
	private String email;
	private String address;
	private String postcode;
	private String city;
	private String state;
	private String country;
	private String user_type;
	private String action;

	public UpdateForm(String fname, String mname, String lname, String userid, String password, String dob,
			String gender, String email, String address, String postcode, String city, String state, String country,
			String user_type, String action) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.userid = userid;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.postcode = postcode;
		this.city = city;
		this.state = state;
		this.country = country;
		this.user_type = user_type;
		this.action = action;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
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

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public UpdateForm() {
		super();
	}

}
