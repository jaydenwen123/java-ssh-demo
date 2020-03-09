package com.wxf.service;

import java.util.List;

import com.wxf.domain.Income;

public interface IncomeService {

	public  void  addIncome(Income income);
	
	public  void  updateIncome(Income income);
	
	public  void  deleteIncome(Income income);
	
	public  void  deleteById(java.io.Serializable id);
	
	public  List<Income>  getAllIncome();
		
	public  List<Income>  getAllIncomeWithPage(int pageNow,int pageSize);

}
