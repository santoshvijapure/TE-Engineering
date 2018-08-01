import java.net.*;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class server{
	static ArrayList<Student> al=new ArrayList<Student>();
	public static void main(String[] arg){
		try{
			ServerSocket ss= new ServerSocket(8888);
			System.out.println("Server is waiting for client....");
			Socket cs=ss.accept();
			DataOutputStream dout=new DataOutputStream(cs.getOutputStream());
			DataInputStream din=new DataInputStream(cs.getInputStream());
			ObjectOutputStream oout=new ObjectOutputStream(cs.getOutputStream());
			ObjectInputStream oin=new ObjectInputStream(cs.getInputStream());
			Student st=null;
			int rollno;
			operation obj=new operation();
			while(true){
				int ch= din.readInt();
					
				if(ch==1){
					
					st=(Student) oin.readObject();
					obj.addStudent(st);
					dout.writeUTF(al.toString());
					
				}else if(ch==2){
					rollno=din.readInt();
					obj.deleteStudent(rollno);
					dout.writeUTF(al.toString());
						
				}else if(ch==3){
					rollno=din.readInt();
					st=obj.searchStudent(rollno);
					if(st!=null){
						oout.writeObject(st);
					}else{
						oout.writeObject(null);
					     }
				}else if(ch==4){
					double pm=din.readDouble();
					ArrayList<Student> failed=obj.failedStudent(pm);
					dout.writeUTF(failed.toString());
				}else if(ch==5){
					dout.writeUTF("Your Data is succesfully updated in server.................");
					System.out.println("Socket closed");
					cs.close();
					break;
				}
			}
			ss.close();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
