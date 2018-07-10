//172.16.75.114

import java.io.*;
import java.net.*;
public class MyClient{
public static void main(String a[])
{
  try{

  Socket s=new Socket("172.16.75.114",8888);
  DataOutputStream dos=new DataOutputStream(s.getOutputStream());
  dos.writeUTF("Hello ");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
