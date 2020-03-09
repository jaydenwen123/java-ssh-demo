package com.wxf.service;

import java.util.List;

import com.wxf.domain.Vector;

public interface VectorService {

	public  void  addVector(Vector vector);
	
	public  void  updateVector(Vector vector);
	
	public  void  deleteVector(Vector vector);
	
	public  void  deleteById(java.io.Serializable id);
	
	public  List<Vector>  getAllVector();
		
	public  List<Vector>  getAllVectorWithPage(int pageNow,int pageSize);
}
