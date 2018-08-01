import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
public class MyServer{
	static ArrayList<Student> al=new ArrayList<Student>();
	public static void main(String a[]){
		try{
			ServerSocket ss=new ServerSocket(8888);
			System.out.println("Server is waiting...");
			Socket cs=ss.accept();
			DataInputStream din= new DataInputStream(cs.getInputStream());
			DataOutputStream dout=new DataOutputStream(cs.getOutputStream());
			ObjectOutputStream oout=new ObjectOutputStream(cs.getOutputStream());
			ObjectInputStream oin=new ObjectInputStream(cs.getInputStream());
			Student st=null;
			int rollno;
			Operation obj=new Operation ();
			while(true){
				int ch=din.readInt();
				if(ch==1){
					
					st=(Student) oin.readObject();
					obj.addStudent(st);
					dout.writeUTF(al.toString());
				}/*else if(ch==2){
					rollno=din.readInt();
					obj.deleteStudent(rollno);
					dout.writeUTF(al.toString());
				 }else if(ch==3){
					rollno=dn.readInt();
					st=searchStudent(rollno);
					if(st!=null){
						oout.writeObject(st);
					}else{	
						oout.writeObject(null);
					 }
				 }else if(ch==4){
					double pm=din.readDouble();
					ArrayList<Student> failed=obj.failedStudent(pm);
					dout.writeUTF(failed.toString());
				  }*/else if(ch==2){
					System.out.println("Server Closed");
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
