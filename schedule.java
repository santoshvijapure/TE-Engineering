import java.util.*;


class Procces{
int arrival;
int burst;
int waiting;


}


class Schedule{
	public static void main(String arg[])
	{
	int avg;
	Procces[] p=new Procces[10];
	int procNo;
	Scanner sc=new Scanner(System.in);
		System.out.println("enter no of procces");
		procNo=sc.nextInt();		
		void acceptProcces()
		{
			for(int i=0;i<=procNo;i++)
				{
				System.out.println("enter the arrival time for procces"+i);
					p[i].arrival=sc.nextInt();						
				/*System.out.println("enter thearrival time for procces"+i);
						p[i].procces=sc.nextInt();*/						
				System.out.println("enter the burst time for procces"+i);
					p[i].burst=sc.nextInt();						
				}
		}

		void waitingTime()
		{
			for(int i=0;i<=procNo;i++)
				{
						p[i].waiting=p[i].burst-p[i].arrival;			
				}
		}
		void dislpayProc()
		{
			for(int i=0;i<=procNo;i++)
				{
				System.out.println("the arrival time for procces"+i+"is"+p[i].procces);
				System.out.println("the burst time for procces"+i+"is"+p[i].burst);						
				System.out.println("the waiting time for procce"+i+"is"+p[i].waiting);	
				}
		}
		
		acceptProcces();
		waitingTime();
		dislpayProc();


	}

}
