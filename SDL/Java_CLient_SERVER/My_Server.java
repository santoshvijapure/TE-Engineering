import java.net.Socket;
import java.util.*;
import java.io.*;

public class client{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		try{
			Socket cs=new Socket("Localhost",8888);
			DataOutputStream dout=new DataOutputStream(cs.getOutputStream());
			DataInputStream din=new DataInputStream(cs.getInputStream());
			ObjectOutputStream oout=new ObjectOutputStream(cs.getOutputStream());
			ObjectInputStream oin=new ObjectInputStream(cs.getInputStream());
			int ch;
			String name;
			int rollno;
			double marks;
			Student st=null;
			while(true){
				System.out.println("\n*********************Select choice***********************");
				System.out.println("\n\t1.Add Student");
				System.out.println("\n\t2.Delete Student");
				System.out.println("\n\t3.Search Student");
				System.out.println("\n\t4.Failed Student");
				System.out.println("\n\t5.Exit");
				System.out.println("\n-------------------------------------------------------");
				System.out.println("\nEnter Your choice==> ");
				ch=sc.nextInt();
				dout.writeInt(ch);
				switch(ch){
					case 1:
						System.out.println("\nEnter Roll NO:- ");
						rollno=sc.nextInt();
						System.out.println("\nEnter Name:- ");
						name=sc.next();
						System.out.println("\nEnter Marks:-  ");
						marks=sc.nextDouble();
						st=new Student(rollno, name, marks);
						oout.writeObject(st);
						System.out.println("\nAdded Succesfully \n\tCurrent Student==> "+din.readUTF());
						break;
					case 2:
						System.out.println("\nEnter roll No to be remove:- ");
						rollno=sc.nextInt();
						dout.writeInt(rollno);
						System.out.println("\nDeleted Succesfully\t"+rollno+"\nCurrent Student List"+din.readUTF());
						break;
					case 3:
						System.out.println("\nEnter rollno to have Searched:- ");
						rollno=sc.nextInt();
						dout.writeInt(rollno);
						Student s=(Student) oin.readObject();
						if(s!=null){
							System.out.print("\nSearched Student==> "+s);
						}
						else{
							System.out.println("User not Found");
						}
						break;
					case 4:
						System.out.println("Enter passing marks:- ");
						double pm=sc.nextDouble();
						dout.writeDouble(pm);
						System.out.println("\nFailed List"+din.readUTF());
						break;
				
				}
				if(ch==5){
					System.out.println(din.readUTF());
				break;
				}
			}
		}catch(IOException e){
				e.printStackTrace();
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
	}
	
}




