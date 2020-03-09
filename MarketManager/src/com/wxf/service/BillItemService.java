package com.wxf.service;



import java.util.List;

import com.wxf.domain.BillItem;

public interface BillItemService {
	
	public  void  addBillItem(BillItem billItem);
	
	public  void  updateBillItem(BillItem billItem);
	
	public  void  deleteBillItem(BillItem billItem);
	
	public  void  deleteById(java.io.Serializable id);
	
	public  List<BillItem>  getAllBillItem();
		
	public  List<BillItem>  getAllBillItemWithPage(int pageNow,int pageSize);
	
	
}
