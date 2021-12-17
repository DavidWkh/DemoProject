package info.java.tips.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import info.java.tips.form.RegisterForm;
import info.java.tips.repository.UserRepository;
import info.java.tips.user.user;

public class RegisterAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		RegisterForm registerForm = (RegisterForm) form;
		user u = new user();
		UserRepository user = new UserRepository();
		ActionForward fw = mapping.getInputForward();
		ActionErrors errs = new ActionErrors();
		if (registerForm.getAction().equals("Register")) {
			if (registerForm.getFirstname().isEmpty()) {
				errs.add("", new ActionMessage("fname.msg.err"));
			} else if (registerForm.getMiddlename().isEmpty()) {
				errs.add("", new ActionMessage("mname.msg.err"));
			} else if (registerForm.getLastname().isEmpty()) {
				errs.add("", new ActionMessage("lname.msg.err"));
			} else if (registerForm.getUser_id().isEmpty()) {
				errs.add("", new ActionMessage("userid.msg.err"));
			} else if (registerForm.getPassword().isEmpty()) {
				errs.add("", new ActionMessage("password.msg.err"));
			} else if (registerForm.getDateofbirth().isEmpty()) {
				errs.add("", new ActionMessage("dob.msg.err"));
			} else if (registerForm.getGender().isEmpty()) {
				errs.add("", new ActionMessage("gender.msg.err"));
			} else if (registerForm.getEmail().isEmpty()) {
				errs.add("", new ActionMessage("email.msg.err"));
			} else if (registerForm.getAddress().isEmpty()) {
				errs.add("", new ActionMessage("address.msg.err"));
			} else if (registerForm.getPostcode().isEmpty()) {
				errs.add("", new ActionMessage("postcode.msg.err"));
			} else if (registerForm.getState().isEmpty()) {
				errs.add("", new ActionMessage("state.msg.err"));
			} else if (registerForm.getCity().isEmpty()) {
				errs.add("", new ActionMessage("city.msg.err"));
			} else if (registerForm.getCountry().isEmpty()) {
				errs.add("", new ActionMessage("country.msg.err"));
			} else {
				u.setFname(registerForm.getFirstname());
				u.setMname(registerForm.getMiddlename());
				u.setLname(registerForm.getLastname());
				u.setUserid(registerForm.getUser_id());
				u.setPassword(registerForm.getPassword());
				u.setDob(registerForm.getDateofbirth());
				u.setGender(registerForm.getGender());
				u.setEmail(registerForm.getEmail());
				u.setAddress(registerForm.getAddress());
				u.setPostcode(registerForm.getPostcode());
				u.setCity(registerForm.getCity());
				u.setState(registerForm.getState());
				u.setCountry(registerForm.getCountry());
				u.setUser_type("user");
				user.createUser(u);
				fw = mapping.findForward("success");
			}
		} else if (registerForm.getAction().equals("Back")) {
			fw = mapping.findForward("back");
		}
		saveErrors(request, errs);
		return fw;
	}

}
