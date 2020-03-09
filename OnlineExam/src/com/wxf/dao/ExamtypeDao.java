package com.wxf.dao;

import java.util.List;
import com.wxf.domain.Examtype;


public interface ExamtypeDao extends BaseDao {

	public  List<Examtype>  findAllExamtypes();
	
	public  List<Examtype>  findExamtypesWithPage(int pageSize,int pageNow);
}
