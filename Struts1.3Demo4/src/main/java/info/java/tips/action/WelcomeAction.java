package info.java.tips.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import info.java.tips.form.WelcomeForm;
import info.java.tips.repository.UserRepository;
import info.java.tips.user.user;

public class WelcomeAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		WelcomeForm welcomeForm = (WelcomeForm) form;
		ActionForward fw = mapping.getInputForward();
		UserRepository user = new UserRepository();
		user users = new user();
		ActionErrors errs = new ActionErrors();
		if (welcomeForm.getAction().equals("update")) {
			users.setPassword(welcomeForm.getPassword());
			user.updatePass(welcomeForm.getPassword(),welcomeForm.getUserid());
			fw = mapping.findForward("update");
		} else if (welcomeForm.getAction().equals("back")) {
			fw = mapping.findForward("back");
		}
		return fw;
	}

}
