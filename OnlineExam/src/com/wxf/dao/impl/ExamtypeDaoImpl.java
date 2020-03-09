package com.wxf.dao.impl;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.wxf.dao.ExamtypeDao;
import com.wxf.domain.Examtype;

@Transactional
public class ExamtypeDaoImpl extends BaseDaoImpl implements ExamtypeDao {

	public List<Examtype> findAllExamtypes() {
		// TODO Auto-generated method stub
		return this.findAll("from Examtype");
	}

	public List<Examtype> findExamtypesWithPage(int pageSize,int pageNow) {
		// TODO Auto-generated method stub
		return this.findAllWithPage("from Examtype", null, pageSize, pageNow);
	}


}
