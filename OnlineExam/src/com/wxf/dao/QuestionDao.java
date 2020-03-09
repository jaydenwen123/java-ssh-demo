package com.wxf.dao;

import java.util.List;

import com.wxf.domain.Question;

public interface QuestionDao extends BaseDao{

	public  List<Question> findAllQuestions();
	
	public  List<Question> findQuestionsWithPage(int pageSize, int pageNow);

	public Integer  getPageCounts(int pageSize);
}
