import java.io.Serializable;
public class Student implements Serializable{
	public int rollno;
	public String name;
	public double marks;
	public Student(int rollno,String name,double marks){
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	public String toString(){
		return"Student [Rollno="+rollno+",Name="+name+",Marks="+marks+"]";
	}
}
