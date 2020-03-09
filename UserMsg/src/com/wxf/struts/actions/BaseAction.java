package com.wxf.struts.actions;

import org.apache.struts.action.Action;
import org.apache.struts.actions.DispatchAction;

import com.wxf.service.MessageManager;
import com.wxf.service.impl.MessageManagerImpl;

public class BaseAction extends Action{

	protected static MessageManager messageManager;
	static {
		try {
			messageManager=new MessageManagerImpl();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
