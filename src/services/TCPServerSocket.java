package services;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPServerSocket extends Socket {
	public static final Integer port =1990;
	public static  String  IP ;
	
	private static TCPServerSocket tcpServerSocket = new TCPServerSocket();
	static{
		System.out.println("静态块");
		try {
			IP = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			IP = "127.0.0.1";
			e.printStackTrace();
		}
	}
	private TCPServerSocket (){
		
		System.out.println("构造函数");
	}
	
	public static TCPServerSocket getTCPServerSocket(){
		return tcpServerSocket;
	}
	
	public void receiveData(String remoteIP,Integer port){
		
	}
	
	public void sendData(){
		
	}
}
