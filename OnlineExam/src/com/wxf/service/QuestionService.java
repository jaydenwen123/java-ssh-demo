
package com.wxf.service;

import java.util.List;

import com.wxf.domain.Question;

public interface QuestionService {

	public  void AddQuestion(Question question);
	
	public  void  updateQuestion(Question question);
	
	public  void  deleteQuestioin(Question question);
	
	public  void  deleteById(Integer id);
	
	public  Question findById(Integer id);
	
	public  List<Question> findWithPage(int pageSize, int pageNow);

	public  Integer getQuestionCounts(int pageSize);
	
	public  List<Question> findAll();
}
