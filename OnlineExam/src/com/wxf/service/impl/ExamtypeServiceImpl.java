package com.wxf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.wxf.dao.ExamtypeDao;
import com.wxf.domain.Examtype;
import com.wxf.service.ExamtypeService;

public class ExamtypeServiceImpl implements ExamtypeService {
	
	
	@Resource
	private ExamtypeDao examtypeDao;
	
	
	public ExamtypeDao getExamtypeDao() {
		return examtypeDao;
	}

	public void setExamtypeDao(ExamtypeDao examtypeDao) {
		this.examtypeDao = examtypeDao;
	}

	public void addExamtype(Examtype examtype) {
		// TODO Auto-generated method stub
		examtypeDao.add(examtype);
	}

	public void updateExamtype(Examtype examtype) {
		// TODO Auto-generated method stub
		examtypeDao.update(examtype);
	}

	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		examtypeDao.deleteById(Examtype.class, id);
	}

	/*public void deleteByName(String name) {
		// TODO Auto-generated method stub
		examtypeDao.dele
	}*/

	public List<Examtype> findAllWithPage(int pageSize, int pageNow) {
		// TODO Auto-generated method stub
		return examtypeDao.findExamtypesWithPage(pageSize, pageNow);
	}

}
