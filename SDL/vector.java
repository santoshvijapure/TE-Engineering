import java.util.*;
// this programm show the ddemo of java vectors
class Student{

int rno;
String name;
float marks;

Student(int rno,String name, float marks)
{

this.rno=rno;
this.name=name;
this.marks=marks;
}

public String toString() { 
    return "rollNo: '" + this.rno + "', name: '" + this.name + "', marks: '" + this.marks + "'";
} 
}


class MainClass{
public static void main(String a[])
{
int ch;
int rno;
String name;
float marks;
Vector v = new Vector();

Scanner sc= new Scanner(System.in);
do{
System.out.println("enter your choice \n1.to add student database\n2.display stduent database\n3.delete student database");
ch=sc.nextInt();
switch(ch){
case 1:
{
System.out.println("enter rollno");
rno=sc.nextInt();
System.out.println("enter name");
name=sc.next();
System.out.println("enter marks");
marks=sc.nextFloat();

Student tmpObj = new Student(rno,name,marks);
v.add(tmpObj);
break;
}
case 2:
{
System.out.println(v);
break;
}
case 3:
{
System.out.println("enter the index of student you wants to delete");

v.remove(sc.nextInt());
break;
}

}// end of switch

}while(ch!=0);//end of do while loop
}//emd of main

}//end of class
