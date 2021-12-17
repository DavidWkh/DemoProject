package info.java.tips.action;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import info.java.tips.form.AdminForm;
import info.java.tips.form.CreateForm;
import info.java.tips.repository.UserRepository;
import info.java.tips.user.user;

public class CreateAction extends Action{
@Override
public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
	
	CreateForm createForm = (CreateForm) form;
	AdminForm adminForm = new AdminForm();
	user u = new user();
	UserRepository user = new UserRepository();
	ActionForward fw = mapping.getInputForward();
	ActionErrors errs = new ActionErrors();
	if (createForm.getAction().equals("Register")) {
		if (createForm.getFirstname().isEmpty()) {
			errs.add("", new ActionMessage("fname.msg.err"));
		} else if (createForm.getMiddlename().isEmpty()) {
			errs.add("", new ActionMessage("mname.msg.err"));
		} else if (createForm.getLastname().isEmpty()) {
			errs.add("", new ActionMessage("lname.msg.err"));
		} else if (createForm.getUser_id().isEmpty()) {
			errs.add("", new ActionMessage("userid.msg.err"));
		} else if (createForm.getPassword().isEmpty()) {
			errs.add("", new ActionMessage("password.msg.err"));
		} else if (createForm.getDateofbirth().isEmpty()) {
			errs.add("", new ActionMessage("dob.msg.err"));
		} else if (createForm.getGender().isEmpty()) {
			errs.add("", new ActionMessage("gender.msg.err"));
		} else if (createForm.getEmail().isEmpty()) {
			errs.add("", new ActionMessage("email.msg.err"));
		} else if (createForm.getAddress().isEmpty()) {
			errs.add("", new ActionMessage("address.msg.err"));
		} else if (createForm.getPostcode().isEmpty()) {
			errs.add("", new ActionMessage("postcode.msg.err"));
		} else if (createForm.getState().isEmpty()) {
			errs.add("", new ActionMessage("state.msg.err"));
		} else if (createForm.getCity().isEmpty()) {
			errs.add("", new ActionMessage("city.msg.err"));
		} else if (createForm.getCountry().isEmpty()) {
			errs.add("", new ActionMessage("country.msg.err"));
		} else {
			u.setFname(createForm.getFirstname());
			u.setMname(createForm.getMiddlename());
			u.setLname(createForm.getLastname());
			u.setUserid(createForm.getUser_id());
			u.setPassword(createForm.getPassword());
			u.setDob(createForm.getDateofbirth());
			u.setGender(createForm.getGender());
			u.setEmail(createForm.getEmail());
			u.setAddress(createForm.getAddress());
			u.setPostcode(createForm.getPostcode());
			u.setCity(createForm.getCity());
			u.setState(createForm.getState());
			u.setCountry(createForm.getCountry());
			u.setUser_type(createForm.getUser_type());
			user.createUser(u);
			fw = mapping.findForward("success");
		}
	} else if (createForm.getAction().equals("Back")) {
		fw = mapping.findForward("back");
	}
	List<user> us = adminForm.getUsers();
	request.setAttribute("users", us);
	RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
	rd.forward(request, response);
	saveErrors(request, errs);
	return fw;
}
}
