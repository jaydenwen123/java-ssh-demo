package com.wxf.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTomcat {

	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		OutputStream os=null;
		BufferedReader reader=null;
		
		try {
			serverSocket=new ServerSocket(3234);
		while(true){
			System.out.println("server is listening in 3234");
			Socket socket=serverSocket.accept();
			reader=new BufferedReader(new FileReader("F:\\Users\\Workspaces\\MyEclipse 10\\Servlet1\\WebRoot\\MyHtml.html"));
			os=socket.getOutputStream();
			String lineData="";
			while((lineData=reader.readLine())!=null){
				os.write(lineData.getBytes());
				os.flush();
			}
			os.close();
			reader.close();
			Thread.sleep(5000);
			//socket.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
