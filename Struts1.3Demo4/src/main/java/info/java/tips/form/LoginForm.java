package info.java.tips.form;

import org.apache.struts.action.ActionForm;

public class LoginForm extends ActionForm {
	private String username;
	private String password;
	private String action;
		
	
	
	public LoginForm(String username, String password, String action) {
		super();
		this.username = username;
		this.password = password;
		this.action = action;
	}

	public LoginForm() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
	
	