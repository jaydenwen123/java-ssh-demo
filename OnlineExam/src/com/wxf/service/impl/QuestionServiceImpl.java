package com.wxf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.wxf.dao.QuestionDao;
import com.wxf.domain.Question;
import com.wxf.service.QuestionService;

public class QuestionServiceImpl implements QuestionService {

	@Resource
	private  QuestionDao questionDao;
	public QuestionDao getQuestionDao() {
		return questionDao;
	}

	public void setQuestionDao(QuestionDao questionDao) {
		this.questionDao = questionDao;
	}

	public void AddQuestion(Question question) {
		// TODO Auto-generated method stub
		questionDao.add(question);
	}

	public void updateQuestion(Question question) {
		// TODO Auto-generated method stub
		questionDao.update(question);
		
	}

	public void deleteQuestioin(Question question) {
		// TODO Auto-generated method stub
		questionDao.delete(question);
	}

	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		questionDao.deleteById(Question.class, id);
	}

	public Question findById(Integer id) {
		// TODO Auto-generated method stub
		return (Question) questionDao.findById(Question.class, id);
	}

	
	public List<Question> findWithPage(int pageSize, int pageNow) {
		// TODO Auto-generated method stub
		return questionDao.findQuestionsWithPage(pageSize, pageNow);
	}

	public Integer getQuestionCounts(int pageSize) {
		// TODO Auto-generated method stub
		return questionDao.getPageCounts(pageSize);
	}

	public List<Question> findAll() {
		// TODO Auto-generated method stub
		return questionDao.findAllQuestions();
	}

}




