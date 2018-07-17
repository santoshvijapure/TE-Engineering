import java.util.ArrayList;
public class operation{
	boolean addStudent(Student st){
		boolean status =false;
		status = server.al.add(st);
		return status;
	}
	boolean deleteStudent(int rollno){
		boolean status =false;
		for(Student s: server.al){
			if(s.rollno==rollno){
			int index=server.al.indexOf(s);
			server.al.remove(index);
			status=true;
			break;
			}
		}return status;
	}
	Student searchStudent(int rollno){
		Student st=null;
		for(Student s:server.al){
			if(s.rollno==rollno){
				st=s;
				break;
			}
		}
	return st;
	}
	ArrayList<Student> failedStudent(double pm){	
		ArrayList<Student> failed=new ArrayList<Student>();
		for(Student s:server.al){
			if(s.marks<pm){
				failed.add(s);
			}
		}
	return failed;
	}
}
