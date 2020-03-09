package com.wxf.struts.actions;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.wxf.struts.form.MessageForm;
import com.wxf.domain.Message;
import com.wxf.domain.User;

public class DealMessageAction extends BaseDispatchAction {

	public ActionForward ToCenter(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		return mapping.findForward("toCenter");
	}
	public ActionForward ToSelectShowWay(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		return mapping.findForward("toSelectWay");
	}
	
	
	public ActionForward ShowMessageList1(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		int pageNow =1;
		String pageNowStr=request.getParameter("pageNow");
		if(pageNowStr!=null && !pageNowStr.equals("")){
			pageNow=Integer.parseInt(pageNowStr);
		}
		User user=(User) request.getSession().getAttribute("user");
		List<Message> list=messageManager.showMsg(user.getId(),3, pageNow);
		int pageCounts=messageManager.getPageCounts(3,user.getId());
		request.setAttribute("messages", list);
		request.setAttribute("pageCounts", pageCounts);
		return mapping.findForward("showMessageList1");
	}
	
	
	public ActionForward ShowMessageList2(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		int pageNow;
		User user=(User) request.getSession().getAttribute("user");
		int pageCounts=messageManager.getPageCounts(3,user.getId());
		String pageNowStr=request.getParameter("pageNow");
		if(pageNowStr==null || pageNowStr.equals("")){
			pageNow=1;
		}
		try {
			pageNow=Integer.parseInt(pageNowStr);
		} catch (Exception e) {
			// TODO: handle exception
			pageNow=1;
		}
		if(pageNow>pageCounts){
			pageNow=pageCounts;
		}
		List<Message> list=messageManager.showMsg(user.getId(),3, pageNow);
		int total=messageManager.getTotalCounts(user.getId());
		request.setAttribute("messages", list);
		request.setAttribute("pageCounts", pageCounts);
		request.setAttribute("total", total);
		request.setAttribute("pageNow", pageNow);
		return mapping.findForward("showMessageList2");
	}
	
	
	public ActionForward ShowMessage(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		String m_id=request.getParameter("m_id");
		Message msg=messageManager.getMessageById(Integer.parseInt(m_id));
		request.setAttribute("msg", msg);
		return mapping.findForward("showMessage");
	}
	
	
	public ActionForward ToPubMessage(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		
		return mapping.findForward("toPubMsg");
	}
	
	
	
	public ActionForward PubMessage(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {

		MessageForm messageFrom=(MessageForm) form;
		Message message=new Message();
		String title=messageFrom.getTitle();
		String msg="";
		if(!title.equals("") && title!=null)
		{
			message.setTitle(title);			
			message.setContent(messageFrom.getContent());
			message.setPubDate(new Date());
			message.setUser((User) request.getSession().getAttribute("user"));
			try {
				messageManager.pubMsg(message);
				msg="留言发表成功,请继续发表留言";
			} catch (Exception e) {
				// TODO: handle exception
				msg=msg+"留言发表失败";
			}

			request.setAttribute("msg", msg);
			return mapping.findForward("toPubMsg");
		}
		msg="留言的标题不能为空！";
		request.setAttribute("msg", msg);
		return mapping.findForward("toPubMsg");
	}
	
	public ActionForward ToUpdateMessage(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		String m_id=request.getParameter("m_id");
		request.getSession().setAttribute("m_id", m_id);
		Message msg=messageManager.getMessageById(Integer.parseInt(m_id));
		request.setAttribute("msg", msg);
		return mapping.findForward("toUpdateMsg");
	}
	
	
	public ActionForward UpdateMessage(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		MessageForm msgForm=(MessageForm) form;
		Message message=new Message();
		message.setTitle(msgForm.getTitle());
		message.setContent(msgForm.getContent());
		message.setPubDate(new Date());
		message.setId(Integer.parseInt(request.getSession().getAttribute("m_id").toString()));
		message.setUser((User) request.getSession().getAttribute("user"));
		String msg="";
		String title=msgForm.getTitle();
		System.out.println(title);
		if(!title.equals("") && title!=null){
			try {
				messageManager.updateMessage(message);
				return mapping.findForward("operok");
			} catch (Exception e) {
				// TODO: handle exception
				return mapping.findForward("opererror");
			}
		}
		return mapping.findForward("delerror");
		
	}
	
	
	public ActionForward DeleteMessage(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		String id=request.getParameter("m_id");
		try {
			
			messageManager.deleteMessage(Integer.parseInt(id));
		} catch (Exception e) {
			// TODO: handle exception
			return mapping.findForward("opererror");
		}
		
		return mapping.findForward("operok");
	}
	
		
}
