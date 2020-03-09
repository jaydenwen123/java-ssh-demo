package com.service;

public class UserService {

	private  String name;
	private  ByteService  byteService;
	
	
	public ByteService getByteService() {
		return byteService;
	}

	public void setByteService(ByteService byteService) {
		this.byteService = byteService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayhello(){
		System.out.println("UserService.sayhello()");
		byteService.sayByte();
	}
	
}
