package com.wxf.service;

import java.util.List;

import com.wxf.domain.Bill;

public interface BillService {

    public  void  addBill(Bill  bill);
	
	public  void  updateBill(Bill  bill);
	
	public  void  deleteBill(Bill  bill);
	
	public  void  deleteById(java.io.Serializable id);
	
	public  List<Bill>  getAllBill();
		
	public  List<Bill>  getAllBillWithPage(int pageNow,int pageSize);
}
