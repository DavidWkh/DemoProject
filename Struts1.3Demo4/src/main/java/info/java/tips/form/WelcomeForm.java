package info.java.tips.form;

import org.apache.struts.action.ActionForm;

public class WelcomeForm extends ActionForm {
	private String password;
	private String userid;
	private String action;

	public WelcomeForm(String password, String userid, String action) {
		super();
		this.password = password;
		this.userid = userid;
		this.action = action;
	}

	public WelcomeForm() {
		super();
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

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
