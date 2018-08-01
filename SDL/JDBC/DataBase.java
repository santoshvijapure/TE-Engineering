import java.sql.*;//Drivers package 
import java.util.*;//for scanner
class DataBase
      {
         
      public static void main(String a[])
      {//start of main
      
      try{
      int ch;
      Scanner sc = new Scanner(System.in);
      Class.forName("com.mysql.jdbc.Driver");   // to initialize the JDBC driver
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Student","root","123");//to select the databse
      Statement st;//object of Statement class to fire the sql Queries 
      ResultSet rs;//to itterate the fetched table
      st=con.createStatement();//initialize the Statement
     /* st.executeUpdate("create table Student(RollNo int,name varchar(100),marks double)"); only for first tiem to create the table */
      do{
      System.out.println("******************************************");      
      System.out.println("enter your choice\n1.to add the student in databsae\n2.to display all student in database\n3.to delete the perticular Student from database\n4.to searh the perticular student in database\n0.exit");
      System.out.println("******************************************");      
      ch=sc.nextInt();
      switch(ch){
         case 1:
            System.out.println("\nenter roll no");
            int RollNo=sc.nextInt();
           System.out.println("\nenter name");
            String name=sc.next();
           System.out.println("\nEnter marks");
            float marks=sc.nextFloat();
            String tempString="insert into Student values('"+RollNo+"','"+name+"','"+marks+"')";
            st.executeUpdate(tempString);
            System.out.println("\n 1 row affected!!!"); 
            break;
         case 2:
            rs=st.executeQuery("select * from Student"); 
            System.out.println("--------------------------------------------");      
            System.out.println("\trollno\tname\tmarks");  
            while (rs.next())
            {
            System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
            }
            System.out.println("--------------------------------------------");      
            break; 
         case 3:
            System.out.println("\nEnter the roll no you want to delete");
            int r = sc.nextInt();
            st.executeUpdate("delete from Student where RollNo="+r);
            System.out.println("\n 1 row affected!!!");
            break;
         case 4:
            System.out.println("\nEnter the roll no of student you wants to search");
            int RN = sc.nextInt();
            rs=st.executeQuery("select * from Student where RollNo="+RN); 
            System.out.println("--------------------------------------------");      
            System.out.println("\trollno\tname\tmarks");  
            while (rs.next())
            {
            System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
            }
            System.out.println("--------------------------------------------");      
      } //end of switch     
      }while (ch!=0);//end of do while
      
      }catch(Exception e)
      {
      System.out.println(e);
      }//end of try-catch
      finally{
      con.close();
      sc.close();
      }
      }//end of MAIN        
      }//end of Class
