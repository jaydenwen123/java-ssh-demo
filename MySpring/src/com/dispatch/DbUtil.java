package com.dispatch;

public class DbUtil {

	private  String  name;
	private  String  driverName;
	private  String  url;
	private  String  password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public DbUtil() {
	}
	public DbUtil(String name, String driverName, String url, String password) {
		super();
		this.name = name;
		this.driverName = driverName;
		this.url = url;
		this.password = password;
	}
	
}
