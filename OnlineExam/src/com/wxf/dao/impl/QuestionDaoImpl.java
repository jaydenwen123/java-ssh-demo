package com.wxf.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.transaction.annotation.Transactional;

import com.wxf.dao.QuestionDao;
import com.wxf.domain.Question;

@Transactional
public class QuestionDaoImpl extends BaseDaoImpl implements QuestionDao {

	public List<Question> findAllQuestions() {
		// TODO Auto-generated method stub
		return this.findAll("from Question");
	}

	public List<Question> findQuestionsWithPage(int pageSize, int pageNow) {
		// TODO Auto-generated method stub
		return this.findAllWithPage("from Question order by id", null, pageSize, pageNow);
	}

	public Integer getPageCounts(int pageSize) {
		// TODO Auto-generated method stub
		Object counts=this.getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session arg0) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				Query query=arg0.createQuery("select count(*) from Question");
				return query.uniqueResult();
			}
		});
		Integer totalCounts=Integer.parseInt(counts.toString());
		return (totalCounts-1)/pageSize+1;
	}

}
