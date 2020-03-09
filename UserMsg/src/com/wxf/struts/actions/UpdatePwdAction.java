package com.wxf.struts.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

import com.wxf.domain.User;

public class UpdatePwdAction extends BaseDispatchAction {
	
	public ActionForward UpdatePwd(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
			DynaActionForm updatePwdForm=(DynaActionForm) form;
			User user=new User();
			User oldUser=(User) request.getSession().getAttribute("user");
			user.setUsername(oldUser.getUsername());
			user.setId(oldUser.getId());
			user.setEmail(oldUser.getEmail());
			user.setSet(oldUser.getSet());
			String oldPwd=updatePwdForm.getString("oldPwd");
			String newPwd=updatePwdForm.getString("newPwd");
			String againPwd=updatePwdForm.getString("againPwd");
			if (oldPwd.equals(oldUser.getPassword()) 
					&& newPwd.equals(againPwd) && newPwd!=null && (!newPwd.equals(""))) {
				user.setPassword(newPwd);
				try {
					messageManager.updateUser(user);
					request.setAttribute("updateok", "√‹¬Î–ﬁ∏ƒ≥…π¶£°");
					return mapping.findForward("updateok");
				} catch (Exception e) {
					// TODO: handle exception
					request.setAttribute("updateerr", "√‹¬Î–ﬁ∏ƒ ß∞‹£¨«Î÷ÿ–ﬁ–ﬁ∏ƒ£°");
				}
			}
			return mapping.findForward("updateerr");
	}
	
	public ActionForward ToUpdatePwd(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		
		return mapping.findForward("toUpdatePwd");
	}
}
