import java.io.*;
import java.net.*;
public class Myserver{
public static void main(String arg[]){
	try{
	ServerSocket ss= new ServerSocket(8888);
	Socket s= ss.accept();
	DataInputStream ds= new DataInputStream(s.getInputStream());
	String str=(String) ds.readUTF();
	System.out.println("Message = "+str);
	ss.close();
	}
	catch(Exception e){
		System.out.println(e);
	
		
	}
}
}
