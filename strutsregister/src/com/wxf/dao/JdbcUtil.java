package com.wxf.dao;

import java.io.Closeable;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class JdbcUtil {
	
	private static Connection ct = null;
	//大多数情况下用preparedstatement替代statement
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	private static CallableStatement cs = null;
	
	static Properties pros=null;
	static String url="";
	static String user="";
	static String password="";
	static String driver="";
	public static CallableStatement getCs(){
		return cs;
	}

	static{
		pros=new Properties();
		
		try {
			
			pros.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
			url=pros.getProperty("url");
			driver=pros.getProperty("driver");
			user=pros.getProperty("user");
			password=pros.getProperty("password");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static Connection getMySqlConnection(){
		
		try {
//			System.out.println(driver);
			Class.forName(pros.getProperty("driver"));
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ct= DriverManager.getConnection(url,user,password);
			return ct;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static void close(Closeable ...t){
		
		for(Closeable close:t){
			if(null!=t){
				try {
					close.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public  static <T extends Closeable> void   closeAll(T...t){
		for(T close:t){
			if(close!=null){
				try {
					close.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	//*************callPro1存储过程函数1*************
		public static CallableStatement callPro1(String sql,String[] parameters)
		{
			try{
				ct=getMySqlConnection();
				cs = ct.prepareCall(sql);
				if(parameters!=null){
					for(int i=0;i<parameters.length;i++){
						cs.setObject(i+1,parameters[i]);
					}
				}
				cs.execute();
			}
			catch(Exception e) { 
					e.printStackTrace(); 
					throw new RuntimeException(e.getMessage());
				}
			finally
			{
				close(rs,cs,ct);
			}
			return cs;
		}
		//*******************callpro2存储过程2************************
		public static CallableStatement callPro2(String sql,String[] inparameters,
		Integer[] outparameters)
		{
			try
			{
				ct=getMySqlConnection();
				cs = ct.prepareCall(sql);
				if(inparameters!=null)
				{
					for(int i=0;i<inparameters.length;i++)
					{
						cs.setObject(i+1,inparameters[i]);
					}
				}
				//cs.registerOutparameter(2,oracle.jdbc.OracleTypes.CURSOR);
				if(outparameters!=null)
				{
					for(int i=0;i<outparameters.length;i++)
					{
						cs.registerOutParameter(inparameters.length+1+i,outparameters[i]);
					}
				}
				cs.execute();
			}
			catch(Exception e) {
				e.printStackTrace();
				throw new RuntimeException(e.getMessage());
			}
			finally
			{
			}
			return cs;
		}
		public static ResultSet executeQuery(String sql,String[] parameters)
		{
			try
			{
				ct=getMySqlConnection();
				ps=ct.prepareStatement(sql);
				if(parameters!=null)
				{
					for(int i=0;i<parameters.length;i++)
					{
						ps.setString(i+1,parameters[i]);
					}
				}
				rs = ps.executeQuery();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				throw new RuntimeException(e.getMessage());
			}
			finally
			{
			}
			return rs;
		}
		public static List executeQuery1(String sql,String[] parameters)
		{
			List list=new ArrayList();
			try
			{
				ct=getMySqlConnection();
				ps=ct.prepareStatement(sql);
				
				if(parameters!=null)
				{
					for(int i=0;i<parameters.length;i++)
					{
						ps.setString(i+1,parameters[i]);
					}
				}
				rs = ps.executeQuery();
				ResultSetMetaData md=rs.getMetaData();
				int columnCount=md.getColumnCount();
				while(rs.next()){
					Map rowData=new HashMap();
					for(int i=1;i<columnCount;i++){
						rowData.put(md.getColumnName(i), rs.getObject(i));
					}
					list.add(rowData);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				throw new RuntimeException(e.getMessage());
			}
			finally
			{
			}
			return list;
		}
		
		public static void executeUpdate2(String[] sql,String[][] parameters)
		{
			try
			{
				ct=getMySqlConnection();
				ct.setAutoCommit(false);
				for(int i=0;i<sql.length;i++)
				{
					if(null!=parameters[i])
					{
						ps = ct.prepareStatement(sql[i]);
						for(int j=0;j<parameters[i].length;j++)
						{
							ps.setString(j+1,parameters[i][j]);
						}
						ps.executeUpdate();
					}
				}
				ct.commit();
			}catch (Exception e)
			{
					e.printStackTrace();
				try
				{
					ct.rollback();
				}
				catch (SQLException e1)
				{
					e1.printStackTrace();
				}
				throw new RuntimeException(e.getMessage());
				}finally
				{
					close(rs,ps,ct);
				}
		}
		//先写一个update、delete、insert
		//sql格式：update 表名 set 字段名 =？where 字段=？
		//parameter神应该是（”abc“,23）
		public static boolean executeUpdate(String sql,String[] parameters)
		{
			boolean flag=false;
			try
			{
				ct=getMySqlConnection();
				ps = ct.prepareStatement(sql);
				if(parameters!=null)
				{
					for(int i=0;i<parameters.length;i++)
					{
						ps.setString(i+1,parameters[i]);
					}
				}
				ps.executeUpdate();
				flag=true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			//开发阶段
			//抛出异常
			//可以处理，也可以不处理
				flag=false;
			
			}
			finally
			{
				close(rs,ps,ct);
				return flag;
			}
		}
		public static void close(ResultSet rs,Statement ps,Connection ct){
			//关闭资源(先开后关)
			if(rs!=null)
			{
				try
				{
					rs.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				rs=null;
			}
			if(ps!=null)
			{
				try
				{
					ps.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				ps=null;
			}
			if(null!=ct)
			{
				try
				{
					ct.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				ct=null;
			}
		}
		
	/*public static  boolean  save(String sql){
		ct=getMySqlConnection();
		try {
			ps=ct.prepareStatement(sql);
			return 	ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}*/
}
