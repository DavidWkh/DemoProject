package info.java.tips.form;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;

import info.java.tips.repository.UserRepository;
import info.java.tips.user.user;

public class AdminForm extends ActionForm {
	private user user;
	private String action;
	private String userid;
	UserRepository repo = new UserRepository();
	
	public AdminForm(info.java.tips.user.user user, String action, String userid, UserRepository repo) {
		super();
		this.user = user;
		this.action = action;
		this.userid = userid;
		this.repo = repo;
	}

	public AdminForm() {
		super();
	}

	public user getUser() {
		return user;
	}

	public void setUser(user user) {
		this.user = user;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public UserRepository getRepo() {
		return repo;
	}

	public void setRepo(UserRepository repo) {
		this.repo = repo;
	}

	public void createUser(user a) {
		repo.createUser(a);
	}
	
	public List<user> getUsers() {
		List<user> a = new ArrayList<>();
		
		a=repo.getUsers();
		
		return a;
	}
	
	public user getUser(String id) {
		user a = new user();
		
		a=repo.getUser(id);
		
		return a;
	}
	
	public void updateUser(user a) {
		repo.updateUser(a);
	}
	
	public void deleteUser(String id) {
		repo.delete(id);
	}

}
