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

import info.java.tips.form.AdminForm;
import info.java.tips.form.UpdateForm;
import info.java.tips.repository.UserRepository;
import info.java.tips.user.user;

public class UpdateAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		UpdateForm updateForm = (UpdateForm) form;
		AdminForm adminForm = new AdminForm();
		UserRepository user = new UserRepository();
		user users = new user();
		ActionForward fw = mapping.getInputForward();
		ActionErrors errs = new ActionErrors();
		if (updateForm.getAction().equals("update")) {
			users.setFname(updateForm.getFname());
			users.setMname(updateForm.getMname());
			users.setLname(updateForm.getLname());
			users.setUserid(updateForm.getUserid());
			users.setPassword(updateForm.getPassword());
			users.setDob(updateForm.getDob());
			users.setGender(updateForm.getGender());
			users.setEmail(updateForm.getEmail());
			users.setAddress(updateForm.getAddress());
			users.setPostcode(updateForm.getPostcode());
			users.setCity(updateForm.getCity());
			users.setState(updateForm.getState());
			users.setCountry(updateForm.getCountry());
			users.setUser_type(updateForm.getUser_type());
			user.updateUser(users);
			fw = mapping.findForward("update");

		} else if (updateForm.getAction().equals("back")) {
			fw = mapping.findForward("back");
		}
		List<user> u = adminForm.getUsers();
		request.setAttribute("users", u);
		return fw;
	}
}
