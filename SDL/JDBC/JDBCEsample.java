import java.sql.*;
 
class DBDemo {
 
    private static final String url = "jdbc:mysql://localhost/studDB"; //studDB is database
 
    private static final String user = "root";//mysql id
 
    private static final String password = "123";//mysql password
 
    public static void main(String args[]) {
        try {
  String que="select * from studtab" ;
             String sql1 = "insert into studtab values (1,'Santosh',40)";
             String sql2 = "insert into studtab values (2,'Swapnil',30)";
             String sql3 = "insert into studtab values (3,'Shantanu',45)";
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("connection Successfull!!!");
	    Statement stmt = con.createStatement();
	    //ResultSet rs = stmt.executeQuery("");
 	    stmt.executeUpdate(sql1);
    stmt.executeUpdate(sql2);
    stmt.executeUpdate(sql3);	
         // System.out.println("\n table created");
        ResultSet rs = stmt.executeQuery(que) ;  

	while(rs.next())	
	{
 		System.out.println(" "+ rs.getString(1)+" "+ rs.getString(2)+" "+ rs.getString(3));
        }

 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
