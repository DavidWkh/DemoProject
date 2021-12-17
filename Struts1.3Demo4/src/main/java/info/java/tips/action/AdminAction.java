package info.java.tips.action;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import info.java.tips.form.AdminForm;
import info.java.tips.user.user;

public class AdminAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		AdminForm adminForm = (AdminForm) form;
		ActionForward fw = mapping.getInputForward();
		if (adminForm.getAction().equals("back")) {
			fw = mapping.findForward("back");
			System.out.println(adminForm.getAction());
		} else if (adminForm.getAction().equals("create")) {
			fw = mapping.findForward("create");
			System.out.println(adminForm.getAction());
		} else if (adminForm.getAction().equals("update")) {
			fw = mapping.findForward("update");
			user a = adminForm.getUser(adminForm.getUserid());		
			request.setAttribute("user", a);
		} else if (adminForm.getAction().equals("delete")) {
			fw = mapping.findForward("delete");
			adminForm.deleteUser(adminForm.getUserid());
		}
		List<user> u = adminForm.getUsers();
		request.setAttribute("users", u);
		return fw;
	}

}
