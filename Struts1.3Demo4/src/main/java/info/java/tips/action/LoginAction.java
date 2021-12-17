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

import info.java.tips.check.UserAuthentication;
import info.java.tips.form.AdminForm;
import info.java.tips.form.LoginForm;
import info.java.tips.user.user;

public class LoginAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		LoginForm loginForm = (LoginForm) form;
		AdminForm adminForm = new AdminForm();
		UserAuthentication user = new UserAuthentication();
		ActionForward fw = mapping.getInputForward();
		ActionErrors errs = new ActionErrors();
		System.out.println(loginForm.getAction());
		if (loginForm.getAction().equals("login")) {
			if (!loginForm.getUsername().isEmpty() && !loginForm.getPassword().isEmpty()) {
				if (user.userExist(loginForm.getUsername()) == true) {
					if (user.getpassword(loginForm.getUsername()).equals(loginForm.getPassword())) {
						if(user.getUerType(loginForm.getUsername()).equals("admin")) {
							fw = mapping.findForward("admin");
							List<user> users = adminForm.getUsers();
							request.setAttribute("users", users);
							RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
							rd.forward(request, response);
						}else {
							fw = mapping.findForward("success");
							user u = adminForm.getUser(loginForm.getUsername());
							request.setAttribute("user", u);
							RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
							rd.forward(request, response);
						}
					} else {
						errs.add("", new ActionMessage("wpassword.msg.err"));
					}
				} else {
					errs.add("", new ActionMessage("wusername.msg.err"));
				}
			} else if (loginForm.getUsername().isEmpty() && loginForm.getPassword().isEmpty()) {
				errs.add("", new ActionMessage("noinput.msg.err"));
			} else if (loginForm.getUsername().isEmpty()) {
				errs.add("", new ActionMessage("nousername.msg.err"));
			} else {
				errs.add("", new ActionMessage("nopassword.msg.err"));
			}
		} else if (loginForm.getAction().equals("register")) {
			fw = mapping.findForward("reg");
		}
		loginForm.setUsername(null);
		loginForm.setPassword(null);
		saveErrors(request, errs);
		
		return fw;
	}
}
